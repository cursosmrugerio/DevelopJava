package com.curso.v6;

class A {
	A() {
		print(); //Llama al print() de B
	}

	void print() {
		System.out.print("A ");
	}
}

class B extends A {
	
	int i = 4;

	public static void main(String[] args) {
		System.out.println("V5");
		A a = new B(); 
		
		a.print(); //4
		
	}
	
	@Override
	void print() {
		System.out.print(i+" ");
	}

}
