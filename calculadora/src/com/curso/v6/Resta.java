package com.curso.v6;

public class Resta implements Operacion {
	
	int pato1;
	int pato2;
	
	Resta(int duck1, int duck2){
		pato1 = duck1;
		pato2 = duck2;
	}
	
	@Override
	public int ejecuta() {
		return pato1-pato2;
	}

	@Override
	public String toString() {
		return "Resta [x=" + pato1 + ", y=" + pato2 + "]";
	}
	
}

