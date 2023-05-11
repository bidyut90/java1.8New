package predicates;

import java.util.function.Predicate;
//Predicate ==> one parameter returns boolean.
//use only if you have conditional check in your program...

public class PredicatesDemo {
	
	public static void main(String[] args) {
		
		//ex:1
		Predicate<Integer> pr= i->(i>10);
		System.out.println(pr.test(20));
		
		//ex:2
		
		Predicate<String> pr1 =  i->(i.length()>4);
		
		System.out.println(pr1.test("hello"));
		
		
		//ex-3 Print array elements whose size is > 4 from array
		String name[] = {"bidyut","pinku","john","rink","mary"};
		for(String n : name) {
			if(pr1.test(n)) {
				System.out.println(n);
			}
		} 
	}

}
