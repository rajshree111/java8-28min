package functionalProgramming;

import java.util.Comparator;
import java.util.List;

public class UsingCompare {
	
	public static void main(String[] args) {

		printReverseInOrder(List.of("java","ava","javascript","python"));
		
	}

	private static void printReverseInOrder(List<String> subjects) {
		
		subjects.stream().sorted(Comparator.comparing(x->x.length())).forEach(System.out::println);;
	}

}
