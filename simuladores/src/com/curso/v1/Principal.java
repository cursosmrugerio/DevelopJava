package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		String s1 = "purr";

		s1.toUpperCase(); 
		s1.trim(); 
		s1.substring(1, 3); 
		
		s1 += "two"; 

		System.out.println(s1.length()); //7
		System.out.println(s1); //purrtwo
	}

}
