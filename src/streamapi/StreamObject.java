package streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		
		//Stream API - collection process
		// collection / group of object
		//1-blank
		Stream<Object> emptyStream = Stream.empty();
		
//		System.out.println(emptyStream);
		
		String names[] = {"Durga","rashmi","Ankit","Divya"}; 
		//2
		Stream<Object> stream1 = Stream.of(names);
		stream1.forEach(e->{
			System.out.println(e);
		});
		
	 // 3
		Stream<Object> streamBuilder = Stream.builder().build();
		//4
		IntStream stream =  Arrays.stream(new int[] {2,4,65,62,41});
		
	}
	
	

}
