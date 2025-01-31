package com.curso.generics.v1;

public class Principal {

	public static void main(String[] args) {
		Bici bici = new Bici("BiciX");
		Motoneta motoneta = new Motoneta("MotonetaZ");
		Moto moto = new Moto("MotoT");
		
		Contenedor<Motoneta> cont1 = 
				new Contenedor<Motoneta>(motoneta);
		Motoneta m = cont1.getT();
		System.out.println(m);
		
		Contenedor<Bici> cont2 = 
				new Contenedor<>(bici);
		Bici b = cont2.getT();
		System.out.println(b);

		
	}

}
