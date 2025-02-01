package com.curso.generics.v4;

public class Contenedor<T extends Transporte> {
	
	T t;
	
	public Contenedor(T t) {
		this.t = t;
	}
	
	T getTransporte() {
		return t;
	}
	
	<E> void getCertificado(T t, E e){
		System.out.println(
				"MostrarCertificado: "+t+" : "+e);
	}
	
	//Generic definido a nivel método NO a nivel clase
	static <T> void showLicencia(T t) {
		System.out.println("showLicencia: "+t);
		
	}

}
