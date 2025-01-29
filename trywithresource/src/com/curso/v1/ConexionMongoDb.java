package com.curso.v1;

public class ConexionMongoDb {
	
	ConexionMongoDb(){
		System.out.println("Constructor MongoDb");
	}
	
	void open() throws Exception {
		System.out.println("Abrir conexion MongoDb");
		//throw new Exception("Error abrir conexion");
	}
	
	void close() throws Exception {
		System.out.println("Cerrar conexion MongoDb");
		throw new Exception("Error cerrar conexion");
	}

}
