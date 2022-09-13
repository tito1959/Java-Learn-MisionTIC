package Generics;

import java.util.ArrayList;
import java.util.List;

public class TestColleccionesGenericas {
    public static void main(String[] args) {
        
        List<String> test1 = new ArrayList<>();
        test1.add("test1");
        test1.add("test2");
        test1.add("test3");

        String miElemento = test1.get(2);
        System.out.println(miElemento);
    }
}
