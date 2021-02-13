package com.creativa;

/**
 * @author achar
 *
 */
public class Avion {

	private String modelo;
	private int numeroAsientos;
	private int numeroPuertasEmergencia;
	private String color;
	
	public Avion(String modelo, int numeroAsientos, int numeroPuertasEmergencia, String color) {
		this.modelo = modelo;
		this.numeroAsientos = numeroAsientos;
		this.numeroPuertasEmergencia = numeroPuertasEmergencia;
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	public int getNumeroPuertasEmergencia() {
		return numeroPuertasEmergencia;
	}

	public void setNumeroPuertasEmergencia(int numeroPuertasEmergencia) {
		this.numeroPuertasEmergencia = numeroPuertasEmergencia;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void sacarLlantas() {}
	
	public void despegar() {}
	
	public void bloquearPuertas() {}

	@Override
	public String toString() {
		return "Avion [modelo=" + modelo + ", numeroAsientos=" + numeroAsientos + ", numeroPuertasEmergencia="
				+ numeroPuertasEmergencia + ", color=" + color + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("****** Avion " + this.modelo + " al basurero ******");
	}
}
