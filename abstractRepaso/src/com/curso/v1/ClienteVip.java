package com.curso.v1;

public class ClienteVip extends ClienteAbs {
	
//	ClienteVip(){
//		super();
//	}
	
	ClienteVip(String nombre, int cveCliente){
		super(nombre,cveCliente);
	}
	

	@Override
	void realizarPedido() {
		
	}

}
