

import java.io.*;

public class Main {

	public static void main(String args[]) {
		int arreglo[];
		boolean c = false;
		int i;
		int j;
		arreglo = new int[1000];
		for (i=0;i<=999;i++) {
			arreglo[i] = i+1;
		}
		System.out.println("Numeros primos: ");
		for (i=999;i>=2;i--) {
			for (j=1;j<=i-1;j++) {
				if (arreglo[i]%arreglo[j]!=0) {
					c = true;
				} else {
					c = false;
					j = i-1;
				}
			}
			if (c==true) {
				System.out.println(arreglo[i]);
			}
		}
	}


}

