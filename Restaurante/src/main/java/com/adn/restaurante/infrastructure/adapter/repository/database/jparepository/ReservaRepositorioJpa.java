package com.adn.restaurante.infrastructure.adapter.repository.database.jparepository;

import org.springframework.stereotype.Repository;

import com.adn.restaurante.infrastructure.adapter.repository.database.jpaentity.ReservaEntity;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface ReservaRepositorioJpa extends CrudRepository<ReservaEntity, Long>{
	
}
