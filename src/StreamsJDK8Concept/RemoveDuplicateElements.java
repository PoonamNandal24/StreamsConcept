package StreamsJDK8Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,22,12,33,10,22,53,42,12,56));
		//1. way
		Set<Integer> noDuplicateElement = new HashSet<Integer>(numbers);
		System.out.println(noDuplicateElement);
		System.out.println("***********");
		
		//2. using Java 8
		numbers.stream().distinct().forEach(ele -> System.out.println(ele));
		
		
	}

}
