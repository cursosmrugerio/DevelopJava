package com.curso.v4;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V4");
		
		Operacion[] opes = {
				//new Operacion(999,999),
				new Suma(8,4),
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
