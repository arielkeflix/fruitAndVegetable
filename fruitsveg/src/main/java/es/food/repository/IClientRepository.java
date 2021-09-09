package es.food.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.food.dao.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, UUID>{

}
