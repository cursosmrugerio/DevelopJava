package com.map.v0;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Map<Double,LinkedList<StringBuilder>> mapaComplejo;
		
		Map<Boolean,Map<Double,LinkedList<StringBuilder>>> 
			mapaSuperComplejo;

		Map<Integer,String> mapa = new HashMap<>();
		
		mapa.put(8,"Ocho"); 
		mapa.put(6,"Seis");
		mapa.put(5,"Cinco");
		mapa.put(8,"Eight");
		mapa.put(0,"Ocho");
		
		System.out.println(mapa);
		
		System.out.println("Claves");
		Set<Integer> setClaves = mapa.keySet();
		System.out.println(setClaves.getClass());
		System.out.println(setClaves);
		
		System.out.println("Valores");
		Collection<String> valores = mapa.values();
		System.out.println(valores.getClass());
		System.out.println(valores);
		
		Set< Map.Entry<Integer,String> > setEntries = 
				mapa.entrySet();
		
		setEntries.forEach(
				e -> System.out.println(e.getKey()+":"+e.getValue()));

		
		
	}

}
