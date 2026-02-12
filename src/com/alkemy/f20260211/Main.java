package com.alkemy.f20260211;

public class Main {

	public static void main(String[] args) {
		//Crear un objeto sector() es una instancia de una clase.
		
		Sector sectorCero = new Sector(); //constructor vacio
		
		//asignar valores con setter, cambiar.
		sectorCero.setId(10);
		Sector sectorUno = new Sector(5,"Sector Uno");
		
		
		//llamado al metodo toString, representacion de los valores de los atributos.
		System.out.println(sectorCero.toString()); // Sector [id=10, nombre=null]
		System.out.println(sectorUno.toString()); // Sector [id=5, nombre=Sector Uno]
		
		Pais paisCero = new Pais();
		Pais paisUno = new Pais();
		
		paisCero.setNombre("Chile");
		System.out.println(paisCero.toString());//Pais [id=0, nombre=Chile]
		System.out.println(paisUno.toString());// Pais [id=0, nombre=null]
		sectorCero.setId(15);
		//obtener datos
		
		int identificador = sectorCero.getId(); // capturar dato y pasarlo a otra variable
		System.out.println(identificador +5); // 20
		System.out.println(sectorUno.getId()); // imprimir dato. 5
		System.out.println(paisCero.getNombre());//chile
		System.out.println();
		System.out.println(sectorCero.toString()); // 15 NULL
		System.out.println(sectorUno.toString()); // 5 SECTOR UNO
		
		Canal canalCero = new Canal(0,"CanalCero");
		System.out.println(canalCero.nombre);
		System.out.println(canalCero.getNombre());
		
		//objeto empresa
		//Empresa empresaUno = new Empresa(1,"Alfasoft","https://alfasoft.example");
		Empresa empresaUno = new Empresa();
		empresaUno.setId(1);
		empresaUno.setNombre("Alfasoft");
		empresaUno.setSitioWeb("https://alfasoft.example");
		paisUno.setId(1);
		paisUno.setNombre("España");
		empresaUno.setPais(paisUno); 
		
		sectorUno.setId(1);
		sectorUno.setNombre("Software");
		empresaUno.setSector(sectorUno); // 1 variable de tipo obj- los set se crean solo una vez, ya que el contenido solamente cambia.
		
		
		System.out.println("¨¨INFORMACION DE EMPRESA¨¨");
		System.out.println(empresaUno.toString()); // mpresa [id=1, nombre=Alfasoft, sitioWeb=https://alfasoft.example, pais=Pais [id=1, nombre=España], sector=null]
		
	}

}
