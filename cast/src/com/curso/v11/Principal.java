package com.curso.v11;

class Ave {
	String tipo = "AVE";

	void volar() {
		System.out.println("Ave Volar");
	}

	void volarAve() {
		System.out.println("volarAve()");
	}
}

class Pinguino extends Ave {
	String tipo = "Pinguino";

	@Override
	void volar() {
		System.out.println("Pinguino No Volar");
	}

	void volarPinguino() {
		System.out.println("volarPinguino()");
	}
}

class Pato extends Ave {
	String tipo = "PATO";

	void volar() {
		System.out.println("Pato Volar");
	}

	void volarPato() {
		System.out.println("volarPato()");
	}
}

class PatoSilvestre extends Pato {
	String tipo = "PATO SILVESTRE";

	void volar() {
		System.out.println("PatoSilvestre Volar");
	}

	void volarPatoSilvestre() {
		System.out.println("volarPatoSilvestre()");
	}
}

public class Principal {
	public static void main(String[] args) {
		Ave ave = new Pinguino();
		((Pinguino)(Ave)(Object)ave).volarPinguino();
		
		Pato pato = new PatoSilvestre();
		pato.volarPato();
		((PatoSilvestre)pato).volarPatoSilvestre();
	}

}
