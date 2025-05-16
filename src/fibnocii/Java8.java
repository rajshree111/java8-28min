package fibnocii;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Java8 {

	public static void main(String[] args) {
		
		System.out.println("Fibonacci Series up to 10 terms:");
		
		UnaryOperator<int[]> fibGen = fibRef ->new int[]{fibRef[1], fibRef[0] + fibRef[1]};

        Stream.iterate(new int[]{0, 1}, fibGen)
              .limit(10)
              .map(fib -> fib[0])
              .forEach(System.out::println);
    }

}
