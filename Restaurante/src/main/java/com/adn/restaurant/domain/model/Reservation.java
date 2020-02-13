package com.adn.restaurant.domain.model;

import java.util.Date;

public class Reservation {
	
	private Long codigo;
	private Long idMesa;
	private Date fechaSolicitud;
	private Date fechaReserva;
	private double precio;
	private String nombre;
	

	public Reservation(Long idMesa, Date fechaSolicitud, Date fechaReserva, double precio, String nombre) {
		super();
		this.idMesa = idMesa;
		this.fechaSolicitud = fechaSolicitud;
		this.fechaReserva = fechaReserva;
		this.precio = precio;
		this.nombre = nombre;
	}

	public Reservation(Long codigo, Long idMesa, Date fechaSolicitud, Date fechaReserva, double precio, String nombre) {
		super();
		this.codigo = codigo;
		this.idMesa = idMesa;
		this.fechaSolicitud = fechaSolicitud;
		this.fechaReserva = fechaReserva;
		this.precio = precio;
		this.nombre = nombre;
	}



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
	
	
	
}
