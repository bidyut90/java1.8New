package streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Method {
	public static void main(String[] args) {
		
		List<Integer> numberlist = List.of(30,40,1,2,3,45,60);
		
		List<String> nameList = List.of("bidyut","bashmi","jyoti","khirabdi");
		//filter(Predicate)
		    //boolean value function
		    // e->e>10
//	          List<Integer> tengraterthen = (List<Integer>) namelist.stream().filter(e->e=>10).collect(Collectors.toList());
		List<String> newnamelist = nameList.stream().filter(e->e.startsWith("b")).collect(Collectors.toList());
		System.out.println(newnamelist);
		newnamelist.stream().forEach(e->{
			System.out.println(e);
		});
		newnamelist.stream().forEach(System.out::println);
		
		
		
		// map(function)
		/*
		 * each element operation
		 * 
		 */
		nameList.stream().map(x->x.toLowerCase()).forEach(e->{
			System.out.println(e);
		});
	
		
		
		
		
		//foreach
        // number one method		
		
		//number two method
		
		nameList.stream().forEach(System.out::println);
		
		
		//sorted
		List<Integer> sort = (List<Integer>) numberlist.stream().sorted().collect(Collectors.toList());
		System.out.println(numberlist);
		
		System.out.println("sort"+sort);
		
		
		//min
	          Integer integer =  numberlist.stream().max((x,y)->x.compareTo(y)).get();
	          System.out.println(integer);
	         
		
		//max
		Integer int2 = numberlist.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(int2);
		
	}

}
