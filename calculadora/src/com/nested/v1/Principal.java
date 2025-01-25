package com.nested.v1;
import java.util.*;

class Suma implements Operacion {
	
	int x;
	int y;
	
	Suma(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int ejecuta() {
		return x+y;
	}

	@Override
	public String toString() {
		return "Suma [x=" + x + ", y=" + y + "]";
	}
	
}

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("V5 Inteface");
		
		Operacion[] opes = {
				new Suma(8,4),
				new Suma(9,3),
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
