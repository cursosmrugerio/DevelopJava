package com.curso.v0;

public class Question46 {

	public static void main(String[] args) {
		Integer eye = new Integer(42);
		Double d = new Double(42.0);
		int i = 42;
		double dd = 42.0;
		
		//System.out.println(eye==i);
		System.out.println(eye.equals(d)); //false
		//System.out.println(eye == 42);
		System.out.println(eye.intValue() == dd); //true
		//System.out.println(42 == 42.0);
		System.out.println(i == dd);
		
//		Integer integer1 = new Integer(42);
//		Integer integer2 = new Integer(42);
//		System.out.println(integer1.equals(integer2));

		
		
		
		
	}

}
