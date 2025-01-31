package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		Bici bici = new Bici("BiciX");
		Motoneta motoneta = new Motoneta("MotonetaZ");
		Moto moto = new Moto("MotoT");
		
		Contenedor contenedor = new Contenedor(bici);
		
		bici = (Bici)(contenedor.getObject());
		
		System.out.println(bici);
		
		contenedor = new Contenedor(new StringBuilder("Patito"));
	}

}
