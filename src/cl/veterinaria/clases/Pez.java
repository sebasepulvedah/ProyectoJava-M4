package cl.veterinaria.clases;

/**
 * POLIMORFISMO
 */

public class Pez implements Mascota {

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

	

}
