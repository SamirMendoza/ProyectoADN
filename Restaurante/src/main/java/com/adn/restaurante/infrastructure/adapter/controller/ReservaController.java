package com.adn.restaurante.infrastructure.adapter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adn.restaurante.application.caseuse.IServicioReserva;
import com.adn.restaurante.domain.model.Reserva;

@Controller
@RequestMapping(path = "/restaurante")
public class ReservaController {
	
	@Autowired
	public IServicioReserva servicioReserva;
	
	@PostMapping(path = "/create")
	public @ResponseBody String createR(@RequestBody Reserva reserva){ return servicioReserva.create(reserva);}
	
	@GetMapping(path = "/all")
	public @ResponseBody List<Reserva> getActiveEmployees() { return servicioReserva.findAll();}

}
	