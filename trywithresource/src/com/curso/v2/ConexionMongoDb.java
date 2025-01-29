package com.curso.v2;

public class ConexionMongoDb implements AutoCloseable {
	
	ConexionMongoDb(){
		System.out.println("Constructor MongoDb");
	}
	
	void open() throws Exception {
		System.out.println("Abrir conexion MongoDb");
		//throw new Exception("Error abrir conexion");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Cerrar conexion MongoDb");
		//throw new Exception("Error cerrar conexion");
	}

}
