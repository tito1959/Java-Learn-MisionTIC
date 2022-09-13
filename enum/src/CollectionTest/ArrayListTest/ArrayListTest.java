package CollectionTest.ArrayListTest;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        
        ArrayList<Integer> array1 = new ArrayList<Integer>();

        array1.add(5);
        array1.add(53);
        array1.add(522);
        array1.add(25);

        array1.forEach((n) -> System.out.println(n));
    }
}