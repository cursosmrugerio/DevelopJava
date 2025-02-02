package com.curso.v1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V1");
		
		Empleado[] empleados = {
				new Empleado("Patrobas",20,100.56),
				new Empleado("Filologo",15,30.56),
				new Empleado("Epeneto",18,10.56),
				new Empleado("Cuarto",17,50.56),
				new Empleado("Andronico",30,200.56),
		};
		
		List<Empleado> lista = Arrays.asList(empleados);
		
		//DEFINICIONES DE LAMBDAS
		Predicado esmayor50 = e -> e.sueldo > 50;
		Predicado esmayor18Edad = x -> x.edad >= 18;
		Predicado longitudNombre = z -> z.nombre.length()>7;
		
		System.out.println("Sueldo mayor a 50");
		for (Empleado e: lista)
			if (esmayor50.probar(e)) //<== EJECUTAR LAMBDA
				System.out.println(e);
		
		System.out.println("Mayor Edad");
		for (Empleado e: lista)
			if (esmayor18Edad.probar(e)) //<== EJECUTAR LAMBDA
				System.out.println(e);
		
		System.out.println("Longitud Nombre mayor 7");
		for (Empleado e: lista)
			if (longitudNombre.probar(e)) //<== EJECUTAR LAMBDA
				System.out.println(e);
		

	}

}
