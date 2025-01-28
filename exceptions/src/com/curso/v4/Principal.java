package com.curso.v4;

public class Principal {

	public static void main(String[] args)  {

		int x = 8;
		int y = -4;

		int resultado;

		try {
			resultado = dividir(x, y);
			System.out.println(resultado);
		} catch (DividirCeroException e) {
			e.printStackTrace();
		} catch (NegativoException e) {
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
		return x / y;
	}

}
