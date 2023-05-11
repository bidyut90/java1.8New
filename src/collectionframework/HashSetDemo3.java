package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo3 {

	public static void main(String[] args) {
		// Union, Intersection,difference
		HashSet<Integer> set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		HashSet<Integer> set2 = new HashSet<>();
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		//use addall //Union
		set1.addAll(set2);
		
		System.out.println(set1);
		
		//Intersection
		
		set1.retainAll(set2);
		System.out.println("Intersection"+set1);
		
		//difference
		
		set1.removeAll(set2);
		
		System.out.println("difference"+set1);
		
		
		
		

	}

}
