package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("**Pato**");
		Pato pato1 = new Pato("Donald");
		Pato pato2 = new Pato("Donald");
		System.out.println(pato1.equals(pato2)); //true

		System.out.println("**String**");
		String s1 = "Hola";
		String s2 = new String("Hola");
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println("**SB**");
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); //false
		
		
		
	}

}
