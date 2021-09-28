package es.food.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import es.food.dao.Order;


public interface IOrderRepository extends JpaRepository<Order, UUID>{

}
