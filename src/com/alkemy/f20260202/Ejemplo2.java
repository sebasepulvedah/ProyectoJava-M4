package com.alkemy.f20260202;

public class Ejemplo2 {

	public static void main(String[] args) {
		//Todas las tabla de multiplicacion(for de for) for anidado
		
		for (int i = 1; i <= 5; i++) {// i = 1 para numero izq primario
			System.out.println("**********");
			for (int j = 1; j <= 10; j++) { // j = 1 para numero derecho secundario.
				// i x j = 1
				System.out.printf("%d x %d = %d%n", i,j,(i*j));
			}
			System.out.println();
		}
	}

}
