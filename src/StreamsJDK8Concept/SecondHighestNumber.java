package StreamsJDK8Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] numbers = {10,-1,24,22,14,56,100,212,33};
		
		//1. using streams java8
		Integer secondHighestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder())
										.skip(1).findFirst().get();
	System.out.println(secondHighestNumber);
	
	//using collections .sort
	
	List<Integer> num = new ArrayList<Integer>();
	num.add(10);
	num.add(24);
	num.add(1000);
	num.add(4);
	num.add(0);
	num.add(214);
	Collections.sort(num);
	int size = num.size();
	int highestNumber = num.get(size -2);
	System.out.println(highestNumber);
		
	}

}
