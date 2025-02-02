package com.curso.v2;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);

}
