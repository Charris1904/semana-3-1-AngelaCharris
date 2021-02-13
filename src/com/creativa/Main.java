package com.creativa;
/**
 * @author achar
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("****************** BICICLETA ******************");
		Bicicleta biciMTB = new Bicicleta("Rojo", 20, "MTB", 1000000);
		Bicicleta biciRuta = new Bicicleta("Negra", 15, "Ruta", 1500000);
		biciMTB = null;
		biciRuta = null;
		
		System.out.println("****************** BARCO ******************");
		Barco barco1 = new Barco("Royal Caribbean", "Blanco", 1);
		Barco barco2 = new Barco("Celebrity Cruises", "Rojo", 2);
		barco1 = null;
		barco2 = null;
		System.gc();
		
		System.out.println("****************** AVION ******************");
		Avion avion1 = new Avion("Boeing 747", 416, 8, "Blanco");
		Avion avion2 = new Avion("Airbus A330", 375, 4, "Azul");
		avion1 = null;
		avion2 = null;
		System.gc();

		System.out.println("****************** CARRO ******************");
		Carro carro1 = new Carro("Toyota", 5, "Yaris", "Celeste");
		Carro carro2 = new Carro("Suzuki", 8, "XL7", "Negro");
		carro1 = null;
		carro2 = null;
		System.gc();
		
		System.out.println("****************** Tren ******************");
		Tren tren1 = new Tren("Rojo", 10, "Comercial", 400);
		Tren tren2 = new Tren("Gris", 8, "Carga", 300);
		tren1 = null;
		tren2 = null;
		System.gc();
	}

}
