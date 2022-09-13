package Generics.Test2;

public class GenericsClassTest {
    public static void main(String[] args) {
        
        // Empleado Administrativa = new Empleado("Elena", 45, 1500);
        Empleado DirectoraComercial = new Jefe("Ana", 27, 3500);
        Empleado nuevo = DirectoraComercial;
        System.out.println(nuevo);

        // Programacion generica:
        GenericPareja<Empleado> AdministrativaMain = new GenericPareja<Empleado>();
        AdministrativaMain.setPrimero(new Empleado("Elena", 25, 1500));

        GenericPareja<Jefe> DirectoraComercialMain = new GenericPareja<Jefe>();
        DirectoraComercialMain.setPrimero(new Jefe("Carlos", 30, 3000));
        // GenericPareja<Empleado> nuevoEmpleado = DirectoraComercialMain; => error

        GenericPareja.imprimirTrabajador(AdministrativaMain);
        GenericPareja.imprimirTrabajador(DirectoraComercialMain);
    }
}
