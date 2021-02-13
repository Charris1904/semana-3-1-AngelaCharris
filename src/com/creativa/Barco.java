package com.creativa;

/**
 * @author achar
 *
 */
public class Barco {

	private String compania;
	private String color;
	private int numeroAnclas;
	
	public Barco(String compania, String color, int numeroAnclas) {
		this.compania = compania;
		this.color = color;
		this.numeroAnclas = numeroAnclas;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroAnclas() {
		return numeroAnclas;
	}

	public void setNumeroAnclas(int numeroAnclas) {
		this.numeroAnclas = numeroAnclas;
	}
	
	public void aumentarVelocidad() {}
	
	public void tirarAncla() {}
	
	public void cambiarCurso() {}

	@Override
	public String toString() {
		return "Barco [compañia=" + compania + ", color=" + color + ", numeroAnclas=" + numeroAnclas
				+ "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("****** Barco " + this.compania + " al basurero ******");
	}
	
	

}
