package com.proyecto.ecommerce.service;

import java.util.*;

import com.proyecto.ecommerce.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	public List<Producto> findAll(); 
}
