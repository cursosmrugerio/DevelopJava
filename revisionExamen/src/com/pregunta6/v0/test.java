package com.pregunta6.v0;

class num {
	int x = 9;
}

interface blob{
	final num n = new num();
	final Integer number = 1;
}

public class test implements blob{
	public static void main(String[] args) {
		//n = new num();
		n.x = 10;
		System.out.println(n.x);
		
		//number++;
		
	}
}
