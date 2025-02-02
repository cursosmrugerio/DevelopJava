package com.exception.v1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal1 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("Temario.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("EndProgram");
		

	}

}
