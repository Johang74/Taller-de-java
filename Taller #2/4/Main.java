import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            String nombre,apellido;
            int edad,opc;
            boolean salir;


            Scanner entradaEscaner = new Scanner(System.in);
            salir = false;

            VideoTienda.Pelicula pelicula = new VideoTienda.Pelicula("Titanic","3:00.28","Drama");
            VideoTienda porvenir = new VideoTienda();
            porvenir.listaPeliculas.add(pelicula);


            System.out.println("Bienvenido a la video tienda");
            while (!salir){
                System.out.println( "Escriba su opcion: ");
                System.out.println("1) Alquilar pelicula");
                System.out.println("2) Consultar peliculas disponibles");
                System.out.println("3) Recibir pelicula");
                System.out.println("0) Salir");
                opc = entradaEscaner.nextInt();

                switch (opc){
                    case 1:  porvenir.alquilarPelicula();
                        break;
                    case 2:  porvenir.consultarPeliculas();
                        break;
                    case 3:  porvenir.recibirPelicula();
                        break;
                    default: salir = true;
                        break;
                }
            }




        }


}

