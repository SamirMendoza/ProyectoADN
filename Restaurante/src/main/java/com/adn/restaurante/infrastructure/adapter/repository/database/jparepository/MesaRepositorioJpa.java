package com.adn.restaurante.infrastructure.adapter.repository.database.jparepository;

import org.springframework.data.repository.CrudRepository;

import com.adn.restaurante.infrastructure.adapter.repository.database.jpaentity.MesaEntity;

public interface MesaRepositorioJpa extends CrudRepository<MesaEntity, Long>{

}
