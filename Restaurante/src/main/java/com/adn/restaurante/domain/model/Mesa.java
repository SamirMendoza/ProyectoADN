package com.adn.restaurante.domain.model;

import java.util.Date;

public class Mesa {
	
	private Long id;
	private boolean disponibilidad;
	private Date fechaDisponible;
	
	
	public Mesa(Long id, boolean disponibilidad, Date fechaDisponible) {
		super();
		this.id = id;
		this.disponibilidad = disponibilidad;
		this.fechaDisponible = fechaDisponible;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public Date getFechaDisponible() {
		return fechaDisponible;
	}

	public void setFechaDisponible(Date fechaDisponible) {
		this.fechaDisponible = fechaDisponible;
	}
	
}
