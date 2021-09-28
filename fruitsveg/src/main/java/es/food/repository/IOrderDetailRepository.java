package es.food.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.food.dao.OrderDetail;


@Repository
public interface IOrderDetailRepository extends JpaRepository <OrderDetail, UUID> {
		

}
