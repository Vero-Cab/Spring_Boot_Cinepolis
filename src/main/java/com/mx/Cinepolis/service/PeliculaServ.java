package com.mx.Cinepolis.service;
//aqui es como el de metodos interface, se crean los metodos o funciones

import java.util.List;

import com.mx.Cinepolis.model.Pelicula;

public interface PeliculaServ {
	
	public List<Pelicula> listar();
	
	public void guardar(Pelicula peliculas);
	
	public Pelicula buscar (int idPelicula);
	
	public void editar(Pelicula peliculas);
	
	public void eliminar(int idPelicula);
	
	public List<Pelicula> buscarXnombre(String nombre); //por resorte findBy
	
	public List<Pelicula> buscaXprecio (Float precio); //mi metodo de logica
	
	


}

