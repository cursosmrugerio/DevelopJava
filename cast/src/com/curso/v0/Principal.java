package com.curso.v0;

class Ave {
	void volar(){
		System.out.println("Ave Volar");
	}
	void volarAve() {
		System.out.println("volarAve()");
	}
}

class Pato extends Ave {
	void volar(){
		System.out.println("Pato Volar");
	}
	void volarPato() {
		System.out.println("volarPato()");
	}
}
class PatoSilvestre extends Pato {
	void volar(){
		System.out.println("PatoSilvestre Volar");
	}
	void volarPatoSilvestre() {
		System.out.println("volarPatoSilvestre()");
	}
}

public class Principal{
	public static void main(String[] args) {
		Ave ave1 = new Ave();
		ave1.volar();
		ave1.volarAve();
		
		System.out.println("**PATO**");
		Ave ave2 = new Pato();
		ave2.volar();
		ave2.volarAve();
		((Pato)ave2).volarPato();
		
		System.out.println("**PATO SILVESTRE**");
		Ave ave3 = new PatoSilvestre();
		ave3.volar();
		ave3.volarAve();
		((Pato)ave3).volarPato();
		((PatoSilvestre)ave3).volarPatoSilvestre();
		
		
	}
}
