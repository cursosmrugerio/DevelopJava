package com.curso.v3;

public class Empleado {
	
	String nombre;
	int edad;
	double sueldo;
	
	Empleado(String nombre,int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	//Overloading 
	
//	void cobrar() {
//		System.out.println("Sin Parámetros");
//	}
	
//	void cobrar(int i) {
//		System.out.println("int");
//	}
	
//	void cobrar(long l) {
//		System.out.println("long");
//	}
//	
//	void cobrar(float f) {
//		System.out.println("float");
//	}
	
//	void cobrar(Integer integer) {
//		System.out.println("Integer");
//	}
	
	void cobrar(Long longW) {
		System.out.println("Long");
	}
	
//	void cobrar(int... ints) {
//		System.out.println("int...");
//	}
	
//	void cobrar(int[] ints) {
//		System.out.println("int...");
//	}
	
	void cobrar(Integer... ints) {
		System.out.println("Integer...");
	}
	
//	void cobrar(Object o) {
//		System.out.println("Object");
//	}
	
	public static void main(String... args) {
		
		//float f = 5;
		//Long l = 5;
		
		Empleado emp = new Empleado("Filologo",30);
		
		emp.cobrar(1);
		
	}

}
