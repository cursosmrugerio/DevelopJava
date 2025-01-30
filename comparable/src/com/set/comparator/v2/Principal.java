package com.set.comparator.v2;

import java.util.*;

class ComparatorNombre implements Comparator<Empleado>{
	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o1.nombre.compareTo(o2.nombre);
	}
}

class ComparatorEdad implements Comparator<Empleado>{
	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o1.edad - o2.edad;
	}
}

class ComparatorSueldo implements Comparator<Empleado>{
	@Override
	public int compare(Empleado o1, Empleado o2) {
		return (int)(o1.sueldo - o2.sueldo);
	}
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("TreeSet Comparator v0");

		Empleado[] empleados = {
				new Empleado("Patrobas",20,100.56),
				new Empleado("Filologo",25,50.56),
				new Empleado("Epeneto",18,10.56),
				new Empleado("Filologo",25,50.56),
				new Empleado("Andronico",30,300.56),
		};
		
		List<Empleado> lista = Arrays.asList(empleados);
		
		Set<Empleado> setEmpleados;
		
		setEmpleados = new TreeSet<>(new ComparatorNombre());
		setEmpleados.addAll(lista);
		
		System.out.println("**NOMBRE**");
		for (Empleado emp :setEmpleados)
			System.out.println(emp);
		
		setEmpleados = new TreeSet<>(new ComparatorEdad());
		setEmpleados.addAll(lista);
		
		System.out.println("**EDAD**");
		for (Empleado emp :setEmpleados)
			System.out.println(emp);
		
		setEmpleados = new TreeSet<>(new ComparatorSueldo());
		setEmpleados.addAll(lista);
		
		System.out.println("**SUELDO**");
		for (Empleado emp :setEmpleados)
			System.out.println(emp);
	}

}
