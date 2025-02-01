package com.curso.generics.v4;

public class Bici implements Transporte {
	
	String tipoBici;

	public Bici(String tipoBici) {
		this.tipoBici = tipoBici;
	}

	@Override
	public String toString() {
		return "Bici [tipoBici=" + tipoBici + "]";
	}
	

}
