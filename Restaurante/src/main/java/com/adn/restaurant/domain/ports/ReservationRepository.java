package com.adn.restaurant.domain.ports;

import java.util.List;

import com.adn.restaurant.domain.model.Reservation;

public interface ReservationRepository {
	
	/**
	 * Permite agregar una reserva al repositorio de reserva
	 * @param reserva
	 */
	void save(Reservation reserva);
	
	/**
	 * Permite enviar todaslas reservas creadas
	 * @param
	 * @return List<Reserva>
	 */
	public List<Reservation> findAll();
}
