package com.curso.v0;

import java.util.Arrays;

public class Principal2 {
	
	public static void main(String[] args) {
		
		StringBuilder[] nombres = {
				new StringBuilder("Patrobas"),
				new StringBuilder("Epeneto"),
				new StringBuilder("Tercio"),
				new StringBuilder("Filologo")
		};
		
		Arrays.sort(nombres);
		
		System.out.println(Arrays.toString(nombres));
		

	}

}
