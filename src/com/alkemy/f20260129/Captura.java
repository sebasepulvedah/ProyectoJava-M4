package com.alkemy.f20260129;

import java.util.Scanner;

public class Captura {

	public static void main(String[] args) {
		// capturar información ingresada por consola Scanner
		Scanner sc = new Scanner(System.in); // in variable captura de datos.
		
		System.out.println("Ingresa tu nombre:");
		String nombre = sc.nextLine(); // captura un strings
		System.out.println("Ingresa tu apellido:");
		String apellido = sc.nextLine();
		
		System.out.println("Bienvenido/a: " + nombre + " " +apellido);
		System.out.printf("Hola %s" , nombre);
		sc.close();
	}

}
