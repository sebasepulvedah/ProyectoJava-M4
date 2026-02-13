package cl.veterinaria.clases;

/**
 * POLIMORFISMO
 */

public class Pez extends Animal{

	private String raza;
	
	public Pez(String nombre, double peso) {
		super(nombre, peso);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String hacerRuido() {
		// sonido a implementar de mascota.
		return "glugluglu";
	}

	@Override
	public void comer() {
		System.out.println("El pez esta comiendo plantitas");
		
	}

	@Override
	public void moverse() {
		System.out.println("El pez nada");
		
	}

	public void dormir() {
		System.out.println("A veces duerme 3 horas y otras veces nada :D");
	}

}
