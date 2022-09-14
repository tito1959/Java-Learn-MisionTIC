package CollectionTest.TreeSetTest;

import java.util.TreeSet;

/*
 * Los treeSet usan un tipo de ordenamiento natural, lo que no importa
 * cuantos datos ingresemos estos iran ordenandose de forma natural
 */
public class TreeSetTest {

    public static void main(String[] args) {

        ordenamiento();
        System.out.println("");

        // Objetos treeset
        objTreeSet();
    }

    public static void ordenamiento() {
        TreeSet<String> ordenamientoPersonas = new TreeSet<>(); // treeset implementa una interfaz "comparable", todo
                                                                // tipo de dato que implemente dicha interfaz hereda su
                                                                // funcionalidad.
        ordenamientoPersonas.add("Sandra");
        ordenamientoPersonas.add("Amanda");
        ordenamientoPersonas.add("Diana");

        for (String persona : ordenamientoPersonas) {
            System.out.println(persona);
        }
    }

    public static void objTreeSet(){
        // Objetos treeset
        Articulo articulo1 = new Articulo(01, "Primer articulo realizado!");
        Articulo articulo2 = new Articulo(02, "Segundo articulo realizado!");
        Articulo articulo3 = new Articulo(03, "Este es el Tercero articulo realizado!");

        // treeset
        TreeSet<Articulo> articulos = new TreeSet<Articulo>();
        articulos.add(articulo2);
        articulos.add(articulo3);
        articulos.add(articulo1);

        for (Articulo articulo : articulos) {
            System.out.println(articulo.getDescription());
        }
        System.out.println("");

        Articulo articulo22 = new Articulo();
        TreeSet<Articulo> articulos2 = new TreeSet<Articulo>(articulo22);
        articulos2.add(articulo1);
        articulos2.add(articulo2);
        articulos2.add(articulo3);

        for (Articulo articulo : articulos2) {
            System.out.println(articulo.getDescription());
        }
    }

    public static void objOrdenarArticulo(){

        
    }
}
