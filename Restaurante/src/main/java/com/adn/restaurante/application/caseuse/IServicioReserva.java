package com.adn.restaurante.application.caseuse;

import java.util.List;

import com.adn.restaurante.domain.model.Reserva;

public interface IServicioReserva{
	
	public String create(Reserva reserva);
	public List<Reserva> findAll();
	
}
