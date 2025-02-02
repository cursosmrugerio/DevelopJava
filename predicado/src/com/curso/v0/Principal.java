package com.curso.v0;

import java.util.*;

class SueldoMayor50 implements Predicado{
	@Override
	public boolean probar(Empleado e) {
		return e.sueldo>50;
	}
}

class MayorEdad implements Predicado{
	@Override
	public boolean probar(Empleado e) {
		return e.edad >=18;
	}
}

class NombreLongitud implements Predicado{
	@Override
	public boolean probar(Empleado e) {
		return e.nombre.length() > 7;
	}
}

public class Principal {

	public static void main(String[] args) {
		
		Empleado[] empleados = {
				new Empleado("Patrobas",20,100.56),
				new Empleado("Filologo",15,30.56),
				new Empleado("Epeneto",18,10.56),
				new Empleado("Cuarto",17,50.56),
				new Empleado("Andronico",30,200.56),
		};
		
		List<Empleado> lista = Arrays.asList(empleados);
		
		Predicado esmayor50 = new SueldoMayor50();
		Predicado esmayor18Edad = new MayorEdad();
		Predicado longitudNombre = new NombreLongitud();
		
		System.out.println("Sueldo mayor a 50");
		for (Empleado e: lista)
			if (esmayor50.probar(e))
				System.out.println(e);
		
		System.out.println("Mayor Edad");
		for (Empleado e: lista)
			if (esmayor18Edad.probar(e))
				System.out.println(e);
		
		System.out.println("Longitud Nombre mayor 7");
		for (Empleado e: lista)
			if (longitudNombre.probar(e))
				System.out.println(e);
		

	}

}
