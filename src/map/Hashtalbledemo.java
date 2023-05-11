package map;

import java.util.Hashtable;

public class Hashtalbledemo {
	
	/*
	 * Hasmap:1)non-synchornized
	 *        2)multiplethread allowed
	 *        3)not thread safe
	 *        4)is very faster 
	 *        5)(key,value)
	 *        6)null vales are accepted.
	 * HashTable:1)synchronized
	 *           2)one thread allowed at the time 
	 *           3)thread safe
	 *           4)porformation poor.
	 *           5)nulls can't accept.
	 *        
	 */
	
	public static void main(String[] args) {
		
//		Hashtable t  = new Hashtable<>(); // capacity is 11, load factor 0.75
//	    Hashtable t = new Hashtable<>(intial capacity, load-factory)
		
		Hashtable<Integer, String> t = new Hashtable<>();
		t.put(101,"bidyut");
		t.put(102,"jyoti");
		t.put(106,"rashmi");
		t.put(108,"rina");
		t.put(null, "rina"); // null Pointer Excepiton
		t.put(107, "rima"); // null pointer excepiton
		
		
	}

}
