package com.curso.v1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

class Estudiante {
    private String nombre;
    private int id;
    private double[] calificaciones;
    private static int contadorId = 1000;

    public Estudiante(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.id = contadorId++;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Nombre: %s | Promedio: %.2f", id, nombre, calcularPromedio());
    }
}

public class SistemaGestionEstudiantes {
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            try {
                mostrarMenu();
                int opcion = leerOpcionValida();
                
                switch (opcion) {
                    case 1:
                        agregarEstudiante();
                        break;
                    case 2:
                        mostrarEstudiantes();
                        break;
                    case 3:
                        buscarEstudiantePorPromedio();
                        break;
                    case 4:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Limpiamos el buffer en caso de error
            }
        }
        
        scanner.close();
        System.out.println("¡Gracias por usar el sistema!");
    }

    private static void mostrarMenu() {
        System.out.println("\n=== SISTEMA DE GESTIÓN DE ESTUDIANTES ===");
        System.out.println("1. Agregar nuevo estudiante");
        System.out.println("2. Mostrar todos los estudiantes");
        System.out.println("3. Buscar estudiantes por promedio");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcionValida() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Por favor, ingrese un número válido: ");
                scanner.nextLine(); // Limpiamos el buffer
            }
        }
    }

    private static void agregarEstudiante() {
        scanner.nextLine(); // Limpiamos el buffer

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine().trim();

        // Validamos que el nombre no esté vacío
        while (nombre.isEmpty()) {
            System.out.print("El nombre no puede estar vacío. Ingrese nuevamente: ");
            nombre = scanner.nextLine().trim();
        }

        // Leemos las calificaciones
        double[] calificaciones = new double[3];
        for (int i = 0; i < calificaciones.length; i++) {
            while (true) {
                try {
                    System.out.printf("Ingrese la calificación %d (0-100): ", i + 1);
                    double calificacion = scanner.nextDouble();
                    
                    if (calificacion >= 0 && calificacion <= 100) {
                        calificaciones[i] = calificacion;
                        break;
                    } else {
                        System.out.println("La calificación debe estar entre 0 y 100");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese un número válido");
                    scanner.nextLine(); // Limpiamos el buffer
                }
            }
        }

        estudiantes.add(new Estudiante(nombre, calificaciones));
        System.out.println("Estudiante agregado exitosamente.");
    }

    private static void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("\nLista de Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    private static void buscarEstudiantePorPromedio() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.print("Ingrese el promedio mínimo a buscar: ");
        try {
            double promedioMinimo = scanner.nextDouble();
            boolean encontrado = false;

            System.out.println("\nEstudiantes con promedio mayor o igual a " + promedioMinimo + ":");
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.calcularPromedio() >= promedioMinimo) {
                    System.out.println(estudiante);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontraron estudiantes con ese promedio o superior.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, ingrese un número válido");
            scanner.nextLine(); // Limpiamos el buffer
        }
    }
}
