package collectionframework;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Integer> evennumber = new HashSet<>();
		evennumber.add(10);
		evennumber.add(20);
		evennumber.add(30);
		System.out.println("evennumber "+evennumber);
		
		HashSet<Integer> number  = new HashSet<>();
		
		// addall
		number.addAll(evennumber);
		number.add(5);
		System.out.println("addall the number "+number);
		
		//removeall
		
		number.removeAll(evennumber);
		System.out.println(number);
		
		
		
	}

}
