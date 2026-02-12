package cl.veterinaria;

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
		System.out.println(perro.toString());
		perro.comer();
		
		Gato gato = new Gato("Juanito",7);
		gato.comer();
		System.out.println(gato.toString());
		System.out.println();
		System.out.println("********POLIMORFISMO*********");
		/*Polimorfismo*/
		// asignacion {;
		//mascotas se comportaran de manera global
		Mascota[] mascotas = new Mascota[] {
				new Conejo(),
				new Pez()
		};
		//recorrer el array
		for (Mascota mascota : mascotas) {
			System.out.println(mascota.hacerRuido());
			mascota.comer();
			mascota.moverse();
			//las clases abstractas no se pueden intanciar, solo definicion de metodos.
			
		}
	
	}
	
	
}
