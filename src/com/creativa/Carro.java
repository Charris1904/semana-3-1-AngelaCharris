package com.creativa;

/**
 * @author achar
 *
 */
public class Carro {

	private String marca;
	private int numeroPasajeros;
	private String modelo;
	private String color;
	
	public Carro(String marca, int numeroPasajeros, String modelo, String color) {
		this.marca = marca;
		this.numeroPasajeros = numeroPasajeros;
		this.modelo = modelo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void encender() {}
	
	public void frenar() {}
	
	public void encenderLuces() {}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", numeroPasajeros=" + numeroPasajeros + ", modelo=" + modelo + ", color="
				+ color + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("****** Carro " + this.marca + " " + this.modelo + " al basurero ******");
	}
}
