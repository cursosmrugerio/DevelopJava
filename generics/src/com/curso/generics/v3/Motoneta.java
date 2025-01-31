package com.curso.generics.v3;

public class Motoneta implements Transporte {
	
	String tipoMotoneta;

	public Motoneta(String tipoMotoneta) {
		this.tipoMotoneta = tipoMotoneta;
	}

	@Override
	public String toString() {
		return "Motoneta [tipoMotoneta=" + tipoMotoneta + "]";
	}
	

}
