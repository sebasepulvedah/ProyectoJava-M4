package com.alkemyf20260130;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// CALCULO IMC
		/**
		 * IMC = peso/(altura * altura)
			8.5 o menos	Bajo Peso	Tratamiento
			18.5 a 24.99	Peso Normal	Tratamiento
			25 a 29.99	Sobrepeso	Tratamiento
			30 a 34.99	Obesidad (Clase 1)	Tratamiento
			35 a 39.99	Obesidad (Clase 2)	Tratamiento
			40 o más	Obesidad Mórbida**/
		 	
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo de IMC");
		
		System.out.println("Ingrese su peso en KG:");
		double peso = sc.nextDouble();
		System.out.println("Ingrese su altura en metros:");
		double altura = sc.nextDouble();
		double imc = peso / (altura * altura);

		//double imc = peso / Math.pow(altura, 2);  sirve para elevar un número a una potencia en Java.
		//System.out.println(Math.pow(2, 3)); resultado 8 = 2*2*2
		System.out.printf("Su IMC es de %.2f%n" , imc);
		
		//|| >< 
		
		if(imc <= 18.5 ) {
			System.out.println("Bajo peso");
		} else if(imc <= 24.99) {
			System.out.println("Peso normal");
		}else if(imc <= 29.99){
			System.out.println("Sobre Peso");	
		}else if (imc <= 34.99){
			System.out.println("Obesidad Clase 1");
		}else if (imc <= 39.99){
			System.out.println("Obesidad Clase 2");
		}else {
			System.out.println("Obesidad Morbida");
		}
		sc.close();
		
	}
}	
	
