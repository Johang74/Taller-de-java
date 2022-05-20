import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Agenda de contactos: ");
        Agenda agenda = new Agenda();


        while (!salir) {
            System.out.println("Selecciones una opcion");
            System.out.println("1) Agregar contacto");
            System.out.println("2) Eliminar contacto");
            System.out.println("3) Mostrar contactos");
            System.out.println("4) Salir");
            int opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Escriba el numero a guardar: ");
                    int numero = entrada.nextInt();
                    System.out.println("Escribe el nombre: ");
                    String nombre = entrada.next();
                    System.out.println("Escribe la organizacion");
                    String organizacion = entrada.next();
                    agenda.agregarContacto(nombre,numero,organizacion);
                    break;
                case 2:
                    System.out.println("Escriba el numero del contacto a eliminar: ");
                    int numEl = entrada.nextInt();
                    agenda.borrarContacto(numEl);
                    break;
                case 3:
                    agenda.mostrarContactos();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }









    }
    
}