package es.food.service;

import java.util.List;

import es.food.dao.Order;
import es.food.dto.OrderDTO;

public interface IOrderService {
	
	public List<OrderDTO> findAllOrders();
	public OrderDTO createOrder(Order order) ;

}
