import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoTienda {

    public static class Pelicula{
        String nombre,duracion,genero;

        public Pelicula(String nombre, String duracion, String genero) {
            this.nombre = nombre;
            this.duracion = duracion;
            this.genero = genero;
        }
    }


    List<Pelicula> listaPeliculas= new ArrayList<Pelicula>();

    public void alquilarPelicula() {
        String pelicula;
        System.out.println("Escriba el nombre de la pelicula");
        Scanner entradaEscaner = new Scanner(System.in);
        pelicula = entradaEscaner.nextLine();
        System.out.println("Pelicula "+ pelicula+" alquilada!");
    }

    public void consultarPeliculas(){
        System.out.println("Listado de peliculas");
        int indice = 0;
        for(Pelicula dato :listaPeliculas) {
            indice++;
            System.out.println(indice+") "+dato.nombre+" "+dato.genero+" "+dato.duracion);
        }
    }
    public void recibirPelicula(){
        Scanner entradaEscaner = new Scanner(System.in);
        String novedades;
        System.out.println("Agrega las novedades");
        novedades=entradaEscaner.nextLine();
        System.out.println("Pelicula recibida con exito con las siguientes novedades "+novedades);
    }
}
