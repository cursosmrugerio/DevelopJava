package com.exception.v1;


public class Principal2 {

	public static void main(String[] args) {

		try {
			//FileReader fr = new FileReader("Temario.txt");
			throw new UnsupportedOperationException("Algo salio mal");
		} finally {
			System.out.println("Paso por Finally");
		}

	}

}
