package fibnocii;

public class Recursive {

	public static void main(String[] args) {

		int count =10;

		for(int i=0;i<count;i++) {

			System.out.println(printFibnocci(i));
		}

	}

	private static int printFibnocci(int n) {


		if(n<=1) {
			return n;
		}else {
			return printFibnocci(n-1)+printFibnocci(n-2);
		}

	}

}
