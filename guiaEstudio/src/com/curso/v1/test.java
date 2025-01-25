package com.curso.v1;

public class test {
	
	test() {
		try {
			throw new RuntimeException();
		}finally {
			System.out.println("Damn it"); //1<==
		}
	}

	public static void main(String[] args) {
		try {
			new test();
		}catch(Throwable t) {
			System.out.println("Caught"); //2<==
		}
		System.out.println("Fin de Programa");
	}

}
