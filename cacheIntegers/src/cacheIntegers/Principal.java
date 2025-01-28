package cacheIntegers;

public class Principal {

	public static void main(String[] args) {
		
		//Integer
		//-128 al 127  //CACHE INTEGERS
		
		int i1 = 127;
		int i2 = 128;
		
		Integer integer1 = i1;
		Integer integer2 = i1;
		Integer integer2A = i1;
		Integer integer2B = i1;
		Integer integer2C = new Integer(127);
		Integer integer2D = Integer.valueOf(127);
		
		System.out.println(integer1 == integer2D);
		System.out.println(integer1.equals(integer2D));
		
		System.out.println("********");
		
		Integer integer3 = i2;
		Integer integer4 = i2;
		Integer integer4A = i2;
		Integer integer4B = i2;
		Integer integer4C = i2;
		Integer integer4D = i2;

		System.out.println(integer3 == integer4D); //<===
		System.out.println(integer3.equals(integer4));

		
	}

}
