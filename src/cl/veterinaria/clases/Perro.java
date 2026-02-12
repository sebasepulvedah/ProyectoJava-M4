package cl.veterinaria.clases;
/**
 * subclase de la SUPER CLASE ANIMAL
 */
public class Perro extends Animal{

	private String raza;

	
	
	public Perro(String nombre, double peso, String raza) {
		super(nombre, peso);
		this.raza = raza;
	}


	/*metodos*/ 
		
	/* es la redefinicion/modificacion de los metodos agregados en la clase hijas.*/
	@Override
	public void comer() {
		super.comer();		
		System.out.println("yo estoy comiendo otra vez el " + nombre);
	}

	@Override
	public String toString() {
		String mensaje = "Mi perro se llama "+super.getNombre()+ ", Su raza es "+ raza + ", y pesa : " + super.getPeso()+" Kilos";
 		return mensaje;
	} 
	
	//GET&SET
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}


	@Override
	public void hacerRuido() {
		// TODO Auto-generated method stub
		
	}

	
}
