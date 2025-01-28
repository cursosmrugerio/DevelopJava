package com.curso.v1;

public class Principal {

	public static void main(String[] args)  {

		int x = 8;
		int y = 0;
		
		int resultado;
		
		try {
			resultado = dividir(x,y);
			System.out.println(resultado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("EndProgram");
	}

	private static int dividir(int x, int y) throws Exception {
		if (y==0)
			throw new Exception("No se puede dividir entre Cero");
		return x/y;
	}

}
