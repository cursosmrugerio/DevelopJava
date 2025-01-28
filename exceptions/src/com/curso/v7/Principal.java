package com.curso.v7;

public class Principal {

	public static void main(String[] args)  {

		int x = 1005;
		int y = 5;

		int resultado;

		try {
			resultado = dividir(x, y);
			System.out.println(resultado);
		} catch (DividirCeroException | NegativoException | UnsupportedOperationException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Paso por Finally");
		}

		System.out.println("EndProgram");

	}

	private static int dividir(int x, int y) 
			throws DividirCeroException, NegativoException {
		if (y == 0)
			throw new DividirCeroException("No se puede dividir entre Cero");
		if (y<0)
			throw new NegativoException("No se puede dividir entre negativos");
		if (x>1000)
			throw new UnsupportedOperationException("x no puede ser mayor a 1000");
		return x / y;
	}

}
