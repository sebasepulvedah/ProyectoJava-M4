package com.alkemyf20260130;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// Condicionales
		// validar la edad si es mayor o menor de edad
		// si es mayor, en que segmento etario.
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Segmento Etario*****");
		
		System.out.println("Ingresa tu Edad");
		//
		if(sc.hasNextInt()) {
			int edad = sc.nextInt();
			//validar rango 
		if (edad < 0 || edad > 120) {
			System.out.println("edad no valida");
		} else if (edad <= 12) {
			System.out.println("Niño");
		} else if (edad <= 17) {
			System.out.println("Adolescente");
		} else if (edad <= 64) {
			System.out.println("Adulto");
		} else {
			System.out.println("Adulto Mayor");
		}

	}else {
		System.out.println("Edad invalida");
	}
		sc.close();
		
	}		
}
		
		
