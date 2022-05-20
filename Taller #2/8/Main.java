import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
                int opc;
                boolean salir = false;


                Scanner entradaEscaner = new Scanner(System.in);
                Pasteleria pasteleria = new Pasteleria();


                System.out.println("Pasteleria Don Carlos");
                while (!salir){
                        System.out.println( "Escriba su opcion: ");
                        System.out.println("1) Registrar pedido");
                        System.out.println("2) Tortas disponibles");
                        System.out.println("3) Registro de ventas");
                        System.out.println("0) Salir");
                        opc = entradaEscaner.nextInt();

                        switch (opc){
                                case 1:
                                        System.out.println("Escriba el identificador del cliente:");
                                        String idCliente = entradaEscaner.nextLine();
                                        System.out.println("Escriba el identificador de la torta:");
                                        String idTorta = entradaEscaner.nextLine();
                                        pasteleria.registrarPedido(idCliente,idTorta);
                                        break;
                                case 2:  pasteleria.getTortasDisponibles();
                                        break;
                                case 3:  pasteleria.getRegistroVentas();
                                        break;
                                default: salir = true;
                                        break;
                        }
                }




        }




}

