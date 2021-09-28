package es.food.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.food.dto.MessageDTO;
import es.food.dto.UserDTO;
import es.food.security.entity.JwtLogin;
import es.food.security.entity.JwtResponse;
import es.food.security.service.UserDetailServiceImpl;
import es.food.security.service.jwt.JwtUtil;
import es.food.service.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserServiceImpl userService;	
	@Autowired
	UserDetailServiceImpl userDetailService;	
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	JwtUtil jwtUtil;
	
	@GetMapping("/users")
	public Map<String, Object> getUsers(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		try {
			List<UserDTO> userList = userService.listAllUsers();			
			
			map.put("success", "true");
			map.put("message", "users found");
			map.put("user", userList);	
			
		} catch (Exception e) {
			map.put("success", "false");
			map.put("message", e.getMessage());
		}
		
		
		return map;
	}
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@Valid @RequestBody JwtLogin jwtLogin){
		JwtResponse jwtResponse;
		UserDetails userDetails;
System.out.println("entrando al login");
		try {
			/*
			SecurityContextHolder.getContext()
					.setAuthentication(authenticate(jwtLogin.getUsername(), jwtLogin.getPassword()));
			 */
			userDetails = userDetailService.loadUserByUsername(jwtLogin.getUsername());

			SecurityContextHolder.getContext()
					.setAuthentication(authenticate(jwtLogin.getUsername(), jwtLogin.getPassword()));
			
			// Update User lastSession after successful login
			userService.updateLastSession(userDetails.getUsername());

		} catch (Exception e) {
			MessageDTO messageDto = new MessageDTO("False", e.getMessage());
			return ResponseEntity.unprocessableEntity().body(messageDto);
		}

		final String token = jwtUtil.generateToken(userDetails);
		
		// Create JSON to Response to client.
		jwtResponse = new JwtResponse(token, jwtLogin.getUsername(), userDetails.getAuthorities());
		return new ResponseEntity<>(jwtResponse, HttpStatus.OK);
	

	}
private Authentication authenticate(String username, String password) throws Exception {

	try {
		return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
	} catch (DisabledException e) {
		throw new DisabledException("User disabled");
	} catch (BadCredentialsException e) {
		throw new BadCredentialsException("Invalid user credentials");
	}
}

}
