package com.curso.v7;

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
	void caminar() {
		System.out.println("Caminar Pinguino");
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
		System.out.println("V7");
		Ave ave = getAve();
		System.out.println(ave.getClass().getSimpleName());
		ave.volar(); 
		
		if (ave instanceof Pinguino pin)
			pin.caminar(); 
	}
	
	static Ave getAve() {
		Ave[] aves = {new Aguila(),new Pato(),new Pinguino()};
		int random = new Random().nextInt(aves.length);
		return aves[random];
	}
}
