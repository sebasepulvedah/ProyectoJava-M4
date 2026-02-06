package com.alkemy.f20260205;

public class Operadores {

	public static void main(String[] args) {
		//Operadores

		int num1 = 10;
		int num2 = 20;
		
		//int suma = 30;
		//System.out.println(suma);
		
		System.out.println(num1 + num2);//30
		System.out.println(num1 - num2);//-10
		System.out.println(num1 * num2);//200
		System.out.println(num1 / num2);//0
		System.out.println(num1 % num2);//10
	
		//casteo o conversion
		
		System.out.println((double)num1 / num2);// 10/20 = 0.5
		System.out.println(Double.valueOf(num1) / num2);
		
		// Incremento / decremento
		int num3 = ++num1;
		int num4 = num1++;
		System.out.println(++num1);// 11 ;Primero incrementa y luego imprime
		System.out.println(num1++);// 11; Primero imprime y luego incrementa
		System.out.println(num1); //14
		System.out.println(++num3); // 12
		System.out.println(num4++);//11
		
		System.out.println(--num2);//19 : PRIMERO RESTA 1, LUEGO IMPRIMIE
		System.out.println(num2--);//19: primero imprime, luego resta 1
		System.out.println(num2); // 18
			
		for (int i = 100;  i > 0; i--) {
			if(i==100) {
				System.out.printf("%d",--i);
			}else {
				System.out.printf(",%d",--i);
			}		
		}
		System.out.println("%n"); // salto de linea.
		
		 //comparacion 
		System.out.println(num1 == num2); // 11 == 18 FALSE
		System.out.println(num1 != num2); // true
		System.out.println(num1 < num2); // true 
		System.out.println(num1 > num2); // false
		System.out.println(num1 <= num2); // true
		System.out.println(num1 >= num2); // false
		
		// logicos
		
		boolean tienClave = true;
		Boolean esAdmin = false;
		System.out.println("***OPERADORES LOGICOS***");
		System.out.println(true && true); // AND true, ambos valores deben ser verdaderos
		System.out.println(tienClave && esAdmin); //false
		System.out.println(esAdmin && tienClave); //false ; corto circuito
		System.out.println();
		System.out.println(false || false); // OR false
		System.out.println(tienClave || esAdmin ); // true: corto circuito, vio el V y no siguio. 
		System.out.println(false || true); // TRUE
		
		System.out.println(esAdmin == false); // true ; Esto esta de más en un if con las variables booleanas.
		if(!esAdmin) { // se evalua directamente. !esAdmin= es distinto de false? es true
			System.out.println("Es administrador del sistema");
		}else {
			System.out.println("no es administrador del sistema");
		}
		
		// if ternario EVALUACION ? Resultado_verdad : resultado_falsedad
		
		String mensaje = (!esAdmin)? "Es admin":"No es admin";
		System.out.println(mensaje);
	}

}
