package functionalProgramming;

import java.util.List;

public class PrintList {
	
	public static void printElementsFromList(List<Integer> numbers) {
		
		numbers.stream().forEach( x-> System.out.println(x));
		
	}
	
	
	public static void main(String[] args) {
		
		printElementsFromList(List.of(12,13,12,17,8,9));
	}

}
