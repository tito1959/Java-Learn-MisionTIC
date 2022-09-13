package Files.ManejoF;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoF {

    public static void crearArchivo(String nombreF) {

        File archivo = new File(nombreF);

        // manejando el obj tipo file
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();

            System.out.println("Se ha creado el archivo");

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreF, String Contenido) {

        File archivo = new File(nombreF);

        // manejando el obj tipo file
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.print(Contenido);
            salida.close();

            System.out.println("Se ha escrito en el archivo");

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void anexarArchivo(String nombreF, String Contenido){

        File archivo = new File(nombreF);

        try {

            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(Contenido);
            salida.close();
            System.out.println("Se sobreescribió el archivo");

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreF){

        var archivo = new File(nombreF);

        try (var entrada = new BufferedReader(new FileReader(archivo))) {
            
            var lectura = entrada.readLine();

            //Leer todas las lineas del documento:
            while (lectura != null) {
                System.out.println("Lectura: " + lectura);
                lectura = entrada.readLine();
            }

            entrada.close();

        } catch(FileNotFoundException e){
            e.printStackTrace(System.out);
        }
         catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
