package com.curso.v0;


public class PrincipalClone2 {
	
	public static void main(String[] args) {
		//int[][] orig = {{1,2,3},{4,5,6,7}};
		
		int[][] orig = new int[2][];
		
		orig[0] = new int[3];
		orig[0][0] = 1;
		orig[0][1] = 2;
		orig[0][2] = 3;
		
		orig[1] = new int[4];
		orig[1][0] = 4;
		orig[1][1] = 5;
		orig[1][2] = 6;
		orig[1][3] = 7;
 		
		int[][] dup = new int[2][];
		
		dup[0] = orig[0];
		dup[1] = orig[1];
		
		System.out.println(orig[0]==dup[0]); //true
		System.out.println(orig[1]==dup[1]); //true
		
		
	}

}
