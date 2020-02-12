package com.adn.restaurante.infrastructure.adapter.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.adn.restaurante.domain.model.Mesa;
import com.adn.restaurante.domain.ports.RepositorioMesa;
import com.adn.restaurante.infrastructure.adapter.repository.database.jpaentity.MesaEntity;
import com.adn.restaurante.infrastructure.adapter.repository.database.jparepository.MesaRepositorioJpa;

@Repository
@Transactional
public class RepositorioMesaImpl implements RepositorioMesa {
	
	MesaRepositorioJpa mesaRepositorioJpa;
	
	public RepositorioMesaImpl(MesaRepositorioJpa mesaRepositorioJpa) {
		super();
		this.mesaRepositorioJpa = mesaRepositorioJpa;
	}

	@Override
	public Mesa obtenerPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Mesa mesa) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actualizarEstado(Long idMesa, boolean estado) {
		Optional<MesaEntity> mesa = mesaRepositorioJpa.findById(idMesa);
		 
	}

	

}
