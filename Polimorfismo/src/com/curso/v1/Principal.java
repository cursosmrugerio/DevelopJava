package com.curso.v1;

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
		Ave ave1 = new Ave();
		ave1.volar();
		Ave ave2 = new Pato();
		ave2.volar();
		Ave ave3 = new Pinguino();
		ave3.volar();
	}
}
