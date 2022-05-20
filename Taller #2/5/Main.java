import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
                int edad,opc;
                boolean salir;


                Scanner entradaEscaner = new Scanner(System.in);
                salir = false;

                Drogueria.Producto producto = new Drogueria.Producto("Caracteristicas","Producto1",2800);
                Drogueria miSalud = new Drogueria();
                miSalud.listaProductos.add(producto);


                System.out.println("Bienvenido a Mi salud");
                while (!salir){
                        System.out.println( "Escriba su opcion: ");
                        System.out.println("1) Comprar producto");
                        System.out.println("2) Ver precios de productos");
                        System.out.println("3) Devolucion de producto");
                        System.out.println("0) Salir");
                        opc = entradaEscaner.nextInt();

                        switch (opc){
                                case 1:  miSalud.comprarProducto();
                                        break;
                                case 2:  miSalud.consultarPrecio();
                                        break;
                                case 3:  miSalud.hacerDevolucion();
                                        break;
                                default: salir = true;
                                        break;
                        }
                }




        }


}

