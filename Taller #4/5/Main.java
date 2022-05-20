/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CINCO.java."

import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int columna;
		int fila;
		int matrizresultados[][];
		matrizresultados = new int[10][10];
		for (fila=1;fila<=10;fila++) {
			for (columna=1;columna<=10;columna++) {
				System.out.print(columna+" X "+fila+" |");
			}
			System.out.println("");
		}
		for (fila=0;fila<=9;fila++) {
			for (columna=0;columna<=9;columna++) {
				matrizresultados[fila][columna] = (fila+1)*(columna+1);
			}
		}
		System.out.println("Escriba la fila: ");
		fila = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Escriba la columna: ");
		columna = Integer.parseInt(bufEntrada.readLine());
		System.out.println(matrizresultados[fila-1][columna-1]);
	}


}

