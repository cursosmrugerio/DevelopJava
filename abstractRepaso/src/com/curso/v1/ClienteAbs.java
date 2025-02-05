package com.curso.v1;

public abstract class ClienteAbs {
	
	String nombre;
	int cveCliente;
	
	public ClienteAbs(String nombre, int cveCliente) {
		this.nombre = nombre;
		this.cveCliente = cveCliente;
	}
	
//	public ClienteAbs() {}

	abstract void realizarPedido();
	
	void mostrarPedido() {
		System.out.println("Mostrar Pedido");
	}

}
