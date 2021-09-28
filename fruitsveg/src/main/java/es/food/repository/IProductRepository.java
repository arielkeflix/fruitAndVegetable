package es.food.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.food.dao.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

//	Long countByName(String name);
//	
//	Product findByName(String name);
//
//	boolean existsByName(String name);
//	
//	List<Product> findAllByCategoriesName(String name);
}
