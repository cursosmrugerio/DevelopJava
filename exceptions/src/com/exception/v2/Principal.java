package com.exception.v2;

public class Principal {

	public static void main(String[] args) {
		
		double d = raizCuadrada(-1);
		System.out.println(d);
		
		System.out.println("EndPrograma");
	}

	private static double raizCuadrada(double d) {
		if (d<0)
			throw new UnsupportedOperationException("No se permiten negativos");
		double res = Math.sqrt(d);
		return res;
	}

}
