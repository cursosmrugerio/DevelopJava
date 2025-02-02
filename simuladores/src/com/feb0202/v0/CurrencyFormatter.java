package com.feb0202.v0;

import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormatter {

	public static void main(String[] args) {
		System.out.println("Hello");

		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		System.out.println("US: " + us.format(payment));
		System.out.println("India: " + india.format(payment));
		System.out.println("China: " + china.format(payment));
		System.out.println("France: " + france.format(payment));
		
		System.out.println(DiasSemana.LUNES);
	}

}