package com.curso.v0;

import java.util.Arrays;

public class PrincipalClone {
	
	public static void main(String[] args) {
		int[][] orig = {{1,2,3},{4,5,6,7}};
		int[][] dup = orig.clone();
		
		boolean res = (orig == dup); //false
		
		for(int[] array:dup)
			System.out.println(Arrays.toString(array));
		
		System.out.println("Resultado: "+res);
		
		
	}

}
