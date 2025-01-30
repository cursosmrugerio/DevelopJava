package com.set.v2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("HashSet");
		Empleado filologo = new Empleado("Filologo",25,50.56);

		Empleado[] empleados = {
				new Empleado("Patrobas",20,100.56),
				filologo,
				new Empleado("Epeneto",18,10.56),
				filologo,
				new Empleado("Andronico",30,300.56),
		};
		
		List<Empleado> lista = Arrays.asList(empleados);
		Set<Empleado> setEmpleados = new HashSet<>(lista);
		
		for (Empleado emp :setEmpleados)
			System.out.println(emp);
	}

}
