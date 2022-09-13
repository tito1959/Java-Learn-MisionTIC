package Generics;

public class MainGenerics {
    public static void main(String[] args) {

        GenericsTest<Integer> test = new GenericsTest<Integer>(15);
        test.obtenerTipo();

        GenericsTest<String> test2 = new GenericsTest<String>("Maria");
        test2.obtenerTipo();
    }
}
