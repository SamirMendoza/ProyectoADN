package com.adn.restaurante.domain.model;

import java.util.Date;

public class Reserva {
	
	private int codigo;
	private Mesa mesa;
	private Date fechaSolicitud;
	private Date fechaReserva;
	private double precio;
	
	
	
	public Reserva(Mesa mesa) {
		super();
		this.fechaSolicitud = new Date();
		this.mesa = mesa;
	}

	public Reserva(int codigo, Mesa mesa, Date fechaSolicitud, Date fechaReserva, double precio) {
		super();
		this.codigo = codigo;
		this.mesa = mesa;
		this.fechaSolicitud = fechaSolicitud;
		this.fechaReserva = fechaReserva;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
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
	
	
	
	
	
}
