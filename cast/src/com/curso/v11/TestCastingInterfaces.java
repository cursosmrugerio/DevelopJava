package com.curso.v11;

interface Nadador {
    void nadar();
}

class Pez implements Nadador {
    public void nadar() {
        System.out.println("El pez nada en el agua.");
    }
}

class Persona implements Nadador {
    public void nadar() {
        System.out.println("La persona nada en la piscina.");
    }
    
    public void caminar() {
        System.out.println("La persona camina en la playa.");
    }
}

public class TestCastingInterfaces {
    public static void main(String[] args) {
        Nadador nadador1 = new Pez();
        Pez pez1 = (Pez)nadador1; // (1) ¿Es válido?

        Nadador nadador2 = new Persona();
        ((Persona)nadador2).caminar();
        Persona persona1 = (Persona) nadador2; // (2) ¿Es válido?
        persona1.caminar();
        
        Nadador nadador3 = new Pez();
        Persona persona2 = (Persona) nadador3; // (3) ¿Compila? ¿Qué sucede en ejecución?
    }
}

