package com.curso.v4;

import com.curso.v3.Pato;
//import static com.curso.v3.Pato.contador;
//import static com.curso.v3.Pato.getContador;
import static com.curso.v3.Pato.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(getContador()); //0

		Pato pato1 = new Pato("Donald",10);
		Pato pato2 = new Pato("Lucas",8);
		Pato pato3 = new Pato("Patito Feo",9);
		
		System.out.println(getContador()); //3

	}

}
