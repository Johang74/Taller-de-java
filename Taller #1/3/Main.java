import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            String nombre, apellido, nombrePadre,apellidoPadre,nombreMadre,apellidoMadre;


            Scanner entradaEscaner = new Scanner(System.in);
            System.out.println("Escribe tu nombre: ");
            nombre = entradaEscaner.nextLine();
            System.out.println("Escribe tu apellido: ");
            apellido = entradaEscaner.nextLine();
            System.out.println("Escribe el nombre de tu padre: ");
            nombrePadre = entradaEscaner.nextLine();
            System.out.println("Escribe el apellido de tu padre: ");
            apellidoPadre = entradaEscaner.nextLine();
            System.out.println("Escribe el nombre de tu madre: ");
            nombreMadre = entradaEscaner.nextLine();
            System.out.println("Escribe el apellido de tu madre: ");
            apellidoMadre = entradaEscaner.nextLine();

            System.out.println("Yo "+nombre+" "+apellido+" soy hijo de "+nombreMadre+" "+apellidoMadre+" y "+nombrePadre+" "+apellidoPadre);
        }
}
