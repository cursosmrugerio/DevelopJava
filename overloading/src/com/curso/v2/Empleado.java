package com.curso.v2;

public class Empleado {
	
	String nombre;
	int edad;
	double sueldo;
	
	//Overloading (Sobrecarga) de Constructores
	
	Empleado(){
		this("Epeneto",99);
		System.out.println("Constructor");
	}
	
	Empleado(String nombre){
		this(nombre,99);
		System.out.println("Constructor Nombre");
	}
	
	Empleado(String nombre,int edad){
		super();
		this.nombre = nombre;
		this.edad = edad;
		System.out.println("Constructor Nombre/Edad");
	}

	public static void main(String[] args) {
		Empleado emp1 = new Empleado();
		System.out.println(emp1.nombre);
		System.out.println(emp1.edad);
		
		Empleado emp2 = new Empleado("Patrobas");
		System.out.println(emp2.nombre);
		System.out.println(emp2.edad);
		
		System.out.println("Fin de Programa");
	}

}
