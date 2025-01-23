package com.curso.v0;

public class Pato {
	
	private String nombre;

	public Pato(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		return this.nombre.equals(((Pato)obj).nombre);
	}
	
	

}
