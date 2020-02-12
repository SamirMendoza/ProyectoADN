package com.adn.restaurante.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.adn.restaurante.application.caseuse.IServicioReserva;
import com.adn.restaurante.application.caseuse.ServicioReservaImpl;
import com.adn.restaurante.infrastructure.adapter.repository.RepositorioMesaImpl;
import com.adn.restaurante.infrastructure.adapter.repository.RepositorioReservaImpl;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public IServicioReserva getServicioReservae(RepositorioReservaImpl repositorioReservaImpl, RepositorioMesaImpl repositorioMesaImpl) {
		return new ServicioReservaImpl(repositorioReservaImpl, repositorioMesaImpl);
	}
	
}
