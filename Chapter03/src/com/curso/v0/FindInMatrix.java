package com.curso.v0;

public class FindInMatrix {

	public static void main(String[] args) {

		int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } };

		int searchValue = 2;
		
		int[] res = getCoordenadas(list,searchValue);
		
		int positionX = res[0];
		int positionY = res[1];

		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}
	}
	
	private static int[] getCoordenadas(int[][] list,int searchValue) {
		
		int positionX = -1;
		int positionY = -1;

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j; 
					System.out.println("X: "+positionX+" Y: "+positionY);
					return new int[]{positionX,positionY};
				}
			}
		}

		return new int[]{positionX,positionY};
	}

}
