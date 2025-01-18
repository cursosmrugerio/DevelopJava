package com.curso.v5;

import java.util.Random;

interface Ave {
	void volar();
}

class Pato implements Ave {
	@Override
	public void volar(){
		System.out.println("Volar Pato");
	}
}
class Pinguino implements Ave {
	@Override
	public void volar(){
		System.out.println("Volar Pinguino");
	}
}
class Aguila implements Ave {
	@Override
	public void volar(){
		System.out.println("Volar Aguila");
	}
}

public class Principal{
	public static void main(String[] args) {
		System.out.println("V5");
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
