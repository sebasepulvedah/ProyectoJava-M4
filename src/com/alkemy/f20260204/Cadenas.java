package com.alkemy.f20260204;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cadenas {

	public static void main(String[] args) {
		// cadenas de caracteres = > String
		String cadenaCaracateres = "asdasdsd123456789 \" '' 54!%%!!///#";
		System.out.println(cadenaCaracateres);
		
		//definir un String
		
		String cadena = new String("Alkemy");
		System.out.println(cadena);
		
		// concatenacion:  unir dos o más cadenas de texto
		
		String nombre = "Sebastián";
		String apellido = "Sepúlveda";
		String nombreCompleto = nombre +" "+ apellido;
		System.out.println("El nombre completo es: "+nombreCompleto);
		System.out.println(nombre +" "+ apellido);
		
		int edad = 3; // un string + cualquier tipo de numero la resultante siempre sera un String.
		
		String nombreEdad = nombre + edad; // String + int => String
		System.out.println(nombreEdad);
		System.out.println(nombre + edad);
		// SE REALIZA DE IZQUIERDA A DERECHA LA CONCATENACION
		System.out.println(3+4+" siete");//7 siete
		System.out.println("siete "+3+4);//siete 34
		System.out.println("siete "+(3+4));//siete 7
		
		//funcion CONCAT
		
		String saludo = "Hola ".concat(nombreCompleto); // concat para llamar variable
		System.out.println(saludo);//Hola Sebastián Sepúlveda
		System.out.println("Hola".concat(" ").concat(nombre).concat(" ").concat(apellido));
		
		//funcion Length()
		int cantCaracteresNombre = nombre.length();
		System.out.println("Cantidad de caracteres del nombre: "+cantCaracteresNombre);
		System.out.println("Cantidad de caracteres del apellido: "+apellido.length());
		
		String password ="Admin1234"; // 21nimdA ***recursividad****
		
		if(password.length() < 8) {
			System.err.println("Contraseña muy debil");
			
		}else { 
			System.out.println("Entrada con éxito");
		//recorrer un String
		for(int i = 0; i < password.length(); i++) {
			char caracter = password.charAt(i);
			System.out.println(caracter);			
		}
		
		// Comparar String Equals
		
		//if (nombre == "Sebastian"){
		if(nombre.equals("Sebastian")) {
			System.out.println("Hasta luego "+nombre);
			
		}else {
			System.out.println("Hola "+ nombre);
		}
		//ejemplo
		String x = "hoLa";
		String y = "Hola";
		
		System.out.println(x.equals(y));
		System.out.println(x==y);// no confiarse, ocupar para numeros.
		System.out.println(y.equalsIgnoreCase(x));// ignora las mayusculas, misma informacion pero no son iguales.
		
		// Subcadenas
		System.out.println("╚╚╚╚Subcadenas╝╝╝╝");
		System.out.println(nombreCompleto);//Sebastián Sepúlveda
		System.out.println(nombreCompleto.substring(2));//bastián Sepúlveda
		System.out.println(nombreCompleto.substring(10));//Sepúlveda
		System.out.println(nombreCompleto.substring(2,15));//bastián Sepúl
		//BUSCAR EN STRING
		System.out.println(nombreCompleto.contains("Sepúlveda"));//true
		System.out.println(nombreCompleto.contains("Sepulveda"));//false
		
		nombreCompleto = nombreCompleto + " Hidalgo";
		System.out.println(nombreCompleto);//Sebastián Sepúlveda Hidalgo
		
		System.out.println(nombreCompleto.startsWith("Seba"));//true
		System.out.println(nombreCompleto.endsWith("lgo")); //true
		System.out.println(nombreCompleto.indexOf(" "));//9
		System.out.println(nombreCompleto.substring(0,9));
		
		System.out.println(nombreCompleto.substring(10).indexOf(" "));
		System.out.println(nombreCompleto.substring(10,19));
		
		String correo = " admin@alkemy.com";
		System.out.println(correo.indexOf("@"));//5
		System.out.println(correo.indexOf("$"));//-1 si no encuentra el resultado.
		
		//trim() - Quita los espacios al principio y al final
		
		System.out.println(nombreCompleto.trim());//Sebastián Sepúlveda Hidalgo
		
		String mensaje = " Esto es un mensaje de prueba ";
		System.out.println(mensaje.trim());//Esto es un mensaje de prueba
		
		// dividir un string split("caracter @-letra") => retorna un array String[]
		
		//String[] palabras = mensaje.split(" ");
		String[] palabras = mensaje.trim().split(" ");
		System.out.println(Arrays.toString(palabras));//[Esto, es, un, mensaje, de, prueba]
		
		System.out.println(Arrays.toString(correo.trim().split("@")));//[admin, alkemy.com]
		
		// replace ("caracter_a_ reemplazar","nuevo_caracter")
		//se limpiar el string, reemplazando . y -  por nada.
		String rut = "12.345.678-9";
		rut = rut.replace(".", "").replace("-", "");
		
		System.out.println(rut);
		System.out.println("Cantidad de caracteres del rut: "+rut.length());
		
		}	
	}
}
