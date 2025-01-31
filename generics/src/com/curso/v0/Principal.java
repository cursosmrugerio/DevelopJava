package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		Bici bici = new Bici("BiciX");
		Motoneta motoneta = new Motoneta("MotonetaZ");
		Moto moto = new Moto("MotoT");
		
		ContenedorBici cb = new ContenedorBici(bici);
	}

}
