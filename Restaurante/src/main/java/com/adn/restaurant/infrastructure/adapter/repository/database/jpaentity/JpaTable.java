package com.adn.restaurant.infrastructure.adapter.repository.database.jpaentity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.adn.restaurant.domain.model.Table;


@Entity (name = "mesa")

public class JpaTable extends Table{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private boolean disponibilidad;
	@Column
	private Date fechaDisponible;
	
	
	
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

	public JpaTable(Long id, boolean disponibilidad, Date fechaDisponible) {
		super(id, disponibilidad, fechaDisponible);
	}
	
	
}
