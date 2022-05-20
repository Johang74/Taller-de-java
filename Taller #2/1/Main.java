import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            int edad;


            Scanner entradaEscaner = new Scanner(System.in);
            System.out.println("Escribe tu edad: ");
            edad = entradaEscaner.nextInt();
            if (edad >= 18) {
                System.out.println("Usted es mayor de edad");
            }



        }
}
