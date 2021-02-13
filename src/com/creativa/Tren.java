package com.creativa;

/**
 * @author achar
 *
 */
public class Tren {

	private String color;
	private int numeroVagones;
	private String tipo;
	private int velocidadMaxima;
	
	public Tren(String color, int numeroVagones, String tipo, int velocidadMaxima) {
		this.color = color;
		this.numeroVagones = numeroVagones;
		this.tipo = tipo;
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroVagones() {
		return numeroVagones;
	}

	public void setNumeroVagones(int numeroVagones) {
		this.numeroVagones = numeroVagones;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public void pitar() {}
	
	public void aumentarVelocidad() {}
	
	public void cerrarPuertas() {}

	@Override
	public String toString() {
		return "Tren [color=" + color + ", numeroVagones=" + numeroVagones + ", tipo=" + tipo + ", velocidadMaxima="
				+ velocidadMaxima + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("****** Tren " + this.tipo + " al basurero ******");
	}
}
