package cl.veterinaria.clases;

/**
 * Clase conejo implementera esos metodos de Mascota
 */
public class Conejo extends Animal{
	
	
	private String raza;

	public Conejo(String nombre, double peso) {
		super(nombre, peso);
		// TODO Auto-generated constructor stub
	}

	
	
	public String getRaza() {
		return getRaza();
	}

	public void setRaza(String raza) {
		
		if(raza == null || raza.trim().isEmpty() ) {
			System.err.println("Error en el ingreso de la raza");
			throw new IllegalArgumentException("Error en el Ingreso de la raza");
		}
		this.raza = raza.trim();
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
	
	public void dormir() {
		System.out.println("Duerme 17 horas");
	}
	
}
