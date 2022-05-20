import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drogueria {

    public static class Producto{
        String caracteristicas,nombre;
        float precio;

        public Producto(String caracteristicas, String nombre, float precio) {
            this.caracteristicas = caracteristicas;
            this.nombre = nombre;
            this.precio = precio;
        }
    }

    List<Producto> listaProductos= new ArrayList<Producto>();
    String nombre;

    public void comprarProducto(){
        int indice = 0;
        String producto;
        for (Producto dato: listaProductos) {
            indice++;
            System.out.println(indice+") "+dato.nombre+" "+dato.caracteristicas+" $ "+dato.precio);


        }
        System.out.println("Que producto desea comprar? ");
        Scanner entradaEscaner = new Scanner(System.in);
        producto = entradaEscaner.nextLine();
        System.out.println("Compraste "+producto);
    }

    public void consultarPrecio(){
        int indice = 0;
        String producto;
        for (Producto dato: listaProductos) {
            indice++;
            System.out.println(indice+") "+dato.nombre+" "+dato.caracteristicas+" $ "+dato.precio);
        }

    }

    public void hacerDevolucion(){
        System.out.println("Se ha adevuelto el producto");
    }
}
