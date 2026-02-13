package cl.veterinaria.clases;

public class Gato extends Animal {
	
	private String raza;
	
	
	//CONSTRUCTORES
	public Gato(String nombre, double peso, String raza) {
		super(nombre, peso);
		//this.raza = raza;
		setRaza(raza);
	}

	public Gato(String nombre, double peso) {
		super(nombre, peso);
		
	}
	
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		
		if(raza == null || raza.trim().isEmpty() ) {
			System.err.println("Error en el ingreso de la raza");
			throw new IllegalArgumentException("Error en el Ingreso de la raza");
		}
		this.raza = raza.trim();
	}

	//*metodos* 
		//metodos propios
		
	@Override
	public String hacerRuido() {
		
		return "Miau";
	}

	@Override
	public void moverse() {
		System.out.println("Se desplaza sigilosamente");
		
	}

	@Override
	public void comer() {
		System.out.println(nombre + " come lentamente y  mira fijo " );
		
	}

	@Override
	public void dormir() {
		System.out.println("Duermen mas de 15 horas");
		
	}

	@Override
	public String toString() {
		return super.toString() + " raza="+raza;
	}

	
	
	
}
