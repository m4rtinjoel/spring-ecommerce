package com.proyecto.ecommerce.controller;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.ecommerce.model.Producto;
import com.proyecto.ecommerce.model.Usuario;
import com.proyecto.ecommerce.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoControllador {
	
	private final Logger LOGGER=LoggerFactory.getLogger(ProductoControllador.class); 
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("")
	public String show() {
		return "productos/show";
	}
	
	@GetMapping("/create")
	public String create() {
		return "productos/create";
	}
	
	@PostMapping("/save")
	public String save(Producto producto) {
		LOGGER.info("Este es objeto producto {}",producto);
		Usuario	usuario=new Usuario(1,"","","","","","","");
		producto.setUsuario(usuario);
		productoService.save(producto);
		return "redirect:/productos";
	}

}
