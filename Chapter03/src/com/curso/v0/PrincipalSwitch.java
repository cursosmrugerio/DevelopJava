package com.curso.v0;

public class PrincipalSwitch {
	
	public static void main(String[] args) {
		String cadena = "Java";
		
		switch(cadena) {
			default:
				System.out.println("C");
			case "Go": case "Python":
				System.out.println("A");
				break;
			case "Javax":
				System.out.println("B");
				break;
			case "PHP":
				System.out.println("D");
		}
	}

}
