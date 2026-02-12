package cl.veterinaria.clases;

/**
 * Clase conejo implementera esos metodos de Mascota
 */
public class Conejo implements Mascota{
	
	private String raza;
	
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String hacerRuido() {
		
		return "yiiiiiiiii";
	}

	@Override
	public void comer() {
		System.out.println("El conejo come platano");
		
	}

	@Override
	public void moverse() {
		System.out.println("El conejo salta");
		
	} 

	
}
