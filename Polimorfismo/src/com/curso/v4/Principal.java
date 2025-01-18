package com.curso.v4;

import java.util.Random;

abstract class Ave {
	abstract void volar();
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
		System.out.println("V4");
		Ave ave = getAve();
		System.out.println(ave.getClass().getSimpleName());
		ave.volar(); 
	}
	
	static Ave getAve() {
		Ave[] aves = {new Aguila(),new Pato(),new Pinguino()};
		int random = new Random().nextInt(aves.length);
		return aves[random];
	}
}
