package com.curso.v0;

import java.util.Arrays;

public class Principal {
	
	public static void main(String[] args) {
		String[] array = {"a","2","A","aB"};
		
		Arrays.sort(array);
		
		//2,A,a,aB 
		System.out.println(Arrays.toString(array));
		
		String[] array2 = {"9","1","100"};
		
		Arrays.sort(array2);
		
		System.out.println(Arrays.toString(array2));
		
		


	}

}
