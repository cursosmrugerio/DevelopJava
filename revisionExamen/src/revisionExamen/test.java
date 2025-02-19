package revisionExamen;

public class test {

	public static void main(String[] args) {
		System.out.println(String.format("%s",new test()));
		System.out.println("%s".formatted(new test()));
		//System.out.println("%s",new test());
	}

	@Override
	public String toString() {
		return "testing something";
	}

}
