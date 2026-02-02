package com.alkemy.f20260202;

import java.util.Scanner;

public class Para {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// para o for
		//variable de inicio, condicion de termino, incremeto o decremento
		/*for (int i = 0; i < 10; i++) { // i = 0 ; 0 < 10; i = 0 ; 1 < 10; bucle hasta 9
			System.out.println("Valor de i "+ i);
			
		}
		System.out.println("Fin del for");
		*/
		
		int suma = 0;
		
		System.out.println("Ingrese el limite");
		int limite = sc.nextInt();
		
		for (int i = 1; suma < limite; i++) {
			System.out.printf("Ingresa el %d numero%n",i);
			int numero = sc.nextInt();
			
			suma = suma + numero; // suma = 0 + 1
		}
		System.out.printf("El limite es %d y la suma es %d", limite,suma);
		sc.close();
	}

}
