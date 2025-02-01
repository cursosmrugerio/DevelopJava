package com.curso.generics.v4;

public class Moto implements Transporte {
	
	String tipoMoto;

	public Moto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}

	@Override
	public String toString() {
		return "Moto [tipoMoto=" + tipoMoto + "]";
	}
	
	

}
