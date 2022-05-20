import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
                int opc;
                boolean salir = false;

                Cuenta cuenta = new Cuenta("0001",0);
                Scanner entradaEscaner = new Scanner(System.in);



                System.out.println("Su Banco Fiel");
                while (!salir){
                        System.out.println( "Escriba su opcion: ");
                        System.out.println("1) Realizar ingreso");
                        System.out.println("2) Realizar retiro");
                        System.out.println("3) Consultar saldo");
                        System.out.println("0) Salir");
                        opc = entradaEscaner.nextInt();

                        switch (opc){
                                case 1:
                                        System.out.println("Monto a ingresar");
                                        float montoIngreso = entradaEscaner.nextFloat();
                                        if (montoIngreso >0){
                                                cuenta.setSaldo(cuenta.saldo+montoIngreso);
                                                System.out.println("Su nuevo saldo es $"+cuenta.saldo);
                                        }else{
                                                System.out.println("Monto incorrecto, por favor vuelva a intentar");
                                        }
                                        break;
                                case 2:  System.out.println("Monto a retirar");
                                        float montoRetiro = entradaEscaner.nextFloat();
                                        float saldo = cuenta.saldo;
                                        if (montoRetiro <=saldo){
                                                cuenta.setSaldo(saldo-montoRetiro);
                                                System.out.println("Su nuevo saldo es $"+cuenta.saldo);
                                        }else{
                                                System.out.println("Monto incorrecto, por favor vuelva a intentar");
                                        }
                                        break;
                                case 3:
                                        System.out.println(cuenta.getSaldo());
                                        break;
                                default: salir = true;
                                        break;
                        }
                }




        }




}

