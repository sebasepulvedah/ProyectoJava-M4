package com.alkemy.f20260129;

public class Impresion {

	public static void main(String[] args) {
		// print , no salta a la siguiente linea en consola
		System.out.print("Esto es un mensaje");
		System.out.print("nuevo mensaje");
		
		System.out.println("Hola"); // realiza el salto de linea
		System.out.println("Mi nombre es Sebastián");
		
		String nombre = "Seba";
		System.out.println(nombre); // esto imprime el contenido
		
		double iva = 0.19;
		System.out.printf("Impuesto %.2f %n",iva); //(%2f float)imprime con 2 decimales (%n, salto de linea)
		System.out.printf("Impuesto %.1f %n",iva); //(%1f) imprime con 1 decimal, aproximado
		
		String apellido = "Sepúlveda";
		int edad = 36;
		System.out.printf(" Me llamo: %s%n%s, tengo %d años", nombre, apellido, edad); // formato de evaluación %s%n%s
		
		
	}

}
