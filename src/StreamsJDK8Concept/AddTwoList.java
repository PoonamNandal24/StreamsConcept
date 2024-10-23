package StreamsJDK8Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class AddTwoList {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(10,2,4,5,7,12,56);
		List<Integer> l2 = Arrays.asList(0,3,57,33,8,9,1,22);
		//Collections.sort(l1);
		//Collections.sort(l2);
		ArrayList<Integer> merge = new ArrayList<Integer>();
		merge.addAll(l1);
        merge.addAll(l2);
		//l1.addAll(l2);
        merge.stream().sorted().forEach(System.out::println);
		System.out.println("List is : "+merge);
		System.out.println("**************");
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		q1.addAll(l1);
		q1.addAll(l2);
		q1.stream().sorted().forEach(ele -> System.out.println(ele));
		//System.out.println(q1);
	}

}
