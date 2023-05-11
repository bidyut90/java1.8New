package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		//converted array to arraylist
		
		String arr[] = {"Dog","Cat","Cow","Tiger"};
		
		//how to print using for each
		for(String animal: arr) {
			System.out.println(animal);
		}
		// how to add array in array list
		ArrayList<String> animallist = new ArrayList<>(Arrays.asList(arr));
		System.out.println(animallist);
		//other method array add array in list
		
		ArrayList<String> animallist2 = new ArrayList<>(List.of(arr));
		animallist2.add(0,"pinku");
		System.out.println(animallist2);
		

	}

}
