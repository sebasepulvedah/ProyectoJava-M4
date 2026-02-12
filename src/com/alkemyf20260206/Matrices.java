package com.alkemyf20260206;

import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {
		// Matrices -> array multidimensional

		int [][] numeros = new int [2][3]; // 2 filas y 3 columnas
		/*
		 [0x0] [0x1] [0x2] -> FILA 0 
		 [1x0 [1x1] [1x2] -> FILA 1 
		 *
		 */
		numeros [0][0] = 10;
		//numeros [0][1] = 20;
		//numeros [0][2] = 30;
		//numeros [1][0] = 40;
		//numeros [1][1] = 50;
		numeros [1][2] = 60;
		
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(numeros[0]));
		System.out.println(Arrays.toString(numeros[1]));
		// recorrer matriz, todos los elementos
		
		
		// 
		
		//FORMA GENERICA
		for (int fila = 0; fila < numeros.length; fila++) {
			//numeros [FILA]
			for (int columna = 0; columna < numeros[fila].length; columna++) {
				System.out.println((numeros[fila][columna]));
			}
			
		}
		//[0x0] [0x1] [0x2] -> FILA 0 
		 //[1x0 [1x1] [1x2] -> FILA 1 
		//
		int [][] matriz = new int [2][3]; 
		for(int[] fila: matriz) { // [0x0] [0x1] [0x2]
			
			for (int valor : fila) {
				System.out.println("valor: " + valor );
			}
		}
		// ejercicio calculo de promedio por alumno y del curso, donde son 14 alumnos
		// y cada alumno tendra 7 notas
	}	

}
