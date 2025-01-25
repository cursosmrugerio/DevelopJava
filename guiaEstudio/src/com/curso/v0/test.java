package com.curso.v0;

import java.io.PrintStream;

class test{
	
	public static void main(String[] args) {
//		PrintStream ps = System.out;
//		ps.println("Hello Java");
		
		//System.out.printf("%s", new test());
		
		System.out.printf("La salida es: %s %d %.2f", new test(),100, 5.5);
	}

	@Override
	public String toString() {
		return "testing something";
	}
	
	
	
}