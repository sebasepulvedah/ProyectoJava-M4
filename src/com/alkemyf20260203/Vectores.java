package com.alkemyf20260203;

import java.util.Arrays;
import java.util.Scanner;

public class Vectores {

	public static void main(String[] args) {
		// arrays unidimensional
		//definiendo un array
		int[] notas = new int[8]; // 8 - cantidad de elementos. 
		
		//asignar valores
		notas[1] = 4; // [0, 4, 3, 0, 0, 0, 0, 0]
		notas[2] = 3; // [0, 4, 3, 0, 0, 0, 0, 0]
		notas[7] = 65;
		//acceder e imprimir un elemento del array
		System.out.println(notas[0]);
		System.out.println(notas[1]);
		System.out.println(notas[7]);
		
		
		notas[1] = 44; // modifico arreglo
		System.out.println(notas[1]);
		System.out.println(notas); // [I@4517d9a3
		
		System.out.println("tamaño o cantidad de elementos:"+notas.length); // cantidad de elementos que tiene el array
		//acceder al ultimo elemento del array unidimensional
		System.out.println("ultimo elemento: "+ notas[notas.length-1]); // notas [8-1] = > notas [7]
		System.out.println("Las notas son: " +Arrays.toString(notas));
		
		String[] dias = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
	
		System.out.println("tamaño arrays dias: "+dias.length);
		System.out.println(dias[1]);
		System.out.println(Arrays.toString(dias));
		
		/**
		 * RECORRER ARRAYS
		 */
		// indice == posicion
		for(int i = 0; i < dias.length; i++) { // indice= 0+1+1+1+1 // dias.length=5
			
			System.out.printf("Indice: %d, valor: %s%n",i,dias[i]);
			//System.out.println(dias[i]);//dias[0]
			//System.out.println(dias[i] + ": " + notas[i]);
		} 
		
		// asignacion dinamica
		
		Scanner sc = new Scanner(System.in);
				
		int[] puntajes = new int[6]; // asignando arrays 
		
		for (int i = 0; i < puntajes.length; i++) { 
			System.out.println("ingresa el puntaje");
			int puntaje = sc.nextInt();
			puntajes[i] = puntaje; // variable puntaje se asigna al array
			//puntajes[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(puntajes));
		
		sc.close();
		
	}
}