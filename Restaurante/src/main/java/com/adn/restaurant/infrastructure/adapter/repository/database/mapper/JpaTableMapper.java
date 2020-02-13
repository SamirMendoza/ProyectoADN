package com.adn.restaurant.infrastructure.adapter.repository.database.mapper;

import org.springframework.stereotype.Component;

import com.adn.restaurant.domain.model.Table;
import com.adn.restaurant.infrastructure.adapter.repository.database.jpaentity.JpaTable;

@Component
public class JpaTableMapper {
	
	private JpaTableMapper() {
		
	}
	
	public static Table aDomino(JpaTable entity) {
		return new Table(entity.getId(), entity.isDisponibilidad(), entity.getFechaDisponible());			
	}
	
	public static JpaTable aEntidad(Table dominio) {		
		return new JpaTable(dominio.getId(), dominio.isDisponibilidad(), dominio.getFechaDisponible());			
	}
}
