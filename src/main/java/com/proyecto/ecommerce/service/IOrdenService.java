package com.proyecto.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.ecommerce.model.Orden;
import com.proyecto.ecommerce.model.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	List<Orden> findByUsuario(Usuario usuario);
	Optional<Orden> findById(Integer id);
	Orden save(Orden orden);
	String generarNumeroOrden();
	
}
