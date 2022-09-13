package InstanceOfTest;

public class Gerente extends Empleado{

    private char bloque;

    public Gerente() {
    }

    public Gerente(String nombre, double sueldo, char bloque) {
        super(nombre, sueldo);
        this.bloque = bloque;
    }   

    @Override
    public void determinarEmpleado() {
        System.out.println("Soy tipo Gerente y pertenezco al bloque: " + this.bloque);
    }

    public char getBloque() {
        return bloque;
    }

    public void setBloque(char bloque) {
        this.bloque = bloque;
    }   
    
}
