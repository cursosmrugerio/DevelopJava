package com.curso.v0;

public class Empleado {
	
	String nombre;
	int edad;
	double sueldo;
	
	Empleado(){}
	
	Empleado(String nombre){
		this.nombre = nombre;
		System.out.println("Nombre");
	}

	public static void main(String[] args) {
		Empleado emp = new Empleado();
		System.out.println("Fin de Programa");
	}

}
