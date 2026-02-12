package com.alkemy.f20260211;

public class Empresa {

	private int id;
	private String nombre;
	private String sitioWeb;
	private Pais pais; // agregacion o composicion
	private Sector sector;
	//pais_id y sector_id
	//private int pais_id;
	//private int sector_id;

	public Empresa() {
			
	}
	public Empresa(int id, String nombre, String sitioWeb) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sitioWeb = sitioWeb;

	}
	public Empresa(int id, String nombre, String sitioWeb, Pais pais, Sector sector) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sitioWeb = sitioWeb;
		this.pais = pais;
		this.sector = sector;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSitioWeb() {
		return sitioWeb;
	}
	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", sitioWeb=" + sitioWeb + ", pais=" + pais + ", sector="
				+ sector + "]";
	}
	
}	

