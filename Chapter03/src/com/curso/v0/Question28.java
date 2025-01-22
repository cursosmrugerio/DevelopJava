package com.curso.v0;

public class Question28 {
	
	public static void main(String[] args) throws Exception {
		new Question28().getFish("goldie");
		
		System.out.println("Program End");
	}
	
	void getFish(Object fish) throws Exception {
		if (!(fish instanceof String))
			System.out.print("Eat!");
		else if (fish instanceof String) {
			throw new Exception();
		}
		System.out.print("Swim!");
	}
}
