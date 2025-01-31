package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		Bici bici = new Bici("BiciX");
		Motoneta motoneta = new Motoneta("MotonetaZ");
		Moto moto = new Moto("MotoT");
		
		Contenedor cb = new Contenedor(bici);
	}

}
