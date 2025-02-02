package com.exception.v1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fr = new FileReader("Temario.txt");
		
		System.out.println("EndPrograma");
		

	}

}
