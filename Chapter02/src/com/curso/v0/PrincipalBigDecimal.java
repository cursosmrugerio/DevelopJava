package com.curso.v0;

import java.math.BigDecimal;

public class PrincipalBigDecimal {

	public static void main(String[] args) {

		double a = 0.02;
		double b = 0.03;
		double c = b - a;
		System.out.println(c); //0.01
		
		float f1 = 0.3f;
	    float f2 = 0.2f;
	    System.out.println("Float:\t 0,3 - 0,2 = " + (f1 - f2));

		BigDecimal _a = new BigDecimal("0.02");
		BigDecimal _b = new BigDecimal("0.03");
		BigDecimal _c = _b.subtract(_a);
		System.out.println(_c);
		
		double d1 = 0.02;
		double d2 = 0.03;
		double d3 = (d2*1000) - (d1*1000);
		System.out.println(d3/1000); //0.01
	}

}
