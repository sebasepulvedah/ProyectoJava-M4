package com.alkemy.f20260205;

import java.util.Scanner;

public class Ejercicio1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("ingresa una palabra");
		String palabra = sc.nextLine();
		System.out.println("Ingresa un numero");
		int numero = sc.nextInt();

		sc.nextLine();
		  
		System.out.println(palabra+" "+numero);
		
		System.out.println("ingresa una nueva palabra");
		
		palabra = sc.nextLine();
		
		System.out.println(palabra+" "+numero);
		
		sc.close();
	}

}
