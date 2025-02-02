package com.curso.v10;

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
		
		System.out.println("V10");
		
		PatoSilvestre ps1 = new PatoSilvestre();
		Pato pato1 = ps1;
		Ave ave1 = pato1;
		Object object = ave1;
		
		
		
		
		
		
		
		
		Ave ave2 = (Ave)object;
		
		if (ave2 instanceof Pinguino pin1) {
			pin1.volar();
		}else if (ave2 instanceof Pato pato2) {
			pato2.volar();
		}
	}

}
