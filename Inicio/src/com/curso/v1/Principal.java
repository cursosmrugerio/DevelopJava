package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		String name0 = "Patrobas";
		String name1 = "Patrobas"; //POOL DE STRING
		String name2 = new String("Patrobas");
		
		System.out.println(name1==name2); //false
		System.out.println(name1.equals(name2)); //true
//		
		System.out.println("****");
		StringBuilder sb1 = new StringBuilder("Patrobas");
		StringBuilder sb2 = new StringBuilder("Patrobas");
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2)); //false
		//Object == equals()

		System.out.println("****");
		int i1 = 5;
		int i2 = 5;
		System.out.println(i1==i2);  //true


		
	}

}
