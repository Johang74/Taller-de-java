import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc;
        boolean salir;
        salir = false;

        System.out.println("Bienvenido a tu Escuela de conduccion");
        Escuela escuela = new Escuela();

        while (!salir){
            System.out.println("Selecciona una opcion");
            System.out.println("1) Ingresar usuario");
            System.out.println("2) Eliminar usuario");
            System.out.println("3) Consultar usuario");
            System.out.println("4) Salir");
            opc = entrada.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Ingresa el id: ");
                    String id = entrada.next();
                    System.out.println("Ingresa el nombre: ");
                    String nombre = entrada.next();
                    System.out.println("Escoja una opcion");
                    System.out.println("1) Aprobado");
                    System.out.println("2) NO aprobado");
                    System.out.println("Tenga en cuenta que cualquier otra opcion se tomara como NO APROBADO");
                    int aprobado = entrada.nextInt();

                    if (aprobado <= 1){
                        boolean a = true;
                        escuela.ingresarUsuario(id,nombre,a);
                    }else{
                        boolean a = false;
                        escuela.ingresarUsuario(id,nombre,a);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el id: ");
                    String idE = entrada.next();
                    escuela.eliminarUsuario(idE);
                    break;
                case 3:
                    System.out.println("Ingrese el id: ");
                    String idC = entrada.next();
                    escuela.consultarUsuario(idC);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }

    }
}
