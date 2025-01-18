package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Pato.getContador()); //0

		Pato pato1 = new Pato("Donald",10);
		Pato pato2 = new Pato("Lucas",8);
		Pato pato3 = new Pato("Patito Feo",9);
		
		System.out.println(Pato.getContador()); //3


		
	}

}
