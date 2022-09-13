package co.com.sebas.peliculas.presentacion;

import java.util.Scanner;

import co.com.sebas.peliculas.servicio.CatalogoPeliculasImp;
import co.com.sebas.peliculas.servicio.ICatalogoPeliculas;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {

        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImp();

        while (opcion != 0) {
            System.out.println("Elige una opcion \n"
                    + "1. Iniciar Catalogo Peliculas\n"
                    + "2. Agregar Peliculas\n"
                    + "3. Listar Peliculas\n"
                    + "4. Buscar Peliculas\n"
                    + "0. Salir");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula");
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce Una pelicula a buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta pronto!");
                    break;

                default:
                    System.out.println("Operacion no reconocida");
                    break;
            }
        }

        scanner.close();
    }
}
