package com.curso.v2;

public class Suma extends Operacion {
	
	Suma(int x, int y){
		super(x,y);
	}
	
	@Override
	int ejecuta() {
		return x+y;
	}
	

}
