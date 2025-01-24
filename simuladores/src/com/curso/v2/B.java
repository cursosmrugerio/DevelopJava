package com.curso.v2;

class A {
	A(int y) {
		System.out.println("Constructor A");
	}

}

class B extends A {
	
	B(int x) {
		super(x);
		System.out.println("Constructor B");
	}

	public static void main(String[] args) {
		A a = new B(5);
	}


}
