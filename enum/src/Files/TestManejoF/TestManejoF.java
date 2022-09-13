package Files.TestManejoF;

import Files.ManejoF.ManejoF;

public class TestManejoF {

    public static void main(String[] args) {
        
        var nombreF = "Prueba.txt";

        // crearArchivo(nombreF);
        // ManejoF.anexarArchivo(nombreF, "Hola desde Java");
        // ManejoF.anexarArchivo(nombreF, "Adios");

        ManejoF.leerArchivo(nombreF);
    }
}
