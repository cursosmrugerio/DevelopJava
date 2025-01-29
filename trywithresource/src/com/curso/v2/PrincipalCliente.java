package com.curso.v2;

public class PrincipalCliente {

	public static void main(String[] args){
		
		System.out.println("V2");
		
		try (ConexionMongoDb con1 = new ConexionMongoDb()) {
			con1.open();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		try (ConexionMongoDb con2 = new ConexionMongoDb()) {
			con2.open();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("EndProgram");
		
	}

}
