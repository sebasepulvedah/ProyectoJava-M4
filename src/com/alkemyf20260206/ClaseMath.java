package com.alkemyf20260206;

public class ClaseMath {

	public static void main(String[] args) {
		// Clase Math   Math.metodo();
		// constantes
		System.out.println("constante PI: " + Math.PI);
		System.out.println("Constante Euler: "+ Math.E);
		
		// Redondeo
		System.out.println("Math.ceil: "+ Math.ceil(43.5)); //44.0 redondea hacia arriba
		System.out.println("Math.ceil: "+ Math.ceil(Math.PI)); // 4.0
		System.out.println("Math.ceil: "+ Math.ceil(-4.1)); // -4.0
		
		System.out.println("Math.floor: "+ Math.floor(43.5)); //43.0 redondea hacia abajo
		System.out.println("Math.floor: "+ Math.floor(Math.PI)); // 3.0
		System.out.println("Math.floor: "+ Math.floor(-4.1)); // -5.0
		
		System.out.println("Math.Round() "+ Math.round(45.5)); // 46
		System.out.println("Math.Round() "+ Math.round(Math.PI)); // 3
		System.out.println("Math.Round() "+ Math.round(-6.1)); // -6
		System.out.println("Math.Round() "+ Math.round(-6.5)); // -6
		
		/**RAICES Y POTENCIAS */
		//potencias
		System.out.println("Math.pow() "+ Math.pow(0,0)); // 1.0
		System.out.println("Math.pow() "+ Math.pow(5,3)); //125.0
		
		System.out.println("Math.pow() "+ Math.pow(125,(2/1))); //15625.0
		//raiz cuadrada
		System.out.println("Math.sqrt() "+ Math.sqrt(25)); //5
		//raiz cubica
		System.out.println("Math.sqrt() "+ Math.cbrt(125)); //5
		
		//comparacion
		System.out.println("Math.max() "+ Math.max(10, 10.5));//10.5
		System.out.println("Math.min() "+ Math.min(10, 10.5));//10.0
		
		// valor absoluto, distancia hacia el cero
		System.out.println("Math.abs() "+ Math.abs(5)); //5
		System.out.println("Math.abs() "+ Math.abs(-4));//4
		
		/* Numero aleatorio */
		// retorna un double
		// retorna un numero dobule dentro del rango.
		System.out.println("Math.random() "+ Math.random()); // 0.10593206149626966
		//forma general
		System.out.println((int)  (Math.random() * 10)); // 0 al 9
		System.out.println((int)  (Math.random() * 10) + 1); // 1 al 10
		System.out.println((int)  (Math.random() * 11) + 5); // 5 al 15
		System.out.println((int)  (Math.random() * 21) - 10); // -10 ,10
		
		// ejercicio 
		// el sistema genera un numero aletorio dentro de un rango
		// el usuario trata de adivinarlo, el sistema entrega pista de cercania max o min
		// contar cuantos ingresos hizo.
		
	}

}
