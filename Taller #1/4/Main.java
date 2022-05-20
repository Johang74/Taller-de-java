import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            String ciudad, pais;


            Scanner entradaEscaner = new Scanner(System.in);
            System.out.println("Escriba la ciudad: ");
            ciudad = entradaEscaner.nextLine();
            System.out.println("Escribe el pais: ");
            pais = entradaEscaner.nextLine();


            System.out.println("La ciudad "+ciudad+", es la capital del pais "+pais);
        }
}
