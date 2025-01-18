package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(new Pato("Pato Rico",10).getContador()); //1

		Pato pato1 = new Pato("Donald",10);
		Pato pato2 = new Pato("Lucas",8);
		Pato pato3 = new Pato("Patito Feo",9);
		
		System.out.println(pato3.getContador()); //4


		
	}

}
