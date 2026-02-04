package com.alkemy.f20260204;

public class Main {
		// variable de clase GLOBAL
	static int variableClase;
	
	public static void main(String[] parametros) {
		// variable local

		int variableLocal = 0;
		variableClase = 1;
		System.out.println(" *** En el main ****");
		System.out.println(variableLocal);//0
		System.out.println(variableClase);//1
		variableLocal = 6;
		
		// LLAMADO AL METODO
		imprimir();
		imprimir2(variableLocal);// llamar al metodo imprimir2, imprimir2(0)
		
		System.out.println(" *** En el main2 ****");
		System.out.println(variableLocal);//0
		imprimir2(5);
		
	}
	
	public static void imprimir() {
		System.out.println(" *** Imprimir ****");
		//System.out.println(variableLocal); // no se imprime porque no reconoce, ya que es local de otra
		System.out.println(variableClase);//1
		variableClase = 3; // modoficar o reasignar un valor
		
	}

	public static void imprimir2(int varLocal) { // varLocal = 0, lo llama desde el main. SOLO RECIBE VALOR.
	
		System.out.println(" ╚▓▓▓ Imprimir 2 ▓▓▓╝");
		System.out.println(varLocal); // 0;5;6;7
		System.out.println(variableClase);//3
		//variableClase = 5;
		varLocal = 2; // ESTA NO MODIFICA LA VARIABLE LOCAL NI LA MAIN
		
	}
}
