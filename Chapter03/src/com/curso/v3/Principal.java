package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia);
		System.out.println(dia.visitas);
		System.out.println(dia.getVisitas());
		
		System.out.println(dia.getPromociones());
	}

}
