package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmapdemo {
	
	public static void main(String[] args) {
		//map
		
		List<Integer> list1 = Arrays.asList(1,2,10,45,60);
		List<Integer> addlist = list1.stream().map(n->n+10).collect(Collectors.toList());
		System.out.println();
		
		//flatMap
		List<Integer> list2 = Arrays.asList(1,2);
		List<Integer> list3 = Arrays.asList(6,8);
		List<Integer> list4 = Arrays.asList(0,3);
		List<List<Integer>> finallist = Arrays.asList(list2,list3,list4);
		
		System.out.println(finallist);
		
		List<Integer> finalist2 =finallist.stream().flatMap(x->x.stream().map(n->n+20)).collect(Collectors.toList());
		   System.out.println(finalist2);
	}

}
