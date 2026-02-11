package com.alkemy.f20260210;

/**
 * Molde o plantilla
 * 
 */

public class Coche {
	//atributos
	String color;
	String marca;
	String modelo;
	String combustible;
	//constructores
	// permite asignar valores iniciales a los atributos(estado)
	
	//constructor vacio
	
	public Coche() { // permite asignar o cambiar el estado a posterior
			
	}
	
	// constructor parametrizado
	public Coche(String color, String marca, String modelo, String combustible) {
		super();
		//atributo = parametro
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.combustible = combustible;
	}
	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	public Coche(String color) {
		super();
		this.color = color;
	}
	public Coche(String color, String marca, String combustible) {
		super();
		this.color = color;
		this.marca = marca;
		this.combustible = combustible;
	}

	//metodos Getters and setter
		//accesador  y mutador
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	
	
	
	
	
	
}
