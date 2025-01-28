package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;

		int resultado;

		try {
			resultado = dividir(x, y);
			System.out.println(resultado);
		}catch(DividirCeroException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("EndProgram");

	}

	private static int dividir(int x, int y) {
		if (y == 0)
			throw new DividirCeroException("No se puede dividir entre Cero");
		return x / y;
	}

}
