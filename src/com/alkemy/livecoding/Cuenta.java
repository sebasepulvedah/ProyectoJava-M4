package com.alkemy.livecoding;

public class Cuenta {

	private String alias;
	private String nroCuenta;
	protected double balance;
	private Cliente cliente;
	
	
	public Cuenta() {
		super();
	}


	public Cuenta(String alias, String nroCuenta, Cliente cliente) {
		super();
		this.alias = alias;
		this.nroCuenta = nroCuenta;
		this.cliente = cliente;
	}


	public Cuenta(String alias, String nroCuenta, double balance, Cliente cliente) {
		super();
		this.alias = alias;
		this.nroCuenta = nroCuenta;
		this.balance = balance;
		this.cliente = cliente;
	}


	public String getAlias() {
		return alias;
	}


	public void setAlias(String alias) {
		this.alias = alias;
	}


	public String getNroCuenta() {
		return nroCuenta;
	}


	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Cuenta [alias=" + alias + ", nroCuenta=" + nroCuenta + ", balance=" + balance + ", cliente=" + cliente
				+ "]";
	}
	
	
}
