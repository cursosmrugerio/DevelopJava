package com.curso.v0;

public class Principal1 {

	public static void main(String[] args) {
		int x = 5; //Primitivos
		String cadena = "Hello"; //Objeto Inmutable
		StringBuilder sb = new StringBuilder("Hola"); //Objeto Mutable
		
		cadena = transforma(x,cadena,sb);
		
		System.out.println(x); //5
		System.out.println(cadena); //Hello World
		System.out.println(sb); //Hola Mundo
		
	}
	
	static String transforma(int x, String cadena, StringBuilder sb) {
		x = x + 5;
		sb.append(" Mundo");
		return cadena.concat(" World");
	}

}
