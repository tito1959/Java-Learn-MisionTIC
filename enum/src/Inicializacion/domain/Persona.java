package Inicializacion.domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    /*
     * Bloque de inicializacion estatico:
     * - Se ejecuta antes del constructor
     */

    static {
        System.out.println("Ejecución bloque estatico");
        ++Persona.contadorPersonas;
    }

    /*
     * Bloque de inicialización no estatico:
     * - Este si puede usar la palabra reservada this
     * - Se ejecuta cada vez que se instancia un objeto de esta clase.
     */

    {
        System.out.println("Ejecución de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona() {
        // Bloque constructor para observar el orden de ejecucion de los elementos
        // inizializadores.
        System.out.println("Ejecución del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona [idPersona = " + idPersona + "]";
    }

    
}
