package com.adn.restaurante.infrastructure.adapter.repository.database.mapper;

import org.springframework.stereotype.Component;

import com.adn.restaurante.domain.model.Mesa;
import com.adn.restaurante.infrastructure.adapter.repository.database.jpaentity.MesaEntity;

@Component
public class MesaMapper {
	
	private MesaMapper() {
		
	}
	
	public static Mesa aDomino(MesaEntity entity) {
		return new Mesa(entity.getId(), entity.isDisponibilidad(), entity.getFechaDisponible());			
	}
	
	public static MesaEntity aEntidad(Mesa dominio) {		
		return new MesaEntity(dominio.getId(), dominio.isDisponibilidad(), dominio.getFechaDisponible());			
	}
}
