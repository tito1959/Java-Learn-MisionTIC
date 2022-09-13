package CollectionTest.HashSetTest;

import java.util.HashSet;
import java.util.Set;

public class HashShetTest {

    public static void main(String[] args) { 

        Set<String> miSet = new HashSet<String>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

        imprimir(miSet);
    }

    public static void imprimir(Set<String> miSet){
        for (String i : miSet) {
            System.out.println(i);
        }
    }
}
