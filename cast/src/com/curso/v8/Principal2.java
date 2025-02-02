package com.curso.v8;

public class Principal2{
	
	public static void main(String[] args) {
		
		Object object1 = new PatoSilvestre();
		((Ave)object1).volar();
		((Pato)object1).volar();
		((PatoSilvestre)object1).volar();
		
		Object object2 = new PatoSilvestre();
		System.out.println(((Ave)object2).tipo);
		System.out.println(((Pato)object2).tipo);
		System.out.println(((PatoSilvestre)object2).tipo);
	}

}
