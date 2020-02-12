package com.adn.restaurante.domain.ports;


import com.adn.restaurante.domain.model.Mesa;

public interface RepositorioMesa {
	
	/**
	 * Permite obtener una mesa dado un codigo
	 * @param id
	 * @return 
	 */
	Mesa obtenerPorId(int id);

	/**
	 * Permite agregar una mesa al repositorio
	 * @param mesa
	 */
	void agregar(Mesa mesa);
	
	/**
	 * Permite actualizar disponibilidad de una mesa en el repositorio
	 * @param estado
	 */
	void actualizarEstado(Long idMesa, boolean estado);
}
