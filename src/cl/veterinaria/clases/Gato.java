package cl.veterinaria.clases;

public class Gato extends Animal {
	
	private String raza;
	
	
	//CONSTRUCTORES
	public Gato(String nombre, double peso, String raza) {
		super(nombre, peso);
		this.raza = raza;
	}

	public Gato(String nombre, double peso) {
		super(nombre, peso);
		// TODO Auto-generated constructor stub
	}
	//*metodos* 
	
	//metodos propios
	@Override
	public void comer() {
		super.comer();
		System.out.println("Yo como poquito");
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
