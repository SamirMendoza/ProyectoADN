package com.adn.restaurante.application.caseuse;

import java.util.List;


import com.adn.restaurante.domain.exception.ReservaException;
import com.adn.restaurante.domain.model.Reserva;
import com.adn.restaurante.domain.model.validation.ValidacionesReserva;
import com.adn.restaurante.domain.ports.RepositorioMesa;
import com.adn.restaurante.domain.ports.RepositorioReserva;


public class ServicioReservaImpl implements IServicioReserva {

	private static final String CREADO = "Creado Exitosamente";
	private static final String NO_CREAR_FIN_SEMANA_IMPAR = "No es posible realizar la reserva para el fin de semana, porque la mesa es Impar";
	private static final String NO_CREAR_PRIMOS_SIN_ANTELACION = "No es posible realizar la reserva, porque la mesa es numero primo y no cuenta con minimo 3 dias de antelacion";

	
	private RepositorioReserva repositorioReserva;
	private RepositorioMesa repositorioMesa;

	public ServicioReservaImpl(RepositorioReserva repositorioReserva, RepositorioMesa repositorioMesa) {
		this.repositorioReserva = repositorioReserva;
		this.repositorioMesa = repositorioMesa;
	}
	
	@Override
	public String create(Reserva reserva) {
		try {
			if (ValidacionesReserva.validacionPrimo(reserva.getIdMesa(), reserva.getFechaSolicitud(), reserva.getFechaReserva()))
				throw new ReservaException(NO_CREAR_PRIMOS_SIN_ANTELACION);
					
			if (ValidacionesReserva.validacionImpar(reserva.getIdMesa(), reserva.getFechaReserva()))
				throw new ReservaException(NO_CREAR_FIN_SEMANA_IMPAR);
			
			if (ValidacionesReserva.validacionPar(reserva.getIdMesa(), reserva.getFechaReserva()))
				reserva.setPrecio(ValidacionesReserva.darDescuento(reserva.getPrecio()));
			
			repositorioReserva.save(reserva);
			repositorioMesa.actualizarEstado(reserva.getIdMesa(), false);
			return CREADO;
			
		}catch(Exception e){
			return "Error: "+e.getMessage();
		}
	}

	@Override
	public List<Reserva> findAll() {
		return repositorioReserva.findAll();
	}
}
