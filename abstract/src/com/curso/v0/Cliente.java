package com.curso.v0;

public abstract class Cliente {

	abstract void pagar(double cantidad);
	
	void showCliente() {
		System.out.println("Mostrar Cliente");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Cliente Java");
	}

}
