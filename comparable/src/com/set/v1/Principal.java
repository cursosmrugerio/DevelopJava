package com.set.v1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("TreeSet");

		Empleado[] empleados = {
				new Empleado("Patrobas",20,100.56),
				new Empleado("Filologo",25,50.56),
				new Empleado("Epeneto",18,10.56),
				new Empleado("Filologo",25,50.56),
				new Empleado("Andronico",30,300.56),
		};
		
		List<Empleado> lista = Arrays.asList(empleados);
		Set<Empleado> setEmpleados = new TreeSet<>(lista);
		
		for (Empleado emp :setEmpleados)
			System.out.println(emp);
	}

}
