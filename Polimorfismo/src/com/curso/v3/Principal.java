package com.curso.v3;

import java.util.Random;

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
class Aguila extends Ave {
	@Override
	void volar(){
		System.out.println("Volar Aguila");
	}
}

public class Principal{
	public static void main(String[] args) {
		Ave ave = getAve();
		System.out.println(ave.getClass().getSimpleName());
		ave.volar(); 
	}
	
	static Ave getAve() {
		Ave[] aves = {new Ave(),new Aguila(),new Pato(),new Pinguino()};
		int random = new Random().nextInt(aves.length);
		return aves[random];
	}
}
