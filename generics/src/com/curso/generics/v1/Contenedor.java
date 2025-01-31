package com.curso.generics.v1;

public class Contenedor<patito> {
	
	patito pat;
	
	public Contenedor(patito pat) {
		this.pat = pat;
	}
	
	patito getT() {
		return pat;
	}

}
