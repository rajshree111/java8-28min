package fibnocii;

public class Normal {

	public static void main(String[] args) {
		
		printFibnocci(10);

	}

	private static void printFibnocci(int n) {
		
		int a=0;
		int b=1;
		
		int next;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1; i<=n-2;i++) {
			
			next =a+b;
			
			System.out.println(next);
			
			a=b;
			b=next;
		}
		
	}

}
