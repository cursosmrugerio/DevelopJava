package com.curso.v5;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Empleado[] empleados = {
				new Empleado("Patrobas",20,100.56),
				new Empleado("Filologo",25,50.56),
				new Empleado("Epeneto",18,10.56),
				new Empleado("Andronico",30,300.56),
		};
		
		Arrays.sort(empleados);
		
		for (Empleado e:empleados)
			System.out.println(e);
	}

}
