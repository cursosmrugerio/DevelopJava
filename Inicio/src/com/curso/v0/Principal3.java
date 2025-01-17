package com.curso.v0;

public class Principal3 {

	public static void main(String[] args) {
		int x = 5; //Primitivos
		String cadena = "Hello"; //Objeto Inmutable
		StringBuilder sb = new StringBuilder("Hola"); //Objeto Mutable
		
		x = transforma(x,cadena,sb);
		
		System.out.println(x); //10
		System.out.println(cadena); //Hello
		System.out.println(sb); //Hola Mundo
		
	}
	
	static int transforma(int x, String cadena, StringBuilder sb) {
		sb.append(" Mundo");
		cadena.concat(" World");
		return x + 5;
	}

}
