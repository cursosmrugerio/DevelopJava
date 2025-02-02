package com.curso.v8;

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
		
		System.out.println("V8");
		
		//UPCASTING
		PatoSilvestre ps1 = new PatoSilvestre();
		Pato pato1 = ps1;
		Ave ave1 = pato1;
		Object object1 = ave1;
		
		//DOWNCASTING
		Ave ave2 = (Ave)object1;
		//Pato pato2 = (Pato)ave2;
		//pato2.volar();
		ave2.volar();
		
		
		Pato pato3 = new PatoSilvestre();
		pato3.volar();
		
		Object object4 = new PatoSilvestre();
		//object4.volar()
		
		
		
		
		

		
		
	}

}
