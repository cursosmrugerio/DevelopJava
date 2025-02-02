package com.curso.v4;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V4");
		
		Empleado[] empleados = {
				new Empleado("Patrobas",20,100.56),
				new Empleado("Filologo",15,30.56),
				new Empleado("Epeneto",18,10.56),
				new Empleado("Cuarto",17,50.56),
				new Empleado("Andronico",30,200.56),
		};
		
		List<Empleado> lista = Arrays.asList(empleados);
		
		OptionalDouble opcional = lista.stream()
		.filter(x -> x.edad>=18)
		.filter(z -> z.sueldo>30)
		.peek(System.out::println)
		.map(y -> y.edad)
		.mapToInt(x -> x)
		.average();
		
		System.out.println(opcional.getAsDouble());
		
		
		
		

	}

}
