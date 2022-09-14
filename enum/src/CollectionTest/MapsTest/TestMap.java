package CollectionTest.MapsTest;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        
        HashMap<String, Empleado> map1 = new HashMap<String, Empleado>();
        map1.put("145", new Empleado("Kira", 2500));
        map1.put("222", new Empleado("Kaoba", 3000));
        map1.put("123", new Empleado("Mure", 1000));

        System.out.println(map1);
        map1.remove("123");
        System.out.println(map1);
    }
}
