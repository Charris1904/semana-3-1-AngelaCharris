package com.creativa;

/**
 * @author achar
 *
 */
public class Bicicleta {

	private String color;
	private int tamano;
	private String tipo;
	private int precio;
	
	public Bicicleta(String color, int tamano, String tipo, int precio) {
		this.color = color;
		this.tamano = tamano;
		this.tipo = tipo;
		this.precio = precio;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void pedalear() {}
	
	public void frenar() {}
	
	public void girarLadoIzquierdo() {}
	
	
	@Override
	public String toString() {
		return "Bicicleta [color=" + color + ", tamano=" + tamano + ", tipo=" + tipo + ", precio=" + precio + "]";
	}

	@Override
	protected void finalize() throws Throwable{
		System.out.println("****** Bicicleta " + this.tipo + " al basurero ******");
	}

}
