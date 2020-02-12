package com.adn.restaurante.domain.ports;

import java.util.List;

import com.adn.restaurante.domain.model.Reserva;

public interface RepositorioReserva {
	
	/**
	 * Permite agregar una reserva al repositorio de reserva
	 * @param reserva
	 */
	void save(Reserva reserva);
	
	/**
	 * Permite enviar todaslas reservas creadas
	 * @param
	 * @return List<Reserva>
	 */
	public List<Reserva> findAll();
}
