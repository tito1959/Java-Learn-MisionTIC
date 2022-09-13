package Generics.Test2;

public class GenericPareja<T> {

    private T primero;

    public GenericPareja() {
        this.primero = null;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public T getPrimero() {
        return primero;
    }

    public static void imprimirTrabajador(GenericPareja<? extends Empleado> empleado){ // comodin: permite implementar herencias
        Empleado empleado1 = empleado.getPrimero();
        System.out.println(empleado1);
    }

}
