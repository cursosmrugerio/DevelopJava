package com.curso.v1;

public enum DiaSemana {
	LUNES("Bajo"),
	MARTES("Bajo"),
	MIERCOLES("Medio"),
	JUEVES("Medio"),
	VIERNES("Alto"),
	SABADO("Alto"),
	DOMINGO("Alto");
	
	String visitas;
	private static int capacidad = 1000;
	
	DiaSemana(String visitas) {
		this.visitas = visitas;
	}
	
	String getVisitas() {
		return visitas;
	}
	
	static int getCapacidad() {
		return capacidad;
	}
}
