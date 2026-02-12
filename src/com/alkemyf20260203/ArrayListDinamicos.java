package com.alkemyf20260203;

import java.util.ArrayList;

public class ArrayListDinamicos {

	public static void main(String[] args) {
		// Arraylist dinamicos

		
		//definicion
		//tipo de datos- nombre variable AL = metodo constructor
		ArrayList<Integer> edades = new ArrayList<>(); // Todos parten desde la posicion 0
		//AGREGAR infomarcion al arraylist
		edades.add(15);
		edades.add(18);
		edades.add(13);
		edades.add(14);
		edades.add(21);
		edades.add(50);
		edades.add(8);
		
		// se imprime todo el arraylist
		System.out.println(edades); // [15, 18, 13, 14, 21, 50, 8]
		//consultamos que posicion queremos ver. METODO GET
		System.out.println("Las posociones seleccionas son: "+edades.get(6) + " y "+ edades.get(3));
		
		 // cantidad de elementos en el array list
		
		System.out.println("La cantidad de elementos de este arrays es: "+edades.size());
		System.out.println("Ultimo elemento " + edades.get(edades.size()-1));
		
		/* Metodo de los ArrayList*/
		System.out.println(edades);
		edades.remove(6);
		System.out.println(edades);
		
		System.out.println("primer elemento "+edades.getFirst());
		System.out.println("ultimo elemento "+edades.getLast());
		//modificar un elemento del array
		
		System.out.println(edades);// [15, 18, 13, 14, 21, 50]
		System.out.println(edades.get(2)); // 13
		
		edades.set(0, 16);
		System.out.println(edades); // [16, 18, 13, 14, 21, 50]
		
		
		/**RECORRER UN ARRAYLIST*/
		
		for (int i = 0; i < edades.size(); i++) {
			System.out.println("Esto es un get con size "+edades.get(i));
		}
		// agregar elementos al ArrayList
		int cantidad = 10;
		for (int i = 0; i < cantidad; i++) {
			edades.add(i+2);
			
		}
		System.out.println(edades);
		/**
		 * Recorrer con ForEach
		 */
			// [16, 18, 13, 14, 21, 50] - Se asigna un elemento
			for (Integer edad : edades) {
			    System.out.println("elemento edad " + edad);
			}
		
	}

}
