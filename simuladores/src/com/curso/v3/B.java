package com.curso.v3;

class A {
	A(int x) {
		System.out.println("Constructor A: "+x);
	}
	
	A(int x,String s) {
		System.out.println("Constructor A: "+x+", "+s);
	}

}

class B extends A {
	
	B() {
		super(5,"Java");
		System.out.println("Constructor B");
	}

	public static void main(String[] args) {
		A a = new B();
	}


}
