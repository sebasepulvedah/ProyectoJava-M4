package com.alkemy.f20260211;

/**
 * Clase para agregar los sectores de una base de datos del excel.
 * 
 */

public class Sector {


		private int id;
		private String nombre;
		
		public Sector() {
			super();
		}

		
		public Sector(int id, String nombre) {
			super();
			this.id = id;
			this.nombre = nombre;
		

	}


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
			return "Sector [id=" + id + ", nombre=" + nombre + "]";
		}

		
}