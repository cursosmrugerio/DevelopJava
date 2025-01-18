package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Pato.contador); //0

		Pato pato1 = new Pato("Donald",10);
		Pato pato2 = new Pato("Lucas",8);
		Pato pato3 = new Pato("Patito Feo",9);
		
//		System.out.println(pato1.contador); //3
//		System.out.println(pato2.contador); //3
//		System.out.println(pato3.contador); //3
		
		System.out.println(Pato.contador); //3
		System.out.println(Pato.contador); //3
		System.out.println(Pato.contador); //3

		
	}

}
