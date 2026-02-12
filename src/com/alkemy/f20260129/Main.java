package com.alkemy.f20260129;

public class Main {

	public static void main(String[] args) {
		// variables
		
		//tipos de variables primitivos (simples)
		/* enteros (se escriben en minuscula)
		   
			(byte (8 bits) -128 al 127,
			short(16 bits),
			int 32 bits) 2MM
			long (64 bits)
		*/
		int edad = 150; // aca creamos variable entera. definimos
		long sueldo = 10000000000L; // cuando se supera el digito, se agrega L para decirle que si trabajaremos con un long
		
		// decimales o punto flotante
		/*
		 * float(32 bits) 2MM
		 * double (SE OCUPA MAS COMO PRIMITIVO)
		 */
		float altura = 1.80F; // F para asignar 1.80 Float
		float altura2 = (float) 1.55334139; // castear o casteo o convertir
		double peso = 87.5; 
		
		// otros
		boolean acepta = true; // o false
		char letra = 'A';// Los char se asignan con comillas simples ''
		
		// Tipos de variables OBJETOS o de referencia. 
		/*Estas variables pueden operar, hacer acciones
		a diferencias de las primitivas */
		
		String apellido = "Sepúlveda";
		Integer edad2 = 150;
		String cadena = "HOLA MUNDO";
		Float altura3 = 1.92F;
		String nombre = "Ana";
		String saludo = "Hola " + nombre + " " + apellido + "!";
		System.out.println(saludo);
		System.out.println("Tienes: " +edad);
		System.out.println("Tu sueldo es de:" + sueldo);
		System.out.println(altura2);
		
		Integer nota = 5;
		String nota_string = nota+""; // casteo sucio, convertir numero a string
		String nota_string2 = nota.toString(); // convierte el objeto a nota string
		// como transformar un nmumero string a tipo numerico

		Float nota_float = Float.parseFloat(nota_string2);
		int nota_inte = Integer.valueOf(nota_string2);
		// convertir un String ---> int (primitivo)
				int notaInt = Integer.parseInt(nota_string2);
				System.out.println("Numero Convertido: "+ nota_float);
				System.out.println(nota_inte);
				System.out.println(notaInt);
				
		
			
		
		
	}

}
