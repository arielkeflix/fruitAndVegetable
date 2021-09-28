package es.food.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.food.dao.User;
import es.food.dto.UserDTO;
import es.food.exceptions.ArgumentNotFoundException;
import es.food.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserRepository userRepository;
		
	ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<UserDTO> listAllUsers() {
		
		if (userRepository.findAll().isEmpty()) {
			throw new ArgumentNotFoundException("No users found. ");
		}
		List<UserDTO> listUserDTO =  userRepository.findAll().stream()
				.map(user -> modelMapper
				.map(user, UserDTO.class))
				.collect(Collectors.toList());
		return listUserDTO;
	}
	public void updateLastSession(String username) {
		User user = userRepository.findByUsername(username);
		user.setLastSession(LocalDateTime.now());
	}

}
