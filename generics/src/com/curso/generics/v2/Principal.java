package com.curso.generics.v2;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V2");
		
		Bici bici = new Bici("BiciX");
		Motoneta motoneta = new Motoneta("MotonetaZ");
		Moto moto = new Moto("MotoT");
		
		Contenedor<Motoneta> cont1 = 
				new Contenedor<Motoneta>(motoneta);
		Motoneta m = cont1.getTransporte();
		System.out.println(m);
		
		Contenedor<Bici> cont2 = 
				new Contenedor<>(bici);
		Bici b = cont2.getTransporte();
		System.out.println(b);
		
		Contenedor<StringBuilder> cont3 = 
				new Contenedor<>(new StringBuilder("HELLO"));
		StringBuilder sb = cont3.getTransporte();
		System.out.println(sb);

		
	}

}
