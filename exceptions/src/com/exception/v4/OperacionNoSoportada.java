package com.exception.v4;

//import java.lang.RuntimeException;

public class OperacionNoSoportada extends RuntimeException {

	OperacionNoSoportada(String msg){
		super(msg);
	}
	
}
