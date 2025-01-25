package com.annonymous.v1;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V1 Clase Anonima");
				
		Operacion[] opes = {
				new Operacion() {
					@Override
					public int ejecuta(int x, int y) {
						System.out.println("Suma");
						return x+y;
					}
				},
				new Operacion() {
					@Override
					public int ejecuta(int x, int y) {
						return x-y;
					}
				},
				new Operacion() {
					@Override
					public int ejecuta(int x, int y) {
						return x*y;
					}
				},
				new Operacion() {
					@Override
					public int ejecuta(int x, int y) {
						return (int)Math.pow(x, y);
					}
				}};
		
		List<Operacion> lista = Arrays.asList(opes);
		
		for(Operacion o:lista)
			ejecutarOperacion(o);
	}
	
	static void ejecutarOperacion(Operacion ope) {
		System.out.println(ope.ejecuta(8,4));
	}

}
