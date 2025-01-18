package com.curso.v2;

public class Pato {
	
	String nombre; 
	int edad; 
	////Variable (Propiedad, Atributo) de la Clase
	private static int contador; 
	
	public Pato(String nombre, int edad) {
		this.nombre = nombre; 
		this.edad = edad;
		contador++;
	}
	
	//Método de Instancia de Clase
	int getContador() {
		return contador;
	}

}
