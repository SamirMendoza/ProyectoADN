package com.adn.restaurant.domain.exception;

public class ReservationException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
		
		public ReservationException(String message) {
			super(message);
		}
}
