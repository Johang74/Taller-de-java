
import java.io.*;

public class Cinco {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		boolean b;
		String nom;
		int opcionn;
		nom = "Debe registrar un nombre ";
		b = true;
		while (b==true) {
			System.out.println("1.Capturar Nombre ");
			System.out.println("2.Saludar persona ");
			System.out.println("3.Salir del sistema ");
			opcionn = Integer.parseInt(bufEntrada.readLine());
			switch (opcionn) {
			case 1:
				System.out.println("Digite el nombre ");
				nom = bufEntrada.readLine();
				break;
			case 2:
				System.out.println("Hola! "+nom);
				break;
			case 3:
				b = false;
				break;
			default:
			}
		}
	}


}

