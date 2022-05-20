import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.println("Digite el numero ");
		num=teclado.nextInt();
		
		for(int i = 1; i <= 10; i = i + 1) {
			
			System.out.println(i+" x "+num+" = "+ i*num );
		}
	
	}
}