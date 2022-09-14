package CollectionTest.MapsTest;

public class Empleado {

    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado [nombre = " + nombre + ", sueldo = " + sueldo + "]";
    }    
}
