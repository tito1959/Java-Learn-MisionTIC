package Generics;

public class GenericsTest<T> {
    /*
     * E => Element
     * K = Key
     * N = Number
     * T = Type (Representa un tipo, osea una clase)
     * V = Value (Representa un valor, se usa en maps)
     */

     private T objeto;

     public GenericsTest(T objeto){
        this.objeto = objeto;
     }

     public void obtenerTipo(){
        System.out.println("El tipo 'T' es: " + objeto.getClass().getSimpleName());
     }
}
