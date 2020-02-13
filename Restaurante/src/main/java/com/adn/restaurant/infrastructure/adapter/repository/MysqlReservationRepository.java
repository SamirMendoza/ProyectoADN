package com.adn.restaurant.infrastructure.adapter.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.adn.restaurant.domain.model.Reservation;
import com.adn.restaurant.domain.ports.ReservationRepository;
import com.adn.restaurant.infrastructure.adapter.repository.database.jparepository.JpaReservationRepository;
import com.adn.restaurant.infrastructure.adapter.repository.database.mapper.JpaReservationMapper;


@Repository
@Transactional
public class MysqlReservationRepository implements ReservationRepository {
	
	JpaReservationRepository reservaRepositorioJpa;
	
	public MysqlReservationRepository(JpaReservationRepository reservaRepositorioJpa) {
		this.reservaRepositorioJpa = reservaRepositorioJpa;
	}

	@Override
	public void save(Reservation reserva) {
		reservaRepositorioJpa.save(JpaReservationMapper.aEntidad(reserva));
	}

	@Override
	public List<Reservation> findAll() {
		return JpaReservationMapper.aDomino(reservaRepositorioJpa.findAll());
	}

	
	
}
