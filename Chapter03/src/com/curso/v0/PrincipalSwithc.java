package com.curso.v0;

enum Lenguajes{
	GO,
	PYTHON,
	JAVA,
	PHP
}

public class PrincipalSwithc {
	
	public static void main(String[] args) {
		String cadena = "Go";
		
		switch(cadena) {
			default:
				System.out.println("C");
			case "Go": case "Python":
				System.out.println("A");
				break;
			case "Java":
				System.out.println("B");
				break;
			case "PHP":
				System.out.println("D");
		}
	}

}
