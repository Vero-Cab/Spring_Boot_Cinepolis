package com.mx.Cinepolis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Cinepolis.model.Pelicula;

//Dao--- es un intermediario entre la aplicacionn y la BD
//se ocupan los repositorios de Spring Data JPARepository y CrudRepository
//estos ya contienen los metodos CRUD

public interface PeliculaDao extends JpaRepository<Pelicula, Integer>{

}
