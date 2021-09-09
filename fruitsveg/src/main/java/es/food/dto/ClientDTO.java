package es.food.dto;

import java.io.Serializable;
import java.util.UUID;

//import es.food.dao.Address;
//import es.food.dao.User;

public class ClientDTO implements Serializable{

	
	
	private UUID id;
	private String dni;
	private String name;
	private String surname;
//	private Address address;
//	private User user;
	public ClientDTO() {
		
	}
	public ClientDTO(String dni, String name, String surname) {
		
		this.dni = dni;
		this.name = name;
		this.surname = surname;
	}
	
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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



	private static final long serialVersionUID = 1L;
}
