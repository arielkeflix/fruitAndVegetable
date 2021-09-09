package es.food.dao;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
@Table(name = "clients")

public class Client {	

	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id")
	@Type(type="uuid-char")
	private UUID id;

	@NotBlank(message = "DNI is mandatory")
	@Column(unique = true)
	private String dni;
	
	@NotBlank(message = "Name  is mandatory")
	private String name;
	
	
	@NotBlank(message = "Surname is mandatory")
	private String surname;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id", unique = true)
	@NotNull(message = "You have to assign this client to an address")
	//@Valid
	private Address address;	

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "user_id", referencedColumnName = "id", unique = true, nullable = false)
//	@NotNull(message = "You have to assign this client to an user")
//	@Valid
//	private User user;

	public Client() {

	}

	public Client(String dni,  String name,String surname, Address address) {//public Client(String dni,  String name,String surname, Address address, User user) {
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.address = address;
//		this.user = user;
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
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

}