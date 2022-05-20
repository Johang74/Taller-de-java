import java.util.ArrayList;

public class Pasteleria {
    public class Torta{
        String sabor, decoracion;
        int numPorciones;
        float precio;

        public Torta(String sabor, String decoracion, int numPorciones, float precio) {
            this.sabor = sabor;
            this.decoracion = decoracion;
            this.numPorciones = numPorciones;
            this.precio=precio;
        }
    }
    public class Venta{
        String idCliente,idTorta;

        public Venta(String idCliente, String idTorta) {
            this.idCliente = idCliente;
            this.idTorta = idTorta;
        }
    }

    ArrayList <Torta> tortasDisponibles = new ArrayList<Torta>();
    ArrayList <Venta> registroVentas = new ArrayList<Venta>();

    public void registrarPedido(String idCliente, String idTorta){
        Venta pedido = new Venta(idCliente,idTorta);
        registroVentas.add(pedido);
    }

    public ArrayList<Torta> getTortasDisponibles() {
        return tortasDisponibles;
    }

    public ArrayList<Venta> getRegistroVentas() {
        return registroVentas;
    }
}
