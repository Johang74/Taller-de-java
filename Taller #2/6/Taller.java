import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Taller {

    public static class Moto{
        String observacionesCliente, registroSalida, arreglos,placa;

        public Moto( String observacionesCliente, String placa) {

            this.observacionesCliente = observacionesCliente;
            this.placa = placa;
            this.registroSalida = "";
            this.arreglos = "Ningun arreglo";

        }
    }

    List<Moto> listaMotos= new ArrayList<Moto>();
    String nombre;

    public void ingresarMoto(){

        Scanner entradaEscaner = new Scanner(System.in);
        System.out.println("Escriba el numero de placa");
        String placa = entradaEscaner.nextLine();
        System.out.println("Escriba las observaciones del cliente");
        String observacionesCliente = entradaEscaner.nextLine();
        Moto moto = new Moto(observacionesCliente,placa);
        listaMotos.add(moto);

    }

    public void sacarMoto(){
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.println("Ingrese el numero de placa");
        String placa = entradaEscaner.nextLine();
        System.out.println("Ingrese las novedades en la moto");
        String novedades = entradaEscaner.nextLine();
        System.out.println("Ingrese los arreglos hechos en la moto");
        String arreglos = entradaEscaner.nextLine();

        int indice = 0;
        String producto;
        for (Moto dato: listaMotos) {
            if (dato.placa == placa){
                listaMotos.remove(dato);
                System.out.println("Moto despachada con exito");
                break;
            }

        }

    }


}
