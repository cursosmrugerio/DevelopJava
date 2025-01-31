package com.curso.generics.v3;

public class Contenedor<Z extends Transporte> {
	
	Z transporte;
	
	public Contenedor(Z transporte) {
		this.transporte = transporte;
	}
	
	Z getTransporte() {
		return transporte;
	}

}
