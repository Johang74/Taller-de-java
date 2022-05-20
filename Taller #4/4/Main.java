

import java.io.*;

public class Main {

	public static void main(String args[]) {
		int c;
		int columna;
		int fila;
		int matriz[][];
		int numerocambio;
		matriz = new int[4][5];
		c = 1;
		for (fila=0;fila<=3;fila++) {
			for (columna=0;columna<=4;columna++) {
				matriz[fila][columna] = c;
				c = c+1;
			}
		}
		System.out.println("Matriz original");
		for (fila=0;fila<=3;fila++) {
			for (columna=0;columna<=4;columna++) {
				System.out.print(matriz[fila][columna]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		numerocambio = 10;
		for (columna=0;columna<=4;columna++) {
			matriz[1][columna] = numerocambio;
			numerocambio = numerocambio-1;
		}
		numerocambio = 20;
		for (columna=0;columna<=4;columna++) {
			matriz[3][columna] = numerocambio;
			numerocambio = numerocambio-1;
		}
		System.out.println("Matriz cambiada");
		for (fila=0;fila<=3;fila++) {
			for (columna=0;columna<=4;columna++) {
				System.out.print(matriz[fila][columna]+" ");
			}
			System.out.println("");
		}
	}


}

