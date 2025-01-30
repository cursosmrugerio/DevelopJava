package com.set.comparator.v1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("TreeSet Comparator v1");

		Empleado[] empleados = {
				new Empleado("Patrobas",20,100.56),
				new Empleado("Filologo",25,50.56),
				new Empleado("Epeneto",18,10.56),
				new Empleado("Filologo",25,50.56),
				new Empleado("Andronico",30,300.56),
		};
		
		List<Empleado> lista = Arrays.asList(empleados);
		
		Set<Empleado> setEmpleados;
		
		Comparator<Empleado> compNombre = new Comparator<>(){
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.nombre.compareTo(o2.nombre);
			}
		};
		
		Comparator<Empleado> compEdad = new Comparator<>(){
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.edad - o2.edad;
			}
		};
		
		Comparator<Empleado> compSueldo = new Comparator<>(){
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return (int)(o1.sueldo - o2.sueldo);
			}
		};
		
		setEmpleados = new TreeSet<>(compNombre);
		setEmpleados.addAll(lista);
		
		System.out.println("**NOMBRE**");
		for (Empleado emp :setEmpleados)
			System.out.println(emp);
		
		setEmpleados = new TreeSet<>(compEdad);
		setEmpleados.addAll(lista);
		
		System.out.println("**EDAD**");
		for (Empleado emp :setEmpleados)
			System.out.println(emp);
		
		setEmpleados = new TreeSet<>(compSueldo);
		setEmpleados.addAll(lista);
		
		System.out.println("**SUELDO**");
		for (Empleado emp :setEmpleados)
			System.out.println(emp);
	}

}
