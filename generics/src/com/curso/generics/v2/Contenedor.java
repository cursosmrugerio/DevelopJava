package com.curso.generics.v2;

public class Contenedor<Z> {
	
	Z transporte;
	
	public Contenedor(Z transporte) {
		this.transporte = transporte;
	}
	
	Z getTransporte() {
		return transporte;
	}

}
