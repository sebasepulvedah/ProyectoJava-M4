package cl.veterinaria.clases;


/**
 * SUPER CLASE PADRE
 */
public abstract class Animal implements AnimalBase{
	//atributos
	protected String nombre;
	protected double peso;
	
	//constructor
	public Animal(String nombre, double peso) {
		
		//this.nombre = nombre;
		//this.peso = peso;
		setNombre(nombre);
		setPeso(peso);
	}

	
	
	//getters % setters
	public String getNombre() {
		return nombre;
	}

	//asignacion al objeto.
	public void setNombre(String nombre) {
		if(nombre == null || nombre.trim().isEmpty() ) {
			System.err.println("Error en el ingreso del nombre");
			throw new IllegalArgumentException("Error en el Ingreso del Nombre");
		}
		
		this.nombre = nombre.trim();
	}


	public double getPeso() {
		return peso;
	}

	//asignacion al objeto.
	public void setPeso(double peso) {
		if(peso <= 0) {
			throw new IllegalArgumentException("El peso debe ser mayor a 0");
		}
		
		this.peso = peso;
	}

	// metodos
	
	@Override
	public abstract void comer();
	
	public abstract void dormir();



	@Override
	public String toString() {
		return getClass().getSimpleName() + " nombre=" + nombre + ", peso=" + peso; //muestra el nombre de la clase llamada(perro o gato)
	}
	
	
	
}
