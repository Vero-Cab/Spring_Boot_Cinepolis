package com.mx.Cinepolis.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Cinepolis.model.Pelicula;
import com.mx.Cinepolis.service.PeliculaServImp;

@RestController
@RequestMapping(path = "PeliculaWebService")
@CrossOrigin
public class PeliculaWebService {

	@Autowired
	PeliculaServImp imp; //invocamos al implements (metodos) y generamos variable imp
	

	//para probar la peticion debemos formar nuestra URL PORQUE ESTAOS USANDO EL PROTOCOLO HTTP
	
	
	//PARA FORMAR LA URL ES URLservidorLocal/pathClase/Pathmetodo
	//http://localhost:9000/PeliculaWebService/listar
	
	//http://localhost:9000/PeliculaWebService/listar
	//PETICION PARA LISTAR
	@GetMapping(path = "listar") 	//Peticion Get para listar
	public List<Pelicula> listar(){
		return imp.listar();
	}
	
     //@RequestBody---- Convierte el JSON A Objeto para guardar
	//creo la URL igual a la de arriba, solo cambio el metodo
	//http://localhost:9000/PeliculaWebService/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Pelicula peliculas){
		imp.guardar(peliculas);
	}
	

}


