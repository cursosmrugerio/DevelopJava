package com.curso.v4;

class A {
	A() {
		print(); //Llama al print() de B
	}

	void print() {
		System.out.print("A ");
	}
}

class B extends A {

	public static void main(String[] args) {
		System.out.println("V4");
		A a = new B(); //V4 B
		
	}
	
	@Override
	void print() {
		System.out.print("B ");
	}

}
