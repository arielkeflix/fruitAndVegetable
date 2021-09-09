package es.food.dto;

import java.io.Serializable;
import java.util.UUID;

import es.food.dao.Address;
//import es.food.dao.User;

public class ClientDTO implements Serializable{

	
	
	private UUID id;
	private String name;
	private String surname;
	private AddressDto address;
//	private User user;
	
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





	private static final long serialVersionUID = 1L;
}
