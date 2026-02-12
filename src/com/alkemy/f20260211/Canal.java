package com.alkemy.f20260211;

public class Canal {
	//atributos
	int id;  // default : permite el acceso solo a clases de un mismo paquete
	public String nombre; // Permite el acceso publico desde cualquier clase en cualquier paquete
	//private int codigo; // Acceso privado, solo permite el acceso a los metodos de una  misma clase
	//constructores
	public Canal() {
		super();
	}

	public Canal(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	// metodos
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
		return "Canal [id=" + id + ", nombre=" + nombre + "]";
	}
		
}
