package com.curso.v3;

import java.util.*;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3");
		
		Empleado[] empleados = {
				new Empleado("Patrobas",20,100.56),
				new Empleado("Filologo",15,30.56),
				new Empleado("Epeneto",18,10.56),
				new Empleado("Cuarto",17,50.56),
				new Empleado("Andronico",30,200.56),
		};
		
		List<Empleado> lista = Arrays.asList(empleados);
		
		//DEFINICIONES DE LAMBDAS
		Predicate<Empleado> esmayor50 = e -> e.sueldo > 50;
		Predicate<Empleado> esmayor18Edad = x -> x.edad >= 18;
		Predicate<Empleado> longitudNombre = z -> z.nombre.length()>7;
		
		System.out.println("Sueldo mayor a 50");
		for (Empleado e: lista)
			if (esmayor50.test(e)) //<== EJECUTAR LAMBDA
				System.out.println(e);
		
		System.out.println("Mayor Edad");
		for (Empleado e: lista)
			if (esmayor18Edad.test(e)) //<== EJECUTAR LAMBDA
				System.out.println(e);
		
		System.out.println("Longitud Nombre mayor 7");
		for (Empleado e: lista)
			if (longitudNombre.test(e)) //<== EJECUTAR LAMBDA
				System.out.println(e);
		
		Predicate<Double> predDouble = d -> d < 0.5;
		double d = new Random().nextDouble();
		System.out.println("double: "+d);
		boolean res = predDouble.test(d); //<== EJECUTAR LAMBDA
		System.out.println(res);
		
		Predicate<String> predString = s -> s.isEmpty();
		res  = predString.test("X"); //<== EJECUTAR LAMBDA
		System.out.println(res);

		

	}

}
