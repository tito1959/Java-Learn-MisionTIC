package co.com.sebas.peliculas.servicio;

import co.com.sebas.peliculas.datos.AccesoDatosImp;
import co.com.sebas.peliculas.datos.IAccesoDatos;
import co.com.sebas.peliculas.domain.Pelicula;
import co.com.sebas.peliculas.excepciones.AccesoDatosEx;
import co.com.sebas.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImp implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImp() {
        // Inicializando el acceso a la clase de Datos.
        this.datos = new AccesoDatosImp();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;

        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);

        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso a datos");
            e.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas() {

        try {
            var Peliculas = this.datos.listar(NOMBRE_RECURSO);
            for (Pelicula pelicula : Peliculas) {
                System.out.println(pelicula);
            }

        } catch (LecturaDatosEx e) {
            e.printStackTrace();
            System.out.println("Error de acceso a datos: " + e.getMessage());
        }
    }

    @Override
    public void buscarPelicula(String buscar) {

        try {
            String resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
            System.out.println("Resultado: " + resultado);

        } catch (LecturaDatosEx e) {
            e.printStackTrace();
            System.out.println("Error en la busqueda: " + e.getMessage());
        }
    }

    @Override
    public void iniciarCatalogoPeliculas() {

        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                this.datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx e) {
            e.printStackTrace();
            System.out.println("Error al iniciar: " + e.getMessage());
        }
    }

}
