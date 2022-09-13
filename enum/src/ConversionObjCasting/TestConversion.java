package ConversionObjCasting;

public class TestConversion {
    public static void main(String[] args) {
        Empleado empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println(empleado.determinarEmpleado());

        // // empleado.getTipoEscritura => no es posible, se necesita Down casting:
        // System.out.println(
        //         ((Escritor) empleado).getTipoEscritura());

        // Escritor escritor = (Escritor) empleado;
        // System.out.println(escritor.getTipoEscritura());

        // // Upcasting:
        // Empleado empleado2 = escritor;
        // System.out.println(empleado2.determinarEmpleado());

        var casteado = casting(empleado);
        System.out.println("Retorna: " + casteado);
    }

    public static Empleado casting (Empleado empleado){
        if(empleado instanceof Escritor){
            Escritor escritor =  ((Escritor)empleado);
            System.out.println(escritor.getTipoEscritura());
            return escritor;
        }else{
            System.out.println("El objeto: " + empleado + "No pertenece a una instancia de la clase Empleado.");
            return null;
        }
    }
}
