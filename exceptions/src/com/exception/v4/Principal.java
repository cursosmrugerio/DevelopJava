package com.exception.v4;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V4");
		try {
		double d = raizCuadrada(-1);
		System.out.println(d);
		}catch(OperacionNoSoportada e){
			System.out.println(e);
		}
		System.out.println("EndPrograma");
	}

	private static double raizCuadrada(double d) throws OperacionNoSoportada {
		if (d < 0)
			throw new OperacionNoSoportada("No se permiten negativos");
		double res = Math.sqrt(d);
		return res;
	}

}
