package com.annonymous.v0;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V0 Clase Anonima");
		
		Operacion ope1 = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Suma");
				return x+y;
			}
		};
		
		Operacion ope2 = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				return x-y;
			}
		};
		
		Operacion ope3 = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				return x*y;
			}
		};
		
		Operacion ope4 = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				return (int)Math.pow(x, y);
			}
		};
				
		Operacion[] opes = {
				ope1,
				ope2,
				ope3,
				ope4};
		
		List<Operacion> lista = Arrays.asList(opes);
		
		for(Operacion o:lista)
			ejecutarOperacion(o);
	}
	
	static void ejecutarOperacion(Operacion ope) {
		System.out.println(ope.ejecuta(8,4));
	}

}
