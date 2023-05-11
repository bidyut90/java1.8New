package predicates;

import java.util.function.Predicate;

public class PredicatesDemo3 {
	
	public static void main(String[] args) {
		int a[] = {
				5,6,10,15,20,25,22,21
				
		};
		
		
		Predicate<Integer>  pr1 = i->i%2==0;
		Predicate<Integer>  pr2 = i->i>=50;
		
		for(int evennumber:a) {
			
			if(pr1.test(evennumber)&&pr2.test(evennumber)) {
				System.out.println(evennumber);
			}
		}
		
	}

}
