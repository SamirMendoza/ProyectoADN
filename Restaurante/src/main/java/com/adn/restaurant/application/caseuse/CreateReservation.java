package com.adn.restaurant.application.caseuse;

import org.springframework.stereotype.Service;

import com.adn.restaurant.application.command.ReservationCommand;
import com.adn.restaurant.domain.model.Reservation;

@Service
public class CreateReservation {
	
	
	public CreateReservation() {
		
	}
	
	public Reservation create(ReservationCommand reservationCommand) {
		Reservation reservation = new Reservation(reservationCommand.getIdMesa(), reservationCommand.getFechaSolicitud(), reservationCommand.getFechaReserva(), reservationCommand.getPrecio(), reservationCommand.getNombre());
		
		
		
		return reservation;
	}
	
}
