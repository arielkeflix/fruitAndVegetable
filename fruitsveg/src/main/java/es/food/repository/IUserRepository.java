package es.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.food.dao.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
	
boolean existsByUsername(String username);	
	
	User findByUsername(String username);

}
