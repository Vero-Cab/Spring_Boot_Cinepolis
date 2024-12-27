package com.mx.Cinepolis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "PELICULA")
@NoArgsConstructor //crear el constructor vacio
@AllArgsConstructor //constructor con parametros
@Data //ToString, getter setter
	
public class Pelicula{
	//iniciar el mapeo de los datos de la tabla
	@Id
	@Column(name="ID_PELICULA", columnDefinition = "NUMBER", nullable = false)
	private Integer idPelicula; //ya se parseo con el tipo number a integer
	
	@Column(name="NOMBRE", columnDefinition = "VARCHAR2(90)", nullable = false)
	private String nombre;//no se parsea
	
	@Column(name="GENERO", columnDefinition = "VARCHAR2(90)", nullable = false)
	private String genero; //no se parsea
	
	@Column(name="PRECIO", columnDefinition = "FLOAT", nullable = false)
	private Float precio;  // float tipos de datos con decimales parseado a Float
	
	
	//@Column(name="ID_PELICULA"
	//private Integer idPelicula;
	
	//@Column(name="NOMBRE")
	//private String nombre;
	
	//@Column(name="GENERO")
	//private String genero;
	
	//@Column(name="PRECIO")
	//private Float precio;
	
	//All mapear los campos de la tabla y si ocupamos tipos de variables Primitivas
	// y aceptan valores null hay que parsearlos
	
}

