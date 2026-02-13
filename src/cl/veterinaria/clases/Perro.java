package cl.veterinaria.clases;
/**
 * subclase de la SUPER CLASE ANIMAL
 */
public class Perro extends Animal{
	//atributos
	private String raza;

	
	//constructor
	public Perro(String nombre, double peso, String raza) {
		super(nombre, peso);
		setRaza(raza);
		//this.raza = raza; // se le asigna a raza los atributos que se pasan en el objeto. nombre, peso, raza.
	}
	
	//get&set
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

	//*metodos*/ 
	
	/* es la redefinicion/modificacion de los metodos agregados en la clase hijas.*/
	

	@Override
	public String hacerRuido() {
		
		return "Guau";
	}


	@Override
	public void moverse() {
		System.out.println("Se desplaza en 4 patas");
		
	}


	@Override
	public void comer() { 
		//super.comer();	// se llama al metodo comer de la clase padre.	
		System.out.println(nombre + " es carnivoro y mueve la cola " );
	}


	@Override
	public void dormir() {
		System.out.println("Duermen casi 12 horas");		
	} 
	
	@Override
	public String toString() {
		String mensaje = "Mi perro se llama "+super.getNombre()+ ", Su raza es "+ raza + ", y pesa : " + super.getPeso()+" Kilos";
 		return mensaje;
	}

	
}
