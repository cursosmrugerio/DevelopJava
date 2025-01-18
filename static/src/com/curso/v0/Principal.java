package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Pato pato1 = new Pato("Donald",10);
		Pato pato2 = new Pato("Lucas",8);
		Pato pato3 = new Pato("Patito Feo",9);
		
		System.out.println(pato1.contador); //1
		System.out.println(pato2.contador); //1
		System.out.println(pato3.contador); //1

		System.out.println(pato1.nombre); 
		System.out.println(pato2.nombre); 
		System.out.println(pato3.nombre);

		
	}

}
