import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            String nombre, apellido;
            int edad;
            float estatura;
            Scanner entradaEscaner = new Scanner(System.in);
            System.out.println("Escribe tu nombre: ");
            nombre = entradaEscaner.nextLine();
            System.out.println("Escribe tu apellido: ");
            apellido = entradaEscaner.nextLine();
            System.out.println("Escribe tu edad");
            edad = entradaEscaner.nextInt();
            System.out.println("Escribe tu estatura");
            estatura= entradaEscaner.nextFloat();


        }
}
