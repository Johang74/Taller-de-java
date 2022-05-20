import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
                int opc;
                boolean salir = false;


                Scanner entradaEscaner = new Scanner(System.in);



                System.out.println("Calculadora de Area");
                while (!salir){
                        System.out.println( "Escriba su opcion: ");
                        System.out.println("1) Area de un rectangulo");
                        System.out.println("2) Area de un triangulo");
                        System.out.println("3) Area de un trapecio");
                        System.out.println("0) Salir");
                        opc = entradaEscaner.nextInt();

                        switch (opc){
                                case 1:
                                        System.out.println("Escriba la base del rectangulo:");
                                        float baseR = entradaEscaner.nextFloat();
                                        System.out.println("Escriba la altura del rectangulo:");
                                        float alturaR = entradaEscaner.nextFloat();
                                        float resultadoR = Calculadora.calcularRectangulo(baseR,alturaR);
                                        System.out.println(resultadoR);
                                        break;
                                case 2:  System.out.println("Escriba la base del triangulo:");
                                        float baseT = entradaEscaner.nextFloat();
                                        System.out.println("Escriba la altura del triangulo:");
                                        float alturaT = entradaEscaner.nextFloat();
                                        float resultadoT = Calculadora.calcularTriangulo(baseT,alturaT);
                                        System.out.println(resultadoT);
                                        break;
                                case 3:  System.out.println("Escriba la base mayor del trapecio:");
                                        float baseMay = entradaEscaner.nextFloat();
                                        System.out.println("Escriba la base menor del trapecio:");
                                        float baseMen = entradaEscaner.nextFloat();
                                        System.out.println("Escriba la altura del trapecio:");
                                        float altura = entradaEscaner.nextFloat();
                                        float resultado = Calculadora.calcularTrapecio(baseMay,baseMen,altura);
                                        System.out.println(resultado);
                                        break;
                                default: salir = true;
                                        break;
                        }
                }




        }




}

