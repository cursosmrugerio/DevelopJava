package com.curso.v0;

public class PrincipalEnums {

	public static void main(String[] args) {
		
		Lenguajes[] array = Lenguajes.values();
		
		for(Lenguajes len: array) {
			System.out.println(len.ordinal());
			System.out.println(len);
		}
		
		Lenguajes lengAcademia = Lenguajes.JAVA;
		System.out.println("******");
		Lenguajes len = lengAcademia.valueOf("JAVA");
		System.out.println(len);
		
		String cadena = lengAcademia.name();
		System.out.println("String: "+cadena);
		

	}

}
