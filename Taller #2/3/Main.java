import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            String nombre,apellido;
            int edad;


            Scanner entradaEscaner = new Scanner(System.in);
            System.out.println("Escribe tu nombre: ");
            nombre = entradaEscaner.nextLine();
            System.out.println("Escribe tu apellido: ");
            apellido = entradaEscaner.nextLine();
            System.out.println("Escribe tu edad: ");
            edad = entradaEscaner.nextInt();


            if (edad >= 18) {
                System.out.println(nombre+" "+apellido+" usted es mayor de edad, por lo tanto puede entrar a la fiesta");
            }else {
                System.out.println(nombre+" "+apellido+" usted es menor de edad, por lo tanto no puede entrar a la fiesta, por favor devuelvase a su casa");
            }



        }
}
