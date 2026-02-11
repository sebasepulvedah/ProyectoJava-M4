package com.alkemy.livecoding;

public class Main {

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente(169785694,"Sebastian","Sepúlveda","1pte");
		 
		System.out.println(cliente.toString());
		cliente.actualizarDatos(cliente);
		System.out.println(cliente.toString());
		
	}
}
