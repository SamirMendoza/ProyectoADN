package com.adn.restaurante.infrastructure.adapter.repository.database.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.adn.restaurante.domain.model.Reserva;
import com.adn.restaurante.infrastructure.adapter.repository.database.jpaentity.ReservaEntity;


@Component
public class ReservaMapper {
	
	
	private ReservaMapper() {
		
	}
	
	public static  ReservaEntity aEntidad(Reserva dominio) {
		return new ReservaEntity(dominio.getIdMesa(), dominio.getFechaSolicitud(), dominio.getFechaReserva(), dominio.getPrecio(), dominio.getNombre());
	}
	
	public static Reserva aDomino(ReservaEntity entity) {	
		return (Reserva) entity;
	}

	public static List<Reserva> aDomino(Iterable<ReservaEntity> entity) {
		List<Reserva> dominio = new ArrayList<>();
		entity.forEach(a -> dominio.add((Reserva)a));
		return dominio;
	}
}

