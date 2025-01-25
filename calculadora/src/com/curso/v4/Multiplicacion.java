package com.curso.v4;

public class Multiplicacion extends Operacion {
	
	Multiplicacion(int x, int y){
		super(x,y);
	}
	
	@Override
	int ejecuta() {
		return x*y;
	}
	

}
