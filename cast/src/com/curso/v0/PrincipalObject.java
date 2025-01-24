package com.curso.v0;

public class PrincipalObject {

	public static void main(String[] args) {

		Object s = new String("JavaScript");
		
		//System.out.println(s.toString());
		
		//String s1 = (String)s;
		
		System.out.println(((String)s).length());
	}

}
