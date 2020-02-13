package com.adn.restaurant.infrastructure.adapter.repository.database.jpaentity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.adn.restaurant.domain.model.Reservation;

@Entity (name = "reserva")

public class JpaReservation extends Reservation{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column
	private Long idMesa;
	@Column
	private Date fechaSolicitud;
	@Column
	private Date fechaReserva;
	@Column
	private double precio;
	@Column
	private String nombre;
	
	

	public Long getCodigo() {
		return codigo;
	}



	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}



	public Long getIdMesa() {
		return idMesa;
	}



	public void setIdMesa(Long idMesa) {
		this.idMesa = idMesa;
	}



	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}



	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}



	public Date getFechaReserva() {
		return fechaReserva;
	}



	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public JpaReservation(Long idMesa, Date fechaSolicitud, Date fechaReserva, double precio, String nombre) {
		super(idMesa, fechaSolicitud, fechaReserva, precio, nombre);
	}
	
	

	
	

}
