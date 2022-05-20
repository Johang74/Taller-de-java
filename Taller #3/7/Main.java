import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opc;
        boolean salir;
        salir = false;

        System.out.println("Bienvenido a tu parqueadero");
        Parqueadero parqueadero = new Parqueadero();

        while (!salir){
            System.out.println("Selecciona una opcion");
            System.out.println("1) Ingresar vehiculo");
            System.out.println("2) Retirar vehiculo");
            System.out.println("3) Consultar vehiculo");
            System.out.println("4) Salir");
            opc = entrada.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Ingresa la placa: ");
                    String placa = entrada.next();
                    System.out.println("Ingresa la marca: ");
                    String marca = entrada.next();
                    System.out.println("Ingresa el nombre del cliente: ");
                    String nombreCliente = entrada.next();
                    System.out.println("Ingresa el numero telefonico del cliente");
                    int telefonoCliente = entrada.nextInt();
                    parqueadero.ingresarVehiculo(placa,marca,nombreCliente,telefonoCliente);
                    break;
                case 2:
                    System.out.println("Ingrese la placa: ");
                    String placaE = entrada.next();
                    parqueadero.retirarVehiculo(placaE);
                    break;
                case 3:
                    System.out.println("Ingrese la placa: ");
                    String placaC = entrada.next();
                    parqueadero.consultarVehiculo(placaC);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }

    }
}
