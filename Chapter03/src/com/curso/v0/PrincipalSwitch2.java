package com.curso.v0;

public class PrincipalSwitch2 {
	
	public static void main(String[] args) {
		Lenguajes lenguaje = Lenguajes.JAVA;
		
		switch(lenguaje) {
			case GO: case PYTHON:
				System.out.println("A");
				break;
			case JAVA:
				System.out.println("B");
				break;
			case PHP:
				System.out.println("D");
				break;
			default:
				System.out.println("C");
		}
	}

}
