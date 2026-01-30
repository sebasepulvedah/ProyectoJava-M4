package com.alkemyf20260130;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// declarar scanner 
		Scanner sc = new Scanner(System.in);
		//solicitar datos y almacenar en variables
		System.out.println("*****Calculadora*****");
		
		System.out.println("Ingresa el primero numero entero");
		String numero1String = sc.nextLine();
		
		//validar los caracteres ingresados.
		
		int numero1 = Integer.parseInt(numero1String);
		//capturando el dato con int
		//int numero1 = sc.nextInt();
		System.out.println("Ingresa el segundo numero entero");
		String numero2String = sc.nextLine();
		//capturando el dato con int
		int numero2 = Integer.parseInt(numero2String);// sc.nextInt();
		
		// operaciones (+-*/)
		
		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
		int multiplicacion = numero1 * numero2;
		
		
		 // mensajes de salida
			System.out.printf("El resultado de la suma es: %d%n",suma);
			System.out.printf("El resultado de la resta es: %d%n", resta);
			System.out.printf("El resultado de la multiplicacion: %d%n", multiplicacion);
			
			
			// modulo o resto de la division.
			// numero1 % numero2
			
			int division = 0;
			int resto = 0;
			
			// CONDICIONALES
			if (numero2 != 0) {
				division = numero1 / numero2;
				System.out.printf("El resultado de la división es: %d %n",division);
				resto = numero1 % numero2;
				System.out.printf("El resto de dividir %d por %d es: %d%n",numero1,numero2,resto);
			}else {
				System.out.println("No se puede dividir por cero");
			}
			
			
			// par e impar numero / 2 = resto es 0 o distino de 0 (o es -1 o 1)
			//( negativos; cero; positivos)
			
			if(numero1 % 2 == 0) {
				System.out.println("El numero es par");
			}else {
				System.out.println("El numero es impar");
			/**/
			}
			if (numero1 % 2 != 0) {
				System.out.println("El numero es impar");
			} else {
				System.out.println("El numero es par");
			}
			/**/
			if(numero1 % 2 == 1 || numero1 % 2 == -1) {
				System.out.println("El numero es impar");
			} else {
				System.out.println("El numero es par");		
			}
			
			
			
			
			
			sc.close();
	}

}
