package com.adn.restaurant.domain.ports;


import com.adn.restaurant.domain.model.Table;

public interface TableRepository {
	
	/**
	 * Permite obtener una mesa dado un codigo
	 * @param id
	 * @return 
	 */
	Table obtenerPorId(int id);

	/**
	 * Permite agregar una mesa al repositorio
	 * @param mesa
	 */
	void agregar(Table mesa);
	
	/**
	 * Permite actualizar disponibilidad de una mesa en el repositorio
	 * @param estado
	 */
	void actualizarEstado(Long idMesa, boolean estado);
}
