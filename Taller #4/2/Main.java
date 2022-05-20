

import java.io.*;
import java.util.Random;

public class Main {

	public static void main(String args[]) {
		
		int arreglo[];
		int i;
		arreglo = new int[20];
		for (i=0;i<=19;i++) {
			arreglo[i] =   (int) (Math.random() * 100) + 1;;  
		}
		System.out.print("Numeros pares =");
		for (i=0;i<=19;i++) {
			if (arreglo[i]%2==0) {
				System.out.print(arreglo[i]+", ");
			}
		}
		System.out.println("");
		System.out.print("Numeros impares =");
		for (i=0;i<=19;i++) {
			if (arreglo[i]%2!=0) {
				System.out.print(arreglo[i]+", ");
			}
		}
	}


}

