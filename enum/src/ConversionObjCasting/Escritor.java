package ConversionObjCasting;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String determinarEmpleado() {
        return "Soy de tipo Escritor " + ", tipo Escritura: " + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor [tipoEscritura=" + tipoEscritura + ", " + super.toString() + "]";
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }    

    
}   
