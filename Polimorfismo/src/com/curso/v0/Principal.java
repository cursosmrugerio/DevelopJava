package com.curso.v0;

class Ave {
	void volar(){
		System.out.println("Volar Ave");
	}
}

class Pato extends Ave {
	@Override
	void volar(){
		System.out.println("Volar Pato");
	}
}
class Pinguino extends Ave {
	@Override
	void volar(){
		System.out.println("Volar Pinguino");
	}
}

public class Principal{
	public static void main(String[] args) {
		Ave ave = new Ave();
		ave.volar();
		Pato pato = new Pato();
		pato.volar();
		Pinguino pinguino = new Pinguino();
		pinguino.volar();
	}
}
