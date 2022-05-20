import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
                float imc;
                int opc;
                boolean salir;


                Scanner entradaEscaner = new Scanner(System.in);
                salir = false;

                System.out.println("Calculadora de IMC");
                while (!salir){
                        System.out.println( "Escriba su opcion: ");
                        System.out.println("1) Calcular IMC");
                        System.out.println("0) Salir");
                        opc = entradaEscaner.nextInt();

                        switch (opc){
                                case 1:  System.out.println("Digita tu nombre: ");
                                         String nombre = entradaEscaner.nextLine();
                                         imc = calcularIMC();
                                        if (imc < 18.5){
                                                System.out.println(nombre+" tiene bajo peso, imc ="+imc);
                                        } else if (imc >= 18.5 && imc <= 24.9) {
                                                System.out.println(nombre+" tiene un peso normal, imc ="+imc);
                                        } else if (imc >= 25 && imc <=29.9) {
                                                System.out.println(nombre+" tiene sobrepeso, imc ="+imc);
                                        }else System.out.println(nombre+" tiene obesidad , imc ="+imc);
                                        break;
                                case 2:  salir = true;
                                        break;
                                default: salir = true;
                                        break;
                        }
                }




        }

        public static float calcularIMC(){
                Scanner entradaEscaner = new Scanner(System.in);
                System.out.println("Digita tu estatura en metros");
                float estatura = entradaEscaner.nextFloat();
                System.out.println("Digita tu peso en Kg");
                float peso = entradaEscaner.nextFloat();
                float imc = peso/(estatura*estatura);
                return imc;
        }


}

