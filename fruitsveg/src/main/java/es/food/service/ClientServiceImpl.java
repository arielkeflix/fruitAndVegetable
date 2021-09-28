package es.food.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;


import es.food.dto.ClientDTO;
import es.food.exceptions.ArgumentNotFoundException;
import es.food.repository.IClientRepository;

@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	IClientRepository clientRepository;
	
	ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<ClientDTO> getAllClients() {
		
		if (clientRepository.findAll().isEmpty()) {
			throw new ArgumentNotFoundException("No clients found. ");
		}
		List<ClientDTO> listClientDTO =  clientRepository.findAll().stream()
				.map(client -> modelMapper
				.map(client, ClientDTO.class))
				.collect(Collectors.toList());
		return listClientDTO;
	}

}
