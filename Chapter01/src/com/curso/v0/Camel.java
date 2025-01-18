package com.curso.v0;

public class Camel {
	{
		int hairs = 3_000_0; //1
	}
	long water, air = 2; //2 //3 //1** //2**
	boolean twoHumps = true; //4 //3*

	                 //10 //4**
	public void spit(float distance) {
		String path = ""; //5 //5**
		{
			double teeth = 32 + distance++; //6 //6**
			while (water > 0) {
				int age = twoHumps ? 1 : 2; //7 //7**
				short i = -1; //8 //8**
				for (i = 0; i < 10; i++) {
					int Private = 2; //9
				}
				System.out.println(i); //<===
			}
		}
	}
}
