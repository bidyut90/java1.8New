package streamapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListName  {
	public static void main(String[] args) {
		List<Integer> listname = new ArrayList<>();
		listname.add(10);
		listname.add(12);
//		System.out.println(listname);
//		listname.forEach((e)->System.err.println(e));	
		
		Iterator<Integer> it = listname.iterator();
		
		System.out.println(it);
//		System.out.println(it);
//		while (it.hasNext()) {
//	         System.out.println(it.next());
//	      }
		System.out.println(10/0);
		
	}

	

}
