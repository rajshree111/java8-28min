package fibnocii;

import java.util.stream.Stream;

public class Java8 {

	public static void main(String[] args) {
		
		System.out.println("Fibonacci Series up to 10 terms:");

        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
              .limit(10)
              .map(fib -> fib[0])
              .forEach(n -> System.out.print(n + " "));
    }

}
