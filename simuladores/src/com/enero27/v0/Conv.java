package com.enero27.v0;

public class Conv {

	public static void main(String[] args) {
		Conv c = new Conv();
		String s = new String("ello");
		c.amethod(s);
	}
	
	public void amethod(String s1){
		char c='H';
		s1 = c + s1;
		System.out.println(s1); //Hello
	}
	
	
}
