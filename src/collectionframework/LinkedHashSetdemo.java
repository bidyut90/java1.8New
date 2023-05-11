package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;

//LinkedHashSet not allowed to the duplicate value.
//LinkedHashSet allowed to the insertion order. 
// HashSet is not allowed to the insertion order.
// Hashtable +LinkeList there in LinkedHashSet

//  as well as  HashSet  like location, loadfactor 

public class LinkedHashSetdemo {
public static void main(String[] args) {
	
//	HashSet<Integer> set = new HashSet<>();
	LinkedHashSet<Integer> set = new LinkedHashSet<>();
	LinkedHashSet set2 = new LinkedHashSet<>();
	set.add(100);
	set.add(200);
	set.add(300);
	set.add(500);
	set.add(600);
	 
	System.out.println("LinkedHashset"+set);
	
	
}
}
