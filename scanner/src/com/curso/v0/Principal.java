package com.curso.v0;

import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {
	        // Creamos una instancia de Scanner que lee de la entrada estándar (teclado)
	        Scanner scanner = new Scanner(System.in);
	        
	        // Ejemplo de lectura de diferentes tipos de datos
	        
	        // 1. Lectura de texto (String)
	        System.out.print("Por favor, ingresa tu nombre: ");
	        String nombre = scanner.nextLine();
	        
	        System.out.println("Nombre Capturado: "+nombre);
	        
//	        // 2. Lectura de número entero (int)
//	        System.out.print("¿Cuál es tu edad?: ");
//	        int edad = scanner.nextInt();
//	        scanner.nextLine(); // Limpiamos el buffer después de leer un número
//	        
//	        // 3. Lectura de número decimal (double)
//	        System.out.print("Ingresa tu altura en metros (ejemplo: 1.75): ");
//	        double altura = scanner.nextDouble();
//	        scanner.nextLine(); // Limpiamos el buffer
//	        
//	        // 4. Lectura de un carácter
//	        System.out.print("¿Cuál es tu género (M/F)?: ");
//	        char genero = scanner.nextLine().charAt(0);
//	        
//	        // Mostramos la información recopilada
//	        System.out.println("\nInformación recopilada:");
//	        System.out.println("Nombre: " + nombre);
//	        System.out.println("Edad: " + edad + " años");
//	        System.out.println("Altura: " + altura + " metros");
//	        System.out.println("Género: " + genero);
//	        
	        // Es importante cerrar el Scanner cuando ya no lo necesitemos
	        //scanner.close();
	    }
	}