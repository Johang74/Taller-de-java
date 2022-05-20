import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
                int edad,opc;
                boolean salir;


                Scanner entradaEscaner = new Scanner(System.in);
                salir = false;

                Taller elMaquinista = new Taller();



                System.out.println("Bienvenido a El Maquinista");
                while (!salir){
                        System.out.println( "Escriba su opcion: ");
                        System.out.println("1) Ingresar moto");
                        System.out.println("2) Despachar moto");
                        System.out.println("0) Salir");
                        opc = entradaEscaner.nextInt();

                        switch (opc){
                                case 1:  elMaquinista.ingresarMoto();
                                        break;
                                case 2:  elMaquinista.sacarMoto();
                                        break;
                                default: salir = true;
                                        break;
                        }
                }




        }


}

