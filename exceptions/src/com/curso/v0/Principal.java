package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		int x = 2;
		int y = 0;
		
		int resultado = dividir(x,y);
		
		System.out.println(resultado);
	}

	private static int dividir(int x, int y) {
		return x/y;
	}

}
