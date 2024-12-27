package com.mx.Cinepolis.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Cinepolis.model.Pelicula;

//Dao--- es un intermediario entre la aplicacionn y la BD
//se ocupan los repositorios de Spring Data JPARepository y CrudRepository
//estos ya contienen los metodos CRUD

public interface PeliculaDao extends JpaRepository<Pelicula, Integer>{
	
	//si quiere reaalizar cualquioer operacion ya no con el ID, es hacen de las 2 formas:
	
//1. Crear metodos trabajando bajo el resorte de los repositorios-----finby
	
	public List<Pelicula> findByNombre(String nombre);
	
	
//2. 
}
