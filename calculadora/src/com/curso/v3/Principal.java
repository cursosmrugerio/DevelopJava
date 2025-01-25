package com.curso.v3;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3");
		
		Operacion[] opes = {
				new Operacion(8,4),
				new Suma(8,4),
				new Resta(8,4),
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
