package com.alkemy.f20260202;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int continuar = 1;
		
		while(continuar == 1) {
			
			menu();
		
		System.out.println("Ingresa el numero de tu opción: ");
		
		if(sc.hasNextInt()) { 
			// letras controladas, strings.
			int opcion = sc.nextInt();
		
		if(opcion == 0) { // el 0 ya esta controlado.
			System.out.println("Vuelve pronto....");
			continuar = 2; // salir del menu
			
		}else if(opcion < 0 || opcion > 5) {
			System.err.println("Opcion Invalida");
			
		}else { //opcion del 1 al 5		
			switch (opcion) {
			case 1: //sumar
				
				int suma = suma(sc); // se llama con sc para que no se rompa elprograma. definir sc en metodo.
				System.out.println("El resultado de la suma es: " +suma);

				break;
			case 2: //restar
				int resta = resta(sc);
				System.out.println("El resultado de la resta es: " +resta);
				
				break;
			case 3: // multiplicar
				
				int multi = multi(sc);
				System.out.println("El resultado de la multiplicación es: " + multi);
				
					
				break;
			case 4:
				double div = dividir(sc);
				System.out.println("El resultado de la division es: " + div);
				break;
			case 5:
				int res = resto(sc);
				System.out.println("El resultado del resto es: " + res);
				break;
		default:
				break;
				
			}
		}
		//preguntar si quiere continuar}
		if (opcion !=0) {
			
		
		System.out.println("Quieren continuar con otra operación...");
		System.out.println("Opción 1) si");
		System.out.println("Opción 2) no");
		
		if(sc.hasNextInt()) {
			continuar = sc.nextInt();//1 sigue, 2 sale		
			if (continuar == 2) {
			    System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
			}
		
		}else {
			
			System.out.println("Opción invalida");
			sc.next(); // limpia el valor inválido (letra) para no quedar en bucle
			continuar = 2; // sale por seguridad
			
		}
		
		//Selección por parte del usuario.
		}
		
	  }		
	}
		sc.close();
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
	public static int suma(Scanner sc) {
		
		int suma_total = 0;
		System.out.println("Ingrese cantidad de numeros a sumar");
		int cantidad = sc.nextInt();
		
		for (int i = 1; i <= cantidad ; i++) {
			System.out.printf("Ingresa el %d numero%n",i);
			int numero = sc.nextInt();
			//suma += numero;
			suma_total  = suma_total+ numero; // suma = 0 + 1
		}
			//sc.close();
			return suma_total;
	}
	public static int resta(Scanner sc) {
		
				
		System.out.println("Ingrese cantidad de numeros a restar");
		int cant = sc.nextInt();
		
		 System.out.print("Ingresa el 1 numero: ");
         int resta_total = sc.nextInt(); // primer numero es el inicio
         
		for (int i = 2; i <= cant ; i++) {
			System.out.printf("Ingresa el %d numero%n",i);
			int numero = sc.nextInt();
			
			resta_total = resta_total - numero; // suma = 0 + 1
			
		}	
			
			return resta_total;
		
	}
	
	public static int multi(Scanner sc) {
		
		
		System.out.println("Ingrese cantidad de numeros a multiplicar");
		int cantMul = sc.nextInt();
		
		int multiplicacion = 1;
		for (int i = 1; i <= cantMul ; i++) {
			System.out.printf("Ingresa el %d numero%n",i);
			int numero = sc.nextInt();
			
			multiplicacion = multiplicacion * numero; // suma = 0 + 1
		}
		
		return multiplicacion;
	}
	public static double dividir(Scanner sc) {
		
		//System.out.println("Ingrese cantidad de numeros a dividir");
		System.out.println("Ingrese el primer numero");
		double num1 = sc.nextDouble();
		System.out.println("Ingrese el segundo numero");
		double num2 = sc.nextDouble();
		
		double resultado = num1/num2;
		
		return resultado;
	}
	
	public static int resto(Scanner sc) {
		
		System.out.println("Ingrese el primer numero");
		int num1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		int num2 = sc.nextInt();
		
		int resultado = num1 % num2;
		
		return resultado;
		
		
	}
}		// Ingreso de datos 2
		
		// repetitivo
		
		// switch case , variables, if else, for y while
		
		  
		
	

