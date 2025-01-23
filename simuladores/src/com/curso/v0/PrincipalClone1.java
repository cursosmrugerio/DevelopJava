package com.curso.v0;

import java.util.Arrays;

public class PrincipalClone1 {
	
	public static void main(String[] args) {
		int[][] orig = {{1,2,3},{4,5,6,7}};
		int[][] dup = orig.clone();
		int[] copy = dup[0].clone();
		
		//System.out.println(orig==dup); //false
		//System.out.println(orig.equals(dup)); //false
		//System.out.println(Arrays.equals(orig, dup)); //true
		System.out.println(orig[0]==dup[0]); //true
		System.out.println(orig[1]==dup[1]); //true
		
		
		dup[1][3] = 777;
		
		System.out.println("orig[1][3]: "+orig[1][3]);
		
		System.out.println(dup[0] == copy); //false
		System.out.println(dup[0].equals(copy)); //false
		System.out.println(Arrays.equals(dup[0],copy)); //true
		
		
 		
		
		
		
	}

}
