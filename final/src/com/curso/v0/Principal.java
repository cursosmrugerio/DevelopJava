package com.curso.v0;

class Ave {
	final void volar(){}
	final static void comer(){}
}

class Pato extends Ave{
//	@Override
//	void volar(){}
	
//	static void comer(){}
}

public class Principal {

	public final static void main(String[] args) {
		final int x = 5;
		//x = 10;

		System.out.println("x:"+5);
		
		final StringBuilder sb = new StringBuilder("Hello");
		sb.append("World");
		//sb = new StringBuilder("Hola");
		//sb = null;
		
		System.out.println(sb);
		
		final String s = "Hola";
		//s = s.concat("Mundo");
		//s = null;
		
		
	}

}
