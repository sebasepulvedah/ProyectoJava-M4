package cl.veterinaria;

import cl.veterinaria.clases.Animal;
import cl.veterinaria.clases.Conejo;
import cl.veterinaria.clases.Gato;
import cl.veterinaria.clases.Mascota;
import cl.veterinaria.clases.Perro;
import cl.veterinaria.clases.Pez;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Animal animal = new Animal("Simba",65.3);
		//System.out.println(animal.getNombre());
		//System.out.println(animal.getPeso());
		//System.out.println(animal.toString());
		Perro raza = new Perro("Simba",20,"Quilterryr"); // se crea una instancia obj de la clase perro con constructor definido y heredo nombre y peso
		System.out.println(raza.toString());			
		//animal.comer();
		
		Perro perro = new Perro("Lobito", 11, "San Bernardo");
		System.out.println(perro); // se puede ocupar sin tostring ya que automaticamente lo detecta..
		perro.comer();
		
		Gato gato = new Gato("Juanito",7); //objeto gato. 
		gato.comer(); // se llama metodo comer, heredado de la clase animal pero sobrescrito en la clase gato.
		System.out.println(gato.toString());
		System.out.println();
		System.out.println("********POLIMORFISMO*********");
		/*Polimorfismo*/
		// asignacion {;
		//mascotas se comportaran de manera global
		Animal[] mascotas = new Animal[] { // clase interface mascota implements. se definen metodos independientes. accion que se espera a realizar.
				new Conejo(null,0),
				new Pez(null,0)
		};
		//recorrer el array
		for (Animal mascota : mascotas) {
			System.out.println(mascota.hacerRuido());
			mascota.comer();
			mascota.moverse();
			//las clases abstractas no se pueden intanciar, solo definicion de metodos.
			
		//polimorfismo downCasting
		Mascota conejin = (Mascota) new Conejo("conejin",20);
		conejin.comer();
		//conejin.dormir(); esto no se puede hacer si no esta en la interface.
		//downCasting
		Conejo wonejo = (Conejo) conejin; // trabajamos desde la interface hacia la clase.
		wonejo.dormir();
		
		Mascota pezcadin = (Mascota) new Pez("Morin",0.2);
		pezcadin.comer();
		Pez pescadin = (Pez) pezcadin;
		pescadin.dormir();
		
		//Pez pescadito = (Pez) conejin; //castException
		/**
		/* InstanceOf
		if(conejin instanceof Pez pez) {
			pescadito.hacerRuido();
		} else {
			System.out.println("No es un pez");
		}
		*/
		
		/*¨IntanceOf*/
		if(pezcadin instanceof Pez pez)
			pescadin.hacerRuido();
		 else {
			System.out.println("No es un pez");
			
		}
	
	}
	
	}
}
