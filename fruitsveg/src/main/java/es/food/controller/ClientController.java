package es.food.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.food.dto.ClientDTO;
import es.food.service.IClientService;


@RestController
@RequestMapping("/api/client")
public class ClientController {
	
	@Autowired
	IClientService clientService;	
	
	@GetMapping()
	public Map<String, Object> getClients(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		try {
			List<ClientDTO> clientList = clientService.getAllClients();			
			
			map.put("success", "true");
			map.put("message", "clients found");
			map.put("client", clientList);	
		} catch (Exception e) {
			map.put("success", "false");
			map.put("message", e.getMessage());
		}
		
		return map;
	}


}
