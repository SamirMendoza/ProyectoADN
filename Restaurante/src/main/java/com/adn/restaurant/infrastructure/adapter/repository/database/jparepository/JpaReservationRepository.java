package com.adn.restaurant.infrastructure.adapter.repository.database.jparepository;

import org.springframework.stereotype.Repository;

import com.adn.restaurant.infrastructure.adapter.repository.database.jpaentity.JpaReservation;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface JpaReservationRepository extends CrudRepository<JpaReservation, Long>{
	
}
