package com.adn.restaurante.domain.repository;

import com.adn.restaurante.domain.model.Mesa;

public interface RepositorioMesa {
	
	/**
	 * Permite obtener un producto dado un codigo
	 * @param id
	 * @return 
	 */
	Mesa obtenerPorId(int id);

	/**
	 * Permite agregar un producto al repositorio
	 * @param mesa
	 */
	void agregar(Mesa mesa);
}
