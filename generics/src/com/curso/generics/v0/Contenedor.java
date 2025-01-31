package com.curso.generics.v0;

public class Contenedor<T> {
	
	T t;
	
	public Contenedor(T t) {
		this.t = t;
	}
	
	T getT() {
		return t;
	}

}
