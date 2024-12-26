package com.mx.Cinepolis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.Cinepolis.dao.PeliculaDao;
import com.mx.Cinepolis.model.Pelicula;

@Service
public class PeliculaServImp implements PeliculaServ{
	

	@Autowired 
	PeliculaDao dao;
	
	@Transactional(readOnly = true) //sololectura
	@Override
	public List<Pelicula> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();//el intermediario lee todos los datos metodo que nos obtiene todos los registros de la tabla
	}

	@Transactional
	@Override
	public void guardar(Pelicula peliculas){
		// TODO Auto-generated method stub
		dao.save(peliculas);
	}

	@Transactional(readOnly = true)
	@Override
	public Pelicula buscar(int idPelicula) {
		// TODO Auto-generated method stub
		return dao.findById(idPelicula).orElse(null);
	}

	@Transactional
	@Override
	public void editar(Pelicula peliculas) {
		// TODO Auto-generated method stub
		dao.save(peliculas);
	}
@Transactional
	@Override
	public void eliminar(int idPelicula) {
		// TODO Auto-generated method stub
		dao.deleteById(idPelicula);
	}
	
	
	

}
