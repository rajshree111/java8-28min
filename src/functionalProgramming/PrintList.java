package functionalProgramming;

import java.util.List;

public class PrintList {
	
	public static void printElementsFromList(List<Integer> numbers) {
		
		//numbers.stream().forEach( x-> System.out.println(x));
		numbers.stream().forEach(System.out::println);	
	}
	
public static void printEvenElementsFromList(List<Integer> numbers) {
		
		//numbers.stream().forEach( x-> System.out.println(x));
		numbers.stream().filter(x->x%2==0).forEach(System.out::println);	
	}
	
	
	public static void main(String[] args) {
		
		//printElementsFromList(List.of(12,13,12,17,8,9));
		printEvenElementsFromList(List.of(12,13,12,17,8,9));
	}

}
