package cl.veterinaria.clases;


/**
 * SUPER CLASE
 */
public abstract class Animal {
	


	protected String nombre;
	protected double peso;
	
	
	public Animal(String nombre, double peso) {
		super();
		this.nombre = nombre;
		this.peso = peso;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void comer() {
		System.out.println("esta comiendo el " + nombre);
	}
	//metodo abstracto
	public abstract void hacerRuido();
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + "]";
	}

}
