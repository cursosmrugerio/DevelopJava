package com.set.comparator.v3;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("TreeSet Comparator v3 Lambdas");

		Empleado[] empleados = {
				new Empleado("Patrobas",20,100.56),
				new Empleado("Filologo",25,50.56),
				new Empleado("Epeneto",18,10.56),
				new Empleado("Filologo",25,50.56),
				new Empleado("Andronico",30,300.56),
		};
		
		List<Empleado> lista = Arrays.asList(empleados);
		
		Set<Empleado> setEmpleados;
		
		setEmpleados = new TreeSet<>( 
				(x,y)-> x.nombre.compareTo(y.nombre) );
		
		setEmpleados.addAll(lista);
		
		System.out.println("**NOMBRE**");
		setEmpleados.forEach(System.out::println);
		
		setEmpleados = new TreeSet<>( 
				(w,z)-> w.edad -z.edad );
		
		setEmpleados.addAll(lista);
		
		System.out.println("**EDAD**");
		setEmpleados.forEach(System.out::println);

		setEmpleados = new TreeSet<>(
				(emp1,emp2) -> (int)(emp1.sueldo-emp2.sueldo));
		
		setEmpleados.addAll(lista);
		
		System.out.println("**SUELDO**");
		setEmpleados.forEach(System.out::println);

	}

}
