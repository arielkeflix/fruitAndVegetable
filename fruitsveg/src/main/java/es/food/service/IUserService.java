package es.food.service;

import java.util.List;

import es.food.dto.UserDTO;

public interface IUserService {
	
	public List<UserDTO> listAllUsers();
	public void updateLastSession(String username);
}
