package functionalProgramming;

import java.util.List;

public class Reduce {
	
	
	public static int sum(int a, int b) {
		
		return a+b;
	}


	private static int addNumbersFromList(List<Integer> numbers) {
		
		//return numbers.stream().reduce(0, (x,y)-> x+y);
		
		//return numbers.stream().reduce(0, Reduce::sum);

		return numbers.stream().reduce(0,Integer::sum);


	}

	public static void main(String[] args) {

		int n=addNumbersFromList(List.of(12,13,45,66,98));
		System.out.println(n);
	}
}
