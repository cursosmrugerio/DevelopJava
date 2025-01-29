package com.curso.v1;

public class test1 {

	test1() throws Exception {
		try {
			throw new Exception();
		} finally {
			System.out.println("Damn it"); // 1<==
		}
	}

	public static void main(String[] args) {
		System.out.println("V1");
		try {
			new test1();
		} catch (RuntimeException t) {
			System.out.println("Caught "); // 2<==
		} catch (Exception t) {
			System.out.println("Caught Exception"); // 2<==
		}
		System.out.println("Fin de Programa"); // 3<===
	}

}
