package com.curso.v2;

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
		Ave ave;
		
		ave = new Ave();
		ave.volar();
		ave = new Pato();
		ave.volar();
		ave = new Pinguino();
		ave.volar();
	}
}
