package InstanceOfTest;

public class InstanceOfTest {
    public static void main(String[] args) {
        /*
         * Los objetos se crean en el lado derecho de toda delcaracion: new
         * InstanceOf es un metodo que permite determinar que tipo de objeto esta en
         * memoria.
         */

        Empleado empleado = new Gerente("Selenium", 5000, 'A');
        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) { // aunque la clase sea hijo de empleado, no se puede acceder a sus metodos hijos:
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");

            Gerente gerente = (Gerente) empleado; // conversion de tipos: casteo
            gerente.setBloque('B');
            
            empleado.determinarEmpleado();
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        } else {
            System.out.println("No es gerente");
        }
    }
}
