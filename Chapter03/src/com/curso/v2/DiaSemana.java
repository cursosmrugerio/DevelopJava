package com.curso.v2;

public enum DiaSemana {
	LUNES(),
	MARTES(),
	MIERCOLES("Medio"),
	JUEVES("Medio"),
	VIERNES("Alto"),
	SABADO("Alto"),
	DOMINGO("Alto"){
		@Override
		String getVisitas() {
			return "Dia Especial, "+visitas;
		}
	};
	
	String visitas;
	private static int capacidad = 1000;
	
	DiaSemana(){
		visitas = "Bajo";
	}
	
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
