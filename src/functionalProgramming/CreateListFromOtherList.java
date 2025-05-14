package functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class CreateListFromOtherList {
	
	public static void main(String[] args) {

		List<String> list=craeteListWithLengthMoreThan3(List.of("java","ava","javascript","python"));
		
		System.out.println(list);
		
	}

	private static List<String> craeteListWithLengthMoreThan3(List<String> subjects) {
		
		return subjects.stream().filter(x-> x.length()>3 ).collect(Collectors.toList());
	}


}
