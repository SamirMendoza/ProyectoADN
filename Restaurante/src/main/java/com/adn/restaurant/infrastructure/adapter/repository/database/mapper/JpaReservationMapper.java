package com.adn.restaurant.infrastructure.adapter.repository.database.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.adn.restaurant.domain.model.Reservation;
import com.adn.restaurant.infrastructure.adapter.repository.database.jpaentity.JpaReservation;


@Component
public class JpaReservationMapper {
	
	
	private JpaReservationMapper() {
		
	}
	
	public static  JpaReservation aEntidad(Reservation dominio) {
		return new JpaReservation(dominio.getIdMesa(), dominio.getFechaSolicitud(), dominio.getFechaReserva(),
				dominio.getPrecio(), dominio.getNombre());
	}
	
	public static Reservation aDomino(JpaReservation entity) {	
		return (Reservation) entity;
	}

	public static List<Reservation> aDomino(Iterable<JpaReservation> entity) {
		List<Reservation> dominio = new ArrayList<>();
		entity.forEach(a -> dominio.add((Reservation)a));
		return dominio;
	}
}

