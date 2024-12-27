package com.mx.Cinepolis.service;

import java.util.ArrayList;
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

@Transactional(readOnly = true) //solo lectura
@Override
public List<Pelicula> buscarXnombre(String nombre) {
	// TODO Auto-generated method stub
	return dao.findByNombre(nombre);
}
@Transactional(readOnly = true)// solo lectura
@Override
public List<Pelicula> buscaXprecio(Float precio) {
	// TODO Auto-generated method stub
	
	//Registros BD
	//ciclo foreach para recorrer esos registros
	//if
	
	List<Pelicula> nuevaList = new ArrayList<>();
	//== se utiliza para comparar valores numericos siempre y cuando no esten parseados
	//.equals se utiliza para comparar cadenas y valores numericos parseados
	for (Pelicula p: dao.findAll()) {
		if (p.getPrecio().equals(precio)) {
			nuevaList.add(p);
			
			
		}
		
	}
	
	
	return nuevaList;
}
	
	

	

}
