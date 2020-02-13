package com.adn.restaurant.infrastructure.adapter.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.adn.restaurant.domain.model.Table;
import com.adn.restaurant.domain.ports.TableRepository;
import com.adn.restaurant.infrastructure.adapter.repository.database.jpaentity.JpaTable;
import com.adn.restaurant.infrastructure.adapter.repository.database.jparepository.JpaTableRepository;

@Repository
@Transactional
public class MysqlTableRepository implements TableRepository {
	
	JpaTableRepository mesaRepositorioJpa;
	
	public MysqlTableRepository(JpaTableRepository mesaRepositorioJpa) {
		super();
		this.mesaRepositorioJpa = mesaRepositorioJpa;
	}

	@Override
	public Table obtenerPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Table mesa) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actualizarEstado(Long idMesa, boolean estado) {
		Optional<JpaTable> mesa = mesaRepositorioJpa.findById(idMesa);
		 
	}

	

}
