package com.exception.v3;

public class Principal1 {

	public static void main(String[] args) {
		
		try {
			double d = raizCuadrada(-1);
			System.out.println(d);
		}catch(UnsupportedOperationException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Paso Finally");
		}
		
		System.out.println("EndPrograma");
	}

	private static double raizCuadrada(double d) throws UnsupportedOperationException {
		if (d<0)
			throw new UnsupportedOperationException("No se permiten negativos");
		double res = Math.sqrt(d);
		return res;
	}

}
