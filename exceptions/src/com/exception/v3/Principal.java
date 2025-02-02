package com.exception.v3;

public class Principal {

	public static void main(String[] args)  {
		
		double d=0;
		try {
			d = raizCuadrada(-1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(d);
		
		System.out.println("EndPrograma");
	}

	private static double raizCuadrada(double d) throws Exception {
		if (d<0)
			throw new Exception("No se permiten negativos");
		double res = Math.sqrt(d);
		return res;
	}

}
