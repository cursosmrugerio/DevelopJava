package com.curso.v1;

class Ave {
	String tipo = "AVE";
	void volar(){
		System.out.println("Ave Volar");
	}
	void volarAve() {
		System.out.println("volarAve()");
	}
}

class Pato extends Ave {
	String tipo = "PATO";
	void volar(){
		System.out.println("Pato Volar");
	}
	void volarPato() {
		System.out.println("volarPato()");
	}
}
class PatoSilvestre extends Pato {
	String tipo = "PATO SILVESTRE";
	void volar(){
		System.out.println("PatoSilvestre Volar");
	}
	void volarPatoSilvestre() {
		System.out.println("volarPatoSilvestre()");
	}
}

public class Principal{
	public static void main(String[] args) {
		System.out.println("**AVE**");
		Ave ave1 = new Ave();
		System.out.println(ave1.tipo);

		System.out.println("**PATO**");
		Ave ave2 = new Pato();
		System.out.println(((Pato)ave2).tipo);
		
		System.out.println("**PATO SILVESTRE**");
		Ave ave3 = new PatoSilvestre();
		System.out.println(((PatoSilvestre)ave3).tipo);

	}
}
