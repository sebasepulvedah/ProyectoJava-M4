package com.alkemy.f20260210;



public class Main {

	public static void main(String[] args) {
		// crear un objeto
		// instancia de una clase de Coche
		//() => constructor
		Coche micro_eletric = new Coche();
		Coche sedan = new Coche();
		//estado inicial es la asignacion de valores a los atributos.
				// todos los constructores tienen su variables vacia
		
		//Creando un objeto, asignado valores a los atributos, a traves del metodo constructor.
		Coche suv = new Coche("Negro","Nissan","Qashqai","Bencinero");
		
		Coche pickup = new Coche ("Great Wall","Poer");
		
		System.out.println(micro_eletric.color);
		System.out.println(suv.color);
		
		//usando metodo get: acceder al valor del atributo.
		System.out.println(suv.getColor());
		System.out.println(suv.getMarca());
		
		//metodo set: asignar o modificar el estado del atributo.
		
		micro_eletric.setColor("Verde");
		System.out.println(micro_eletric.getColor());
		
	
	}

}
