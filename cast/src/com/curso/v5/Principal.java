package com.curso.v5;

import java.util.Random;

class Ave {
	String tipo = "AVE";
	void volar(){
		System.out.println("Ave Volar");
	}
	void volarAve() {
		System.out.println("volarAve()");
	}
}
class Pinguino extends Ave {
	String tipo = "Pinguino";
	void volar(){
		System.out.println("Pinguino No Volar");
	}
	void volarPinguino() {
		System.out.println("volarPinguino()");
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
		
		Ave ave = getAve();
		System.out.println(ave.getClass().getSimpleName());
		
		if (ave instanceof Pato && ave instanceof PatoSilvestre duck)
			//duck.volarPato();
			duck.volarPatoSilvestre();
		else if (ave instanceof Pinguino pin)
			pin.volarPinguino();
		else
			ave.volarAve();
		

	}
	
	static Ave getAve() {
		Ave[] aves = {new Ave(),new PatoSilvestre(),new Pato(),new Pinguino()};
		int random = new Random().nextInt(aves.length);
		return aves[random];
	}
}
