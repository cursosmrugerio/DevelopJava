package com.curso.v0;

public class Suma extends Operacion {
	
	Suma(int x, int y){
		super(x,y);
	}
	
	@Override
	int ejecuta() {
		return x+y;
	}
	
	@Override
	public String toString() {
		return "Suma [x=" + x + ", y=" + y + "]";
	}

}
