package co.com.sebas.peliculas.datos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import co.com.sebas.peliculas.domain.Pelicula;
import co.com.sebas.peliculas.excepciones.*;

public class AccesoDatosImp implements IAccesoDatos {

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        return archivo.exists(); // true o false, si el doc existe.
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();

        // Lectura del sistema:
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();

            while (linea != null) {
                var pelicula = new Pelicula(linea);
                peliculas.add(pelicula);

                linea = entrada.readLine();
            }

            entrada.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // Propragando la excepcion:
            throw new LecturaDatosEx("Excepcion al listar peliculas" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        var archivo = new File(nombreRecurso);

        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito la información al archivo: " + pelicula);

        } catch (IOException e) {
            e.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir peliculas: " + e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        String resultado = null;

        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;

            linea = entrada.readLine();

            var indice = 1;
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula: " + linea + ", Encontrada en el indice: " + indice;
                    break;
                }

                linea = entrada.readLine();
                indice++;
            }

            entrada.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar pelicula: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");

        } catch (IOException e) {
            e.printStackTrace();
            throw new AccesoDatosEx("Exepcion al crear archivo: " + e.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) {
        var archivo = new File(nombreRecurso);

        if (archivo.exists()) {
            archivo.delete();
        }

        System.out.println("Se ha borrado el archivo");
    }

}
