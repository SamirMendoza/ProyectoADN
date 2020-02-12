package com.adn.restaurante.infrastructure.adapter.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.adn.restaurante.domain.model.Reserva;
import com.adn.restaurante.domain.ports.RepositorioReserva;
import com.adn.restaurante.infrastructure.adapter.repository.database.jparepository.ReservaRepositorioJpa;
import com.adn.restaurante.infrastructure.adapter.repository.database.mapper.ReservaMapper;


@Repository
@Transactional
public class RepositorioReservaImpl implements RepositorioReserva {
	
	ReservaRepositorioJpa reservaRepositorioJpa;
	
	public RepositorioReservaImpl(ReservaRepositorioJpa reservaRepositorioJpa) {
		this.reservaRepositorioJpa = reservaRepositorioJpa;
	}

	@Override
	public void save(Reserva reserva) {
		reservaRepositorioJpa.save(ReservaMapper.aEntidad(reserva));
	}

	@Override
	public List<Reserva> findAll() {
		return ReservaMapper.aDomino(reservaRepositorioJpa.findAll());
	}

	
	
}
