package Inicializacion.TestBloqueInit;

import Inicializacion.domain.Persona;

public class Test {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println(persona1.getIdPersona());

        Persona persona2 = new Persona();
        System.out.println("Persona: " + persona2);
    }
}
