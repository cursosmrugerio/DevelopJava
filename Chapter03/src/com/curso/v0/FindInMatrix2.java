package com.curso.v0;

import java.util.Arrays;

public class FindInMatrix2 {

	public static void main(String[] args) {
		
		int[][] list3 = new int[2][];
		
		list3[0] = new int[3];
		list3[0][0] = 1;
		list3[0][1] = 2;
		list3[0][2] = 3;
		
		list3[1] = new int[3];
		list3[1][0] = 4;
		list3[1][1] = 5;
		list3[1][2] = 6;
		
		Arrays.stream(list3)
			  .forEach(z -> System.out.println(Arrays.toString(z)));

		//JAVA4
//		for (int x=0;x<list3.length;x++) {
//			for (int y=0;y<list3[x].length;y++)
//				System.out.print(list3[x][y]);
//			System.out.println();
//		}
				
		
//		for (int[] array:list3)
//			System.out.println(Arrays.toString(array));
//		
		//JAVA8
		int[] list = {1,2,3,4,5};
		Arrays.stream(list).forEach(System.out::println);
		
	}

}
