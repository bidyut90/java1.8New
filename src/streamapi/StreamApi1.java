package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// These steam are related to collection Frameworks/(Group of objects.) These streams are very different from io stream, io streams are the sequence of data.
// These streams was introduced in java 1.8 version.
// Stream Api is basically perform bulk operations and process the objects of collection 
// Stream Api  reduced the code length.
public class StreamApi1 {
	public static void main(String[] args) {
		// Create a list and filter all even number from list
		
		// create list
		List<Integer> list1 = List.of(2,4,50,21,30);
		
		
		System.out.println(list1); 
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(3);
		
		List<Integer> list3 = Arrays.asList(23,45,56,86,69,80); 
//		list3.add(70);
//		System.out.println("list3 "+list3);
//		List<Integer> evenlist = new ArrayList<>();
//		
//		for(Integer i : list1) {
//			if(i%2==0) {
//				evenlist.add(i);
//			}
//		}
//		
//          System.out.println(evenlist);
//          
          // using stream 
          
          List<Integer> evenlist = list3.stream().filter(i->i%2==0).collect(Collectors.toList());
          System.out.println("evenlist on number" +evenlist);
          
           	 
	}
	
}
