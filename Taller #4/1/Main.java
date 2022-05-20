
import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int i;
		int num;
		int vector[];
		vector = new int[5];
		for (i=0;i<=4;i++) {
			System.out.println("Escribe un numero: ");
			num = Integer.parseInt(bufEntrada.readLine());
			vector[i] = num;
		}
		for (i=0;i<=4;i++) {
			System.out.print("["+i+"] = ");
			System.out.println(vector[i]);
		}
	}


}

