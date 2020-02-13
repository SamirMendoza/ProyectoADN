package com.adn.restaurant.infrastructure.adapter.repository.database.jparepository;

import org.springframework.data.repository.CrudRepository;

import com.adn.restaurant.infrastructure.adapter.repository.database.jpaentity.JpaTable;

public interface JpaTableRepository extends CrudRepository<JpaTable, Long>{

}
