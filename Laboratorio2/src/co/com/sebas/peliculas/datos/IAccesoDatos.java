package co.com.sebas.peliculas.datos;

import java.util.List;

import co.com.sebas.peliculas.domain.Pelicula;
import co.com.sebas.peliculas.excepciones.*;

public interface IAccesoDatos {

    // Si existe el dato retorna boolean:
    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    // Devuelve la lista de peliculas del recurso:
    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    // Agrega nuevas listas al recurso, Anexar => si se anexa o se sobre escribe.
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    // devuelve un String con el parametro buscado
    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    // Crea un nuevo recurso
    void crear(String nombreRecurso) throws AccesoDatosEx;

    // Elimina un recurso existente:
    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
