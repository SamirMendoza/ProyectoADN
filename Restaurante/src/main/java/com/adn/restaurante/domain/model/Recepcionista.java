package com.adn.restaurante.domain.model;

import com.adn.restaurante.domain.repository.RepositorioMesa;
import com.adn.restaurante.domain.repository.RepositorioReserva;

public class Recepcionista {
	
	private RepositorioMesa repositorioMesa;
	private RepositorioReserva repositorioReserva;
	
	
	public Recepcionista(RepositorioMesa repositorioMesa, RepositorioReserva repositorioReserva) {
		super();
		this.repositorioMesa = repositorioMesa;
		this.repositorioReserva = repositorioReserva;
	}
	
	
	
}
