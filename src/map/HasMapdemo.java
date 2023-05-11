package map;

import java.util.HashMap;
import java.util.Map;


/*
 * HashMap:HashMap is the implementation of Map, 
 * but it doesn't maintain any order.
 * 
 * --------
 * LinkedHashMap:LinkedHashMap is the implementation of Map. 
 * It inherits HashMap class. It maintains insertion order.
 * ------------
 * TreeMap: TreeMap is the implementation of Map and SortedMap. 
 * It maintains ascending order.
 * 
 */

public class HasMapdemo {
	
/*
 * 1)Underlaying Ds is HashTable
 * 2)Insortion order is not preserved.
 * 3)Duplicate keys are not allowed.
 * 4)Duplicate values are allowed.
 * 5)null key allowed only once.
 * 6)null value allowed multitimes.
 * 7)searching operation is very first.
 * 
 */
	
	public static void main(String[] args) {
	/*
	 * methods 
	 * -------
	 * 1)m.put(key,value)
	 * 2)m.putAll(map object)
	 * 3)m.get(key)
	 * 4)m.remove(key)
	 * 5)m.containskey(key)-boolean 
	 * 6)m.isEmpty()-boolean
	 * 7)m.size()
	 * 8)m.clear()
	 * 9)m.keyset()-all keys are  retrive -set
	 * 10)m.values()-collection
	 * 
	 * EntryInterface
	 * --------------
	 * 1)getkey()
	 * 2)get value()
	 * 3)e.setvalue()
	 * 
	 * 	
	 */
		
		
		//create HashMap
		HashMap<Integer, String> hasmap2 = new HashMap<>();
		
		//create 
		
//		HashMap hasmap2 = new HashMap<>();
		hasmap2.put(null, "John");
		hasmap2.put(102, "Bidyut");
		hasmap2.put(103, "Ram");
		hasmap2.put(104, "Badal");
		hasmap2.put(105, "Rashmi");
		hasmap2.put(106, "nirja");
		
		System.out.println(hasmap2);
		System.out.println(hasmap2.get(103));
		
		//Entry methods
		//-------------
		for(Map.Entry entry : hasmap2.entrySet()) {
			System.out.println(entry.getKey()+"   "+entry.getKey());
			
		}
		
		
		
	}

}
