package ConversionObjCasting;

public class Gerente extends Empleado {

    private char bloque;

    public Gerente() {
    }

    public Gerente(String nombre, double sueldo, char bloque) {
        super(nombre, sueldo);
        this.bloque = bloque;
    }

    public char getBloque() {
        return bloque;
    }

    public void setBloque(char bloque) {
        this.bloque = bloque;
    }

    @Override
    public String determinarEmpleado() {
        return ("Soy tipo Gerente y pertenezco al bloque: " + this.bloque);
    }

}
