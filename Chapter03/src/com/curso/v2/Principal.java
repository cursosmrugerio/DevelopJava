package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia);
		System.out.println(dia.visitas);
		System.out.println(dia.getVisitas());
		
		System.out.println(DiaSemana.getCapacidad());
		
	}

}
