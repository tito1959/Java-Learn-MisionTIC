package Generics.Test2;

public class Generics2Test {
    public static void main(String[] args) {

        GenericPareja<String> pareja = new GenericPareja<>();

        pareja.setPrimero("Juan");
        System.out.println(pareja.getPrimero());

        // Generics 2
        Persona persona1 = new Persona("Ana");

        GenericPareja<Persona> pareja2 = new GenericPareja<>();
        pareja2.setPrimero(persona1);
        System.out.println(pareja2.getPrimero());

        /*
         * Las clases genericas se adaptan al tipo de dato
         * En este caso podemos almacenar una coleccion de elementos de tipo dinamico
         */

        String nombres[] = { "Pepe", "Maria", "Jose" };
        System.out.println(getElementos(nombres));

        Persona listaPersona[] = { new Persona("Juan"),
                new Persona("Carlos"),
                new Persona("Maria"),
                new Persona("Pedro") };

        System.out.println(getElementos(listaPersona));

        // Elemento menor de nombres:
        System.out.println(getStringMenor(nombres));
    }

    public static <T> String getElementos(T[] a) {
        return "El array tiene: " + a.length + " elementos";
    }

    public static <T> T getStringMenor(T[] element) {
        T elementoMenor = element[0];

        for (int i = 0; i < element.length; i++) {
            if (((String) elementoMenor).compareTo((String) element[i]) > 0) {
                elementoMenor = element[i];
            }
        }

        return elementoMenor;
    }
}