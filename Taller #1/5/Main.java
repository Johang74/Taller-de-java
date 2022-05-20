import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            String nombreMascota, tipoMascota, nombre;
            int edadMascota;


            Scanner entradaEscaner = new Scanner(System.in);
            System.out.println("Escriba el nombre de su mascota: ");
            nombreMascota = entradaEscaner.nextLine();
            System.out.println("Escribe la edad de tu mascota: ");
            edadMascota = entradaEscaner.nextInt();
            System.out.println("Escriba el tipo de su mascota: ");
            tipoMascota = entradaEscaner.nextLine();
            System.out.println("Escribe tu nombre completo: ");
            nombre = entradaEscaner.nextLine();

            System.out.println(nombreMascota+" es un(a) "+ tipoMascota+", el cual, tiene " +edadMascota+" años de edad y " +nombre+" es actualmente su dueño(a).");
        }
}
