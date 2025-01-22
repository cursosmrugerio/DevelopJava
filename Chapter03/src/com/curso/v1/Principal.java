package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.MARTES;
		
		System.out.println(dia);
		System.out.println(dia.visitas);
		System.out.println(dia.getVisitas());
		
		System.out.println(DiaSemana.getCapacidad());
	}

}
