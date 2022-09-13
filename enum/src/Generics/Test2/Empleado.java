package Generics.Test2;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [edad=" + edad + ", nombre=" + nombre + ", salario=" + salario + "]";
    }

}
