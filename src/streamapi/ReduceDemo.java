package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceDemo {
public static void main(String[] args) {
	List<String> list1 = Arrays.asList("ABC","ABC","ABD","ACC","ADF","4","6","9");
	
	//reduce
	String reduce = list1.stream().reduce((value,compera)->compera+value).get();
	System.out.println(reduce);
	
	Optional<String> reduce1 = list1.stream().reduce((value, comper)-> {
		
		return comper+value;
		
	});
	System.out.println(reduce1.get());
	
	//Limit
	
List<String> limit = 	list1.stream().filter(e->e.startsWith("A")).limit(4).distinct().collect(Collectors.toList());
	limit.stream().forEach(System.out::println);
	
}



        
}
