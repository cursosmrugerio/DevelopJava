package com.unbounded.v0;

import java.util.*;

class Figura{
	private double area;
	public Figura(double area) {
		this.area = area;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+
				" [area=" + area + "]";
	}
}

class Circulo extends Figura{
	public Circulo(double area) {
		super(area);
	}
}
class Cuadrado extends Figura{
	public Cuadrado(double area) {
		super(area);
	}
}
class Triangulo extends Figura{
	public Triangulo(double area) {
		super(area);
	}
}


public class Principal {

	public static void main(String[] args) {
		List<Object> listaObject = new ArrayList<>();
		listaObject.add(new Object());
		listaObject.add(new String("Hello"));
		listaObject.add(new StringBuilder("Hola"));
		listaObject.add(new Figura(1.0));
		listaObject.add(new Circulo(1.0));
		listaObject.add(new Cuadrado(1.0));
		showObjects(listaObject);
		showUnbounded(listaObject);
		
		List<String> listaString = new ArrayList<>();
//		listaString.add(new Object());
		listaString.add(new String("Hello"));
		listaString.add("World");
//		listaString.add(new StringBuilder("Hola"));
//		listaString.add(new Figura(1.0));
//		listaString.add(new Circulo(1.0));
//		listaString.add(new Cuadrado(1.0));
		//showObjects(listaString); //NO SE PUEDE
		showUnbounded(listaString);

		List<Figura> listaFiguras = new ArrayList<>();
		listaFiguras.add(new Figura(2.0));
		listaFiguras.add(new Circulo(2.0));
		listaFiguras.add(new Cuadrado(1.0));
		listaFiguras.add(new Triangulo(1.0));
		//showObjects(listaFiguras); //NO SE PUEDE
		showUnbounded(listaFiguras);

	}
	
	static void showObjects(List<Object> listaObject) {
		listaObject.add(Long.valueOf(5));
		listaObject.add(new Random().nextDouble());
		for (Object o :listaObject)
			System.out.println(o);
	}
	
	static void showUnbounded(List<?> lista) {
		//lista.add(Long.valueOf(5)); //NO SE PUEDE
		lista.add(null);
		//lista.add("Cadena"); //NO SE PUEDE
		for (Object o :lista)
			System.out.println(o);
	}

}
