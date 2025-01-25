package com.curso.v2;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Operacion ope0 = new Operacion(8,4);
		Operacion ope1 = new Suma(8,4);
		Operacion ope2 = new Resta(8,4);
		Operacion ope3 = new Multiplicacion(8,4);
		
		Operacion[] opes = {ope0,ope1,ope2,ope3};
		
		List<Operacion> lista = Arrays.asList(opes);
		
		for(Operacion o:lista)
			ejecutarOperacion(o);
		
	}
	
	static void ejecutarOperacion(Operacion ope) {
		System.out.println(ope);
		System.out.println(ope.ejecuta());
	}

}
