package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

// Duplicates
// Insertation in order 
//HashCode
//heterogeneous
//Null
/*
 * how to create HashSet object
 * ex: HashSet hashset = new HashSet(location,loadfactor);
 *     HashSet hashet = new HashSet(100,80);
 *     
 *     location of memory is  defult 16bit in hashset.
 *     loadfactor is bydefult 75% in hashset.
 *     we also customized location and loadfactor.
 */
public class HashSetDemo {

	public static void main(String[] args) {
		
		// method of HashSet
		
        /*
         * add(value)
         * addall(obj)
         * remove(value)
         * removeall(value)
         * contain(obj)
         * isEmpty(obj)
         * collection.sort()
         * collection.suffel()
         * 
         */
		//default capacity 16 and loadfactor is 0.75
		HashSet hasset = new HashSet<>();
		//capactiy 100 and default loadfactor is 0.75;
		HashSet<Integer> hasset1 = new HashSet<>(100);
		//capacity 100 and loadfactor is 0.80
		HashSet<String> hasset2 = new HashSet<>(100,(float)0.80);
		
		
		//add objects/elements into HashSet
		
		hasset.add("wellcome to java");
		hasset.add(100);
		hasset.add(0.50);
		hasset.add(null);
		hasset.add(false);
		
		
		System.out.println(hasset);
		
		//size
		System.out.println(hasset.size());
		
		//remove
		hasset.remove(100);
		System.out.println("after remove of the object"+hasset);
		//contains
		hasset.contains(null);
		System.out.println("use the conains"+hasset);
		
		System.out.println("use isempty"+hasset.isEmpty());
		
		//use Iterator
		Iterator it = hasset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		

	}

}
