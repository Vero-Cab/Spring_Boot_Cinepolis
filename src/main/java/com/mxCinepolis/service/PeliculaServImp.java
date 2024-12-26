package com.mxCinepolis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mxCinepolis.dao.PeliculaDao;
import com.mxCinepolis.model.Pelicula;

//SE AGREGSA EL ESTEREOTIPO O NOTACION PARA INDICAR QUE VAMOS A REAKIZAR UN SERVICIO
@Service
public class PeliculaServImp implements PeliculaServ{
	
	//LA INYECCION DE DEPENDENCIAS	
	@Autowired //nos permote tener un mejor control de los objetos que se inicializan
	PeliculaDao dao; //es como instanciar la clase, tener acceso a todo lo que tenga la dependencia
		
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

	@Override
	public Pelicula buscar(int idPelicula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Pelicula peliculas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int idPelicula) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
