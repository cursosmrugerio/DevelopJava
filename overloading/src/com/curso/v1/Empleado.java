package com.curso.v1;

public class Empleado {
	
	String nombre;
	int edad;
	double sueldo;
	
	//Overloading (Sobrecarga) de Constructores
	
	Empleado(){
		this("Epeneto");
		System.out.println("Constructor");
	}
	
	Empleado(String nombre){
		this.nombre = nombre;
		System.out.println("Constructor Nombre");
	}
	
	Empleado(String nombre,int edad){
		this.nombre = nombre;
		this.edad = edad;
		System.out.println("Constructor Nombre/Edad");
	}

	public static void main(String[] args) {
		Empleado emp1 = new Empleado();
		System.out.println(emp1.nombre);
		
		//Empleado emp2 = new Empleado("Patrobas",20);
		
		System.out.println("Fin de Programa");
	}

}
