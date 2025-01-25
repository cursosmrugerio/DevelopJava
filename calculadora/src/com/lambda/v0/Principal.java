package com.lambda.v0;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V0 Lambdas");
				
		Operacion[] opes = {
				(x,y) -> x+y,
				(w,z) -> w-z,
				(data1,data2) -> data1*data2,
				(pato1,pato2) -> (int)Math.pow(pato1, pato2)
		};
		
		List<Operacion> lista = Arrays.asList(opes);
		
		for(Operacion o:lista)
			ejecutarOperacion(o);
	}
	
	static void ejecutarOperacion(Operacion ope) {
		System.out.println(ope.ejecuta(8,4));
	}

}
