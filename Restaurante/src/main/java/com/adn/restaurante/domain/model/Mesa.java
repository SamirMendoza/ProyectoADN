package com.adn.restaurante.domain.model;

public class Mesa {
	
	private int id;
	private boolean disponibilidad;
	
	
	public Mesa(int id, boolean disponibilidad) {
		super();
		this.id = id;
		this.disponibilidad = disponibilidad;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
	
}
