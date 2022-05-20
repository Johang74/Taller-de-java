public class Main {

	public static void main(String[] args) {
	int j=1;
	int k=0;
	int i=1;
	int n=7;
	
	while(j<=8) {
		while(k<=n) {
			System.out.print(" ");
			k=k+1;
		}
		n=n-1;
		k=0;
		while(i<=j) {
			System.out.print("*");
			i=i+1;
		}
		i=1;
		System.out.println();
		j=j+1;
		
	}
	
				   

	}

}