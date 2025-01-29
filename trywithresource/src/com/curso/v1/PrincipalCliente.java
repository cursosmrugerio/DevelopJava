package com.curso.v1;

public class PrincipalCliente {

	public static void main(String[] args){
		//PROBLEMA: No cerrar las Conexiones.

		ConexionMongoDb con1 = new ConexionMongoDb();
		
		try {
			con1.open();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con1 != null) {
				try {
					con1.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		ConexionMongoDb con2 = new ConexionMongoDb();
		
		try {
			con2.open();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con2 != null)
				try {
					con2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
		System.out.println("EndProgram");
		
	}

}
