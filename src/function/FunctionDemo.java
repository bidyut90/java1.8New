package function;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		
		//integer and integer 
		Function<Integer, Integer> f = n->n*n;
		System.out.println(f.apply(50));
		
		// String length
		
		Function<String, Integer> f1 = n->n.length();
		
		System.out.println(f1.apply("my name is bidyut"));
	}

}
