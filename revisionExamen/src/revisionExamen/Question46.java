package revisionExamen;

public class Question46 {

	public static void main(String[] args) {

		Integer eye = new Integer(42);
		Double d = new Double(42.0);
		int i = 42;
		double dd = 42.0;
		System.out.println(i == eye); // true
		System.out.println(eye.equals(i)); // true
		System.out.println(i == 42); // true
		System.out.println("******");
		System.out.println(eye.equals(d)); //false
		System.out.println(i == dd); // true?
	}

}
