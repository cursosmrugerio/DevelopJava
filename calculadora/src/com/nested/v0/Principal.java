package com.nested.v0;
import java.util.*;

class Principal {
	
	//VARIABLE DE INSTANCIA DE CLASE
	private String nombre = "Patrobas";
	
	//INNER CLASS
	private class Suma implements Operacion {
		
		int x;
		int y;
		
		Suma(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		@Override
		public int ejecuta() {
			System.out.println(nombre);
			return x+y;
		}

		@Override
		public String toString() {
			return "Suma [x=" + x + ", y=" + y + "]";
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("V0 Nested");
		System.out.println(new Principal().nombre);

		
		Operacion[] opes = {
				new Principal().new Suma(8,4),
				new Principal().new Suma(9,6),
				new Resta(8,4),
				new Potencia(8,4),
				new Multiplicacion(8,4)};
		
		List<Operacion> lista = Arrays.asList(opes);
		
		for(Operacion o:lista)
			ejecutarOperacion(o);
	}
	
	static void ejecutarOperacion(Operacion ope) {
		System.out.println(ope);
		System.out.println(ope.ejecuta());
	}

}
