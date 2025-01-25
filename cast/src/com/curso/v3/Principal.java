package com.curso.v3;

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
		
		Pato pato = new Pato();
		Ave ave = pato; //UPCASTING
		if (ave instanceof Pinguino) {
			Pinguino ping = (Pinguino)ave; //DOWNCASTING
			ping.volar(); 
		}else {
			ave.volar();
		}
		

	}
}
