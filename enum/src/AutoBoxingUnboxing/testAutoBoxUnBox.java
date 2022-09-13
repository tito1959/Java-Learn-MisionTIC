package AutoBoxingUnboxing;

public class testAutoBoxUnBox {
    /*
     * Clases envolventes de tipos primitivos
     * int => Integer
     * long => Long
     * float => Float
     * double => Double
     * 
     * - Los algoritmos que requirean de caluclos deberian ser primitivos
     */

    public static void main(String[] args) {

        /*
         * AutoBoxing:
         */
        Integer entero = 10;
        System.out.println(entero.doubleValue());

        /*
         * UnBoxing:
         */

         int entero2 = entero;
         System.out.println(entero2);
    }
}
