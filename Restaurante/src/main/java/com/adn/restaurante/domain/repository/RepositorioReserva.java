package com.adn.restaurante.domain.repository;

import com.adn.restaurante.domain.model.Reserva;

public interface RepositorioReserva {
	
	/**
	 * Permite agregar una reserva al repositorio de reserva
	 * @param reserva
	 */
	void agregar(Reserva reserva);
	
	/**
	 * Permite eliminar una reserva del repositorio de reserva
	 * @param codigo
	 */
	void eliminar(int codigo);
	
	/**
	 * Permite obtener una reserva por el codigo de la reserva
	 * @param codigo
	 */
	Reserva obtener(int codigo);
}
