package es.food.service;

import java.util.List;
import java.util.UUID;


import es.food.dto.ClientDTO;


public interface IClientService {

//	public static ClientDTO createClient(Client client) throws Exception {
//		
//		return null;
//	} //CREATE - Adds new client to the Database
//	
//	public ClientDTO createFastClient(ClientDTO client) throws Exception; // CREATE - Adds a new client without needing an username. Only for admin purposes.
//	
	public List<ClientDTO> getAllClients(); // READ - full list of all clients
//	
//	public List<ClientDTO> getPageOfClients(int page, int amount); // READ - Get a page of X clients
//	
//	public Client findClientById(UUID id); //READ - finds the client by Id
//		
//	public ClientDTO updateClient(Client client) throws Exception; //UPDATE - Updates clients info
//	
//	public ClientDTO deleteClient(UUID id); //DELETE - deletes client
//
//	List<ClientDTO> listAllUsers();
//
//	Client findByDni(String dni);
//
//	boolean existsByDni(String dni);
//
//	MessageDTO getErrorMessageDniExists(String dni);

}
