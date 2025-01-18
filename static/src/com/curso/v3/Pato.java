package com.curso.v3;

public class Pato {
	
	String nombre; 
	int edad; 
	////Variable (Propiedad, Atributo) de la Clase
	public static int contador; 
	
	public Pato(String nombre, int edad) {
		this.nombre = nombre; 
		this.edad = edad;
		contador++;
	}
	
	//Método de Clase
	public static int getContador() {
		return contador;
	}
	
	//public,protected,default*,private //JAVA8
	//3 Tipos de public //JAVA9

}
