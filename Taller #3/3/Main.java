public class Main {

	public static void ZGF() {
		int j=1;
		int k=0;
		int i=1;
		int n=9;
		int lar=1;
	while(lar<=22) {
		while(j<=11) {
			while(k<=n) {
				System.out.print(" ");
				k=k+1;
			}
			n=n-1;
			k=0;
			while(i<=lar) {
				System.out.print("*");
				i=i+1;
			}
			i=1;
			System.out.println();
			j=j+1;
			lar=lar+2;
		}
		}
	i=1;
	lar=1;
while (lar<=2) {
		while(k<=8) {
			System.out.print(" ");
			k=k+1;
		}
		k=0;
		while(i<=3) {
			System.out.print("*");
			i=i+1;
		}
		i=1;
		System.out.println();
		lar=lar+1;
	}
lar=1;
i=1;
int t=7;
while (lar<=2) {
	while(k<=t) {
		System.out.print(" ");
		k=k+1;
	}
	k=0;
	while(i<=5) {
		System.out.print("*");
		i=i+1;
	}
	i=-1;
	t=t-1;
	System.out.println();
	lar=lar+1;
}
}
	
public static void main(String[] args) {
		ZGF();

	}

}