package revisionExamen;

abstract class MineBase {
	abstract void amethod(); // Abstract method

	static int i; // Static field
}

public class Mine extends MineBase {
	// Must implement the abstract method from MineBase
	public void amethod() {
		// Implementation can be empty or have logic
	}

	public static void main(String[] args) {
		int[] ar = new int[5]; // Array of 5 ints, default value 0

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]); // Prints each element
		}
		
		System.out.println("MineBase.i: "+i); //0
	}
}
