package com.alkemyf20260130;

import java.util.Scanner;

public class Calculadora {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
	
		boolean continuar = true;
		while(continuar) {
		
	
		menu();
		
		
		System.out.println("Ingresa el numero de tu opción: ");
		if(sc.hasNextInt()) { // letras controladas, strings.
		int opcionMenu = sc.nextInt();
		if(opcionMenu == 0) { // el 0 ya esta controlado.
			System.out.println("Vuelve pronto....");
			
		}else if(opcionMenu < 0 || opcionMenu > 5) {
			System.err.println("Opcion Invalida");
	
		}else { //opcion del 1 al 5		
			switch (opcionMenu) {
			case 1: //sumar
				
				int suma = suma();
				
				System.out.println("Ingrese cantidad de numeros a sumar");
				int cantidad = sc.nextInt();
				
				for (int i = 1; i <= cantidad ; i++) {
					System.out.printf("Ingresa el %d numero%n",i);
					int numero = sc.nextInt();
					//suma += numero;
					suma = suma + numero; // suma = 0 + 1
				}
				System.out.println("El resultado es " +suma);
				/*System.out.println("Ingrese numero 1");
				int numero1 = sc.nextInt();
				System.out.println("Ingrese numero 2");
				int numero2 = sc.nextInt();
				// int suma = numero1 + numero2;
				System.out.println("El resultado de la suma es:" + (numero1 + numero2));
				//System.out.printf("La suma de %d + %d  es =  %d%n: ", numero1, numero2, (numero1+numero2));*/
				break;
			case 2: //restar
				
				System.out.println("Ingrese cantidad de numeros a restar");
				int cant = sc.nextInt();
				
				 System.out.print("Ingresa el 1 numero: ");
                 int resta = sc.nextInt();
                 
				for (int i = 2; i <= cant ; i++) {
					System.out.printf("Ingresa el %d numero%n",i);
					int numero = sc.nextInt();
					
					resta = resta - numero; // suma = 0 + 1
				}	
					System.out.println("El resultado es " +resta);
				/*
				System.out.println("Ingrese numero 1");
				int numero3 = sc.nextInt();
				System.out.println("Ingrese numero 2");
				int numero4 = sc.nextInt();
				int resta = numero3 - numero4;
				System.out.printf("La suma es de %d: ",resta);*/
				break;
			case 3: // multiplicar
				System.out.println("Ingrese cantidad de numeros a multiplicar");
				int cantMul = sc.nextInt();
				
				int multiplicacion = 1;
				for (int i = 1; i <= cantMul ; i++) {
					System.out.printf("Ingresa el %d numero%n",i);
					int numero = sc.nextInt();
					
					multiplicacion = multiplicacion * numero; // suma = 0 + 1
				}	
					System.out.println("El resultado es " + multiplicacion);
				break;
		default:
				break;
				
			}
		}
		
		
		}else {
			System.out.println("Opción invalida");
			
		}
	
		//Selección por parte del usuario.
		}

	
	}
	
	
	public static void menu() {
	// Menu Calculadora
	System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
	System.out.println("▄▄▄▄Calculadora▄▄▄▄");
	System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
	System.out.println("0* Salir*");
	System.out.println("1* Sumar*");
	System.out.println("2* Restar*");
	System.out.println("3* Multiplicar*");
	System.out.println("4* Dividir*");
	System.out.println("5* Resto*");
	System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
	}	
	public static int suma() {
		Scanner sc = new Scanner(System.in);
		
		int suma_total = 0;
		System.out.println("Ingrese cantidad de numeros a sumar");
		int cantidad = sc.nextInt();
		
		for (int i = 1; i <= cantidad ; i++) {
			System.out.printf("Ingresa el %d numero%n",i);
			int numero = sc.nextInt();
			//suma += numero;
			suma_total  = suma_total+ numero; // suma = 0 + 1
		}
			
			return suma_total;
	}
}
	
// Ingreso de datos 2
		
		// repetitivo
		
		// switch case , variables, if else, for y while
		
		  
		
	

