package forEach;

public class testForEach {
    public static void main(String[] args) {
        
        int edades[] = {1, 2, 3, 4, 5, 6, 7, 8};

        for(int edad : edades){
            System.out.println("Edad = " + edad);
        }
    }
}
