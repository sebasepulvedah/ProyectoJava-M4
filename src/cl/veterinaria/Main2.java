package cl.veterinaria;

import cl.veterinaria.clases.Animal;
import cl.veterinaria.clases.Conejo;
import cl.veterinaria.clases.Gato;
import cl.veterinaria.clases.Perro;
import cl.veterinaria.clases.Pez;

public class Main2 {

	public static void main(String[] args) {
		
		//Animal animal = new Animal("Ayun",20.2); no se puede crear una instancia de una clase abstracta
		
		//poliformismo
		
		Animal [] arrayAnimales = new Animal[] {
				new Perro("Simba", 20.5,"Quilterrir"),
				new Gato("Felix",7,"Faraonense"),
				new Pez("Nemo",0.2),
				new Conejo("El Padrino",3)
				
		};
		//recorriendo un array de una clase abstracta
		for(Animal animal : arrayAnimales) { 
		
			if(animal instanceof Gato gato) {
				gato.setRaza("Egipcio");
			}
			System.out.println(animal);
			System.out.println("--------------------------");
			animal.comer();
			animal.dormir();
			animal.moverse();
			System.out.println("Su sonido es :" +animal.hacerRuido());	
			System.out.println("█ █ █ █ █ █ █ █ █ █ █ █ █ █");
		}
		
		//downCasting
		Animal gatito = arrayAnimales[1];
		
		if(gatito instanceof Gato gato) {
			gato.setRaza("Egipcio");
		}
	}

}
