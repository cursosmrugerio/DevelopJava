package com.curso.v0;

public class Bear {
	
	//Variable (Propiedad,Atributo) de Instancia de Clase
	//Variable (Propiedad,Atributo) de Objeto
	// ESTADO
	Bear pandaBear; //HAS-A

	public static void main(String[] args) {
		Bear b = new Bear();
		b.roar();
		System.out.println(b == b.pandaBear); //true
	}
	
	//Método de Instancia
	private void roar() {
		pandaBear = this;
	}

}
