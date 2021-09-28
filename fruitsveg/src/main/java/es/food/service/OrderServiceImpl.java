package es.food.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.food.dao.Order;
import es.food.dto.OrderDTO;
import es.food.exceptions.ArgumentNotFoundException;
import es.food.repository.IOrderRepository;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired 
	IOrderRepository orderRepository;
	
	ModelMapper modelMapper = new ModelMapper();

	@Override
	@Transactional(readOnly = true)
	public List<OrderDTO> findAllOrders() {
		if (orderRepository.findAll().isEmpty()) {
			throw new ArgumentNotFoundException("No orders found");
		}
			return orderRepository.findAll().stream()
					.map(order -> modelMapper
					.map(order, OrderDTO.class))
					.collect(Collectors.toList());
		
	}

	@Override
	public OrderDTO createOrder(Order order) {
		
		orderRepository.save(order);
				
		return 	modelMapper.map(order, OrderDTO.class);
				
	}


}
