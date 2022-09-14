package CollectionTest.ListIterator;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * ListIterator permite realizar mas funcionalidades en una coleccion, esta es utilizada comunmente, cuando 
 * queremos modificar elementos de manera mas dinamica.
 */
public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Pepe");
        list.add("Ana");
        list.add("Sandra");
        list.add("Laura");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("España");
        list2.add("Colombia");
        list2.add("Mexico");
        list2.add("Peru");

        ListIterator<String> listA = list.listIterator();
        ListIterator<String> listB = list2.listIterator();

        while (listB.hasNext()) {
            if (listA.hasNext())
                listA.next();
            listA.add(listB.next());
        }
        System.out.println(list);

        // segunda iteracion a linkedList
        listB = list2.listIterator();
        while (listB.hasNext()) {
            listB.next();
            if (listB.hasNext()) {
                listB.next();
                listB.remove();
            }
        }
        System.out.println(list2);

        list.removeAll(list2);
        System.out.println(list);
    }
}
