package com.curso.v3;

public enum DiaSemana {
	LUNES("Bajo"){
		@Override
		String getPromociones() {return "";}
	},
	MARTES("Bajo"){
		@Override
		String getPromociones() {return "";}
	},
	MIERCOLES("Medio"){
		@Override
		String getPromociones() {return "";}
	},
	JUEVES("Medio"){
		@Override
		String getPromociones() {return "";}
	},
	VIERNES("Alto"){
		@Override
		String getPromociones() {return "";}
	},
	SABADO("Alto"){
		@Override
		String getPromociones() {return "";}
	},
	DOMINGO("Alto"){
		@Override
		String getVisitas() {
			return "Dia Especial, "+visitas;
		}
		@Override
		String getPromociones() {return "PALOMINAS 2X1";}
	};
	
	String visitas;
	
	DiaSemana(String visitas) {
		this.visitas = visitas;
	}
	
	String getVisitas() {
		return visitas;
	}
	
	abstract String getPromociones();
	
}
