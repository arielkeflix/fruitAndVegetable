package es.food.dto;

import java.io.Serializable;
import java.util.UUID;

public class ClientDTO implements Serializable{	
	
	private UUID id;
	private String name;
	private String surname;
	private AddressDto address;
	private UserDTO user;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}	
	public AddressDto getAddress() {
		return address;
	}
	public void setAddress(AddressDto address) {
		this.address = address;
	}	
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}






	private static final long serialVersionUID = 1L;
}
