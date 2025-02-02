package com.set.comparator.v4;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("TreeSet Comparator v0");

		Empleado[] empleados = {
				new Empleado("Patrobas",20,100.56),
				new Empleado("Filologo",25,50.56),
				new Empleado("Epeneto",18,10.56),
				new Empleado("Filologo",25,10.56),
				new Empleado("Andronico",30,300.56),
		};
		
		List<Empleado> lista = Arrays.asList(empleados);
		
		Comparator<Empleado> comparator = 
				Comparator.comparing(Empleado::getNombre)
						  .thenComparingInt(Empleado::getEdad)
						  .thenComparingDouble(Empleado::getSueldo)
						  .reversed();
		
		Set<Empleado> setEmpleados = new TreeSet<>(comparator);
		setEmpleados.addAll(lista);
		
		for (Empleado emp :setEmpleados)
			System.out.println(emp);
	}

}
