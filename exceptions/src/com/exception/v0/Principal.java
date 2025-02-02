package com.exception.v0;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(args));
		System.out.println(args.length);//0
		
		try {
			System.out.println(args[0]); //Unchecked
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(RuntimeException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}catch(Throwable e) {
			System.out.println(e);
		}finally {
			System.out.println("Paso por Finally");
		}
		
		System.out.println("EndProgram");
	}

}
