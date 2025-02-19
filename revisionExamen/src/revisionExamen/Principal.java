package revisionExamen;

import java.io.FileNotFoundException;
import java.io.IOException;

class Animal {
	void method() throws IOException {
	}
}

class Dog extends Animal {
	@Override
	void method() throws FileNotFoundException {
	}
}

public class Principal {

	public static void main(String[] args) {

		int i = 5;
		switch (i) {
		
		default:
			System.out.println("default");
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		case 4:
			System.out.println("four");
		}

	}

}
