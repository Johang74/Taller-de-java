import java.util.ArrayList;

public class Agenda {

    ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
    
    public void agregarContacto(String nombre, int numero, String organizacion){
        boolean existe = false;
        Contacto con = new Contacto(nombre,numero,organizacion);
        for (Contacto c:this.listaContactos) {
            if (c.numero == numero){
                existe=true;
                break;
            }
        }
        if (existe){
            System.out.println("El contacto ya existe");
        }else{
            if (this.listaContactos.size() <= 3){
                this.listaContactos.add(con);
            }
        }

    }
    public void borrarContacto(int numero){
        for (Contacto c:this.listaContactos) {
            if (c.numero == numero){
                this.listaContactos.remove(c);
                break;
            }
        }
    }

    public void mostrarContactos(){
        for (Contacto c:this.listaContactos) {
            System.out.println("Nombre: "+c.nombre+" numero"+c.numero+" Organizacion: "+c.organizacion);

        }
    }
    
    public static class Contacto {
        String nombre, organizacion;
        int numero;

        public Contacto( String nombre, int numero, String organizacion){
            this.nombre = nombre;
            this.numero = numero;
            this.organizacion = organizacion;

        }
        
    }
    
    
}