package com.curso.v0;

public class Question07 {

	public static void main(String[] args) {
		int ph = 7, vis = 2;
		
		//            true
		boolean res = ++vis < 9 | ++ph < 2;
		
		System.out.println("vis:"+vis); //3
		System.out.println("ph:"+ph); //8

//		boolean clear = vis > 1 & (vis < 9 || ph < 2);
//
//		boolean safe = (vis > 2) && (ph++ > 1);
//
//		boolean tasty = 7 <= --ph;
//		
//		System.out.println(clear);
	}

}
