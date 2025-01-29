package com.curso.v0;

public class PrincipalCliente {

	public static void main(String[] args){
		//PROBLEMA: No cerrar las Conexiones.

		ConexionMongoDb con1 = new ConexionMongoDb();
		
		try {
			con1.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ConexionMongoDb con2 = new ConexionMongoDb();
		
		try {
			con2.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("EndProgram");
		
	}

}
