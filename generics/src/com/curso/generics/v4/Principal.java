package com.curso.generics.v4;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V4");
		
		Bici bici = new Bici("BiciX");
		Motoneta motoneta = new Motoneta("MotonetaZ");
		Moto moto = new Moto("MotoT");
		
		Contenedor<Motoneta> cont1 = 
				new Contenedor<Motoneta>(motoneta);
		Motoneta m = cont1.getTransporte();
		cont1.getCertificado(motoneta,new StringBuilder("ABC123"));
		
		Contenedor<Bici> cont2 = 
				new Contenedor<>(bici);
		Bici b = cont2.getTransporte();
		cont2.getCertificado(bici,new String("XYZ999"));
		
		Contenedor.showLicencia(Integer.valueOf(100));
		
//		Bici biciPaulina = new Bici("BICICLETA PAU");
//		System.out.println(biciPaulina);

		
	}

}
