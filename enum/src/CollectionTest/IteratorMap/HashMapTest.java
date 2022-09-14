package CollectionTest.IteratorMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Lunes", 5000);
        map.put("Martes", 2000);

        imprimir(map);
    }

    public static void imprimir(Map<String, Integer> collection){
        System.out.println(collection.entrySet());
    }
}
