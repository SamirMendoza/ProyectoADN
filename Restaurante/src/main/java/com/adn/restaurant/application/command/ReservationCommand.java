package com.adn.restaurant.application.command;

import java.util.Date;

public class ReservationCommand {
	
	private Long idMesa;
	private Date fechaSolicitud;
	private Date fechaReserva;
	private double precio;
	private String nombre;
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
