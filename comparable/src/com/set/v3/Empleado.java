package com.set.v3;

public class Empleado{
	
	String nombre;
	int edad;
	double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		return this.nombre.equals(((Empleado)o).nombre);
	}
	
}
