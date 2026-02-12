package com.alkemyf20260203;

public class Funciones {

	public static void main(String[] args) {
		// llamar o invocar el metodo.

		Integer num1 = 70;
		Integer num2 = 54;
		
		Integer valor_retorno = calculo_suma(num1,num2);
		System.out.println("El resultado de la suma es: "+ valor_retorno);
		System.out.println(num1+" "+num2);
		calculo_suma2(70,70,70); // se llama al calculosuma2 sin pedir valores, solo se imprime
		
	}
	
	
	// DEFINICION DE METODOS.
	// accesador; tipo de retorno ; nombre_metodo(tipo_dato nombre_parametros 1 o varios)   
	/**
	 * Metodo que resuelve la suma de dos numeros - STATIC tipodato es para esperar retorno.
	 * @Integer numero1
	 * @Integer numero2
	 * @return Integer
	 */
	public static Integer calculo_suma(Integer numero1, Integer numero2 ) {
			
		Integer suma = numero1 + numero2;
		numero1 = numero1 + 2; // esto solo afecta internamente.
		numero2 = numero2 + 2;
		System.out.println("Esto solo afecta dentro del calculo_suma: "+numero1+" "+numero2);
		return suma; //pasando el contenido de la variable al return
		//return numero1 + numero2;
	}
	// aca no retornamos, solo hacemos la operación interna.
	// podemos recibir cualquier tipo de datos.
	public static void calculo_suma2(Integer numero1, Integer numero2, Integer numero3 ) {
		
		
		System.out.println("el resultado es "+ (numero1+numero2+numero3));
		
	}
	
	
}
