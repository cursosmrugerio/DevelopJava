package com.curso.v0;

public class Linl {

	public static void main(String[] args) {

		int i[] =new int[4];
		
		for(int ii=0;ii < 4; ii++ )
			i[ii] = ii;
		
		for(int iii: i)
			System.out.print(iii); //0123
	}

}
