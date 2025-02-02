package com.curso.v6;

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
		
		Ave ave = new PatoSilvestre();
		ave.volar(); //OBJETO
		System.out.println(ave.tipo); //VARIABLE REFERENCIA
		
		Pato pato = (Pato)ave;
		
		PatoSilvestre ps1 = new PatoSilvestre();
		Ave ave1 = ps1;
		
		//PatoSilvestre ps2 = new Pato();
		Pato pato1 = new PatoSilvestre();
		
		//Pinguino pin1 = PatoSilvestre();
		
		
	}

}
