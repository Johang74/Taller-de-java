import java.util.ArrayList;

public class Escuela {
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public void ingresarUsuario(String id, String nombre, boolean aprobado) {
        boolean existe = false;
        for (Usuario usuario : this.usuarios) {
            if (usuario.id.equals(id)) {
                System.out.println("El usuario ya esta en la escuela");
                existe = true;
                break;
            }
        }
        if (!existe && this.usuarios.size() <= 8){
            Usuario usuario = new Usuario(id,nombre,aprobado);
            this.usuarios.add(usuario);

        }else {
            System.out.println("La clase de ya no tiene cupos");
        }
    }

    public void eliminarUsuario(String id){
        boolean existe = false;
        for (Usuario usuario:this.usuarios) {
            if (usuario.id.equals(id)){
                this.usuarios.remove(usuario);
                existe = true;
                break;
            }
        }
        if(!existe){
            System.out.println("El usuario no registra en la escuela");
        }
    }

    public void consultarUsuario(String id) {
        boolean existe = false;
        for (Usuario usuario : this.usuarios) {
            if (usuario.id.equals(id)) {
                if (usuario.aprobado == true) {
                    String apro = "Aprobado";
                    System.out.println("Id: "+usuario.id+" Nombre: "+usuario.nombre+" Apro: "+apro);
                    existe = true;
                    break;
                } else {
                    String apro = "NO aprobado";
                    System.out.println("Id: "+usuario.id+" Nombre: "+usuario.nombre+" Apro: "+apro);
                    break;
                }

            }
        }

            if (!existe) {
                System.out.println("El usuario no registra en la escuela");

        }
    }

        public class Usuario{
            String nombre,id;
            boolean aprobado;

            public Usuario(String id,String nombre, boolean aprobado) {
                this.id = id;
                this.nombre = nombre;
                this.aprobado = aprobado;
            }
        }
    }

