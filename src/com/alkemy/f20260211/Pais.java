package com.alkemy.f20260211;

/**
 * Clase para agregar los paises de una base de datos del excel.
 * 
 */

public class Pais {
	//atributos
	private int id;
	private String nombre;

	//constructores
	public Pais() {
		super();
	}
	
	public Pais(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	//metodos

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
}
