package com.curso.v1;

public class Principal2 {

	public static void main(String[] args) {

		String s1 = "purr";
		String s2 = "";

		s1.toUpperCase();
		s1.trim();
		s1.substring(1, 3);
		s1 += "two";

		s2 += 2; //2
		s2 += 'c'; //2c
		s2 += false; //2cfalse

		if (s2.intern() == "2cfalse") 
			System.out.println("==");
		else
			System.out.println("NO SON EL MISMO OBJETO");
		
		if (s2.equals("2cfalse")) System.out.println("equals");
//		System.out.println(s1.length()); //7
	}

}
