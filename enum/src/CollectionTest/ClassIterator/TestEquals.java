package CollectionTest.ClassIterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * En estos casos set no pude diferenciar los objetos con un mismo tipo por lo que se consideran objetos con distinto espacio de referencia en memoria
 * por lo cual debemos hacer uso de equals and Hash
 */
public class TestEquals {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Maria", "0001", 3500);
        Cliente cliente2 = new Cliente("Pedro", "0002", 10000);
        Cliente cliente3 = new Cliente("Marcos", "0005", 2000);
        Cliente cliente4 = new Cliente("Karla", "0020", 35000);
        Cliente cliente5 = new Cliente("Esteban", "0001", 500);

        Set<Cliente> clientes = new HashSet<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);

        /*
         * for (Cliente cliente : clientes) {
         * // error de iteracion, complejo remover elementos al ser iterados:
         * if (cliente.getN_cuenta().equals("0005")) {
         * clientes.remove(cliente);
         * }
         * System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " +
         * cliente.getSaldo());
         * }
         */

        Iterator<Cliente> iterador = clientes.iterator();

        while (iterador.hasNext()) {
            String id_remove = iterador.next().getN_cuenta();

            if (id_remove.equals("0005")) {
                iterador.remove();
            }
            // no se puede remover un elemento en una estructura ciclica, ya que la
            // coleccion cambia de tamaño a la vez que el codigo intenta realizar el ciclo.
        }

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

    }
}
