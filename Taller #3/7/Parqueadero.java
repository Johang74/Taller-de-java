import java.util.ArrayList;

public class Parqueadero {
    ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public void ingresarVehiculo(String placa,String marca, String nombreCliente,int telefonoCliente){
        boolean existe = false;
        for (Vehiculo v:this.vehiculos) {
            if (v.placa.equals(placa)){
                System.out.println("El vehiculo ya esta en el parqueadero");
                existe = true;
                break;
            }
        }
        if (!existe && this.vehiculos.size() <= 5){
            Vehiculo ve = new Vehiculo(placa,marca,nombreCliente,telefonoCliente);
            this.vehiculos.add(ve);

        }else {
            System.out.println("El parqueadero ya esta lleno");
        }
    }

    public void retirarVehiculo(String placa){
        boolean existe = false;
        for (Vehiculo v:this.vehiculos) {
            if (v.placa.equals(placa)){
                this.vehiculos.remove(v);
                existe = true;
                break;
            }
        }
        if(!existe){
            System.out.println("El vehiculo no esta en el parqueadero");
        }
    }

    public void consultarVehiculo(String placa){
        boolean existe = false;
        for (Vehiculo v:this.vehiculos) {
            if (v.placa.equals(placa)){
                System.out.println("Placa: "+v.placa+" Marca: "+v.marca+" Cliente: "+v.nombreCliente+" Telefono: "+v.telefonoCliente);
                existe=true;
                break;
            }
        }
        if (!existe){
            System.out.println("El vehiculo no esta en el parqueadero");
        }
    }

    public class Vehiculo{
        String placa, marca, nombreCliente;
        int telefonoCliente;

        public Vehiculo(String placa, String marca, String nombreCliente, int telefonoCliente) {
            this.placa = placa;
            this.marca = marca;
            this.nombreCliente = nombreCliente;
            this.telefonoCliente = telefonoCliente;
        }
    }
}
