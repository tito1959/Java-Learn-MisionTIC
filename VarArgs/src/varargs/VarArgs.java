package varargs;

public class VarArgs {
    
    public static void main(String[] args) {
        
        imprimirNumeros(3, 4, 5, 6, 9);
        imprimirNumeros(2, 4);
        
        variosParametros("Juan", 1, 2, 8, 9, 15);
    }
    
    private static void variosParametros(String nombre, int... numeros) { // los argumentos varArgs deben ir de ultima instancia
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros) { //varargs -> arreglo dinamico
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: " + numeros[i]);
        }
    }
    
}
