package com.alkemy.f20260202;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Crear mediante bucle for tabla de multiplicar del 2 va del 1 al 10
		System.out.println("Ingrese el numero de la tabla que necesita: ");
		int tabla = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) { // variable, cuantas veces se ejecuta 10, se incrementa +1 de la variable
			System.out.printf("%d x %d = %d%n",tabla, i,(tabla*i));
		}
		System.out.printf("Estos son los resultados de la tabla del %d", tabla);
		sc.close();
	}
	
}
