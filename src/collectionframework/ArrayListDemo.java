package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//In a arraylist class many method are there 
/*
 * add(obj)
 * add(index,obj)
 * size()
 * remove(index)
 * get(index)
 * set(index,obj)
 * contains(obj)-true,false
 * isEmpty 
 * addAll()
 * removeAll()
 * 
 * sort used the ArrayList the method is Collerction.sort(objectofarraylist)
 * reverse order = collection.sort(objectofarrylist,collection.reverseOrder() )
 * 
 * collection.suffle(objectofarraylist);
 * 
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//declare arrayList
       //ArrayList al = new ArrayList();
		
       @SuppressWarnings("rawtypes")
	List al = new ArrayList();
       //  Declare Integer ArrayList. we can't add the String and boolean  value.
	    List<Integer> alInt = new ArrayList<>();
	    //  Declare String ArrayList. we can't add the Integer  and boolean  value.
		List<String> als = new ArrayList<>();
		 
		al.add("wellcom java");
		al.add(10);
		al.add(true);
		al.add(10.50);
		al.add(100000);
		System.out.println(al);
		al.remove(1);
		System.out.println("after remove"+al);
		al.add(0,"wellcom to python");
		System.out.println("after add used the index value"+al);
		al.set(2, false);
		System.out.println("after used the set index value"+al);
		
		//use the contains method
	    System.out.println(al.contains(false));
		 // use the sort
	    Collections.sort(al);
	    
	    System.out.println("after the sorting "+al);
	    
	    // use the reverse order 
	    Collections.sort(al,Collections.reverseOrder());
	    
	    System.out.println(al);
	    
	    //use the suffel
	    
	    Collections.shuffle(al);
	    
	    System.out.println("after using suffel"+al);
	    
	    
	   
//		---------------------------------------------------------------
		al.forEach(list->{
			System.out.println(list);
		});
		
		
		

	}

}
