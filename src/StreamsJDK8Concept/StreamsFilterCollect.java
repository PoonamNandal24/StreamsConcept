package StreamsJDK8Concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args) {
		List<String> productList = Arrays.asList("MAcBook", "IPhone", "Battery", "Shoes", "Bat");
		System.out.println(productList);
		
		System.out.println("------------");
		
		productList.forEach(System.out :: println);
		System.out.println("--------------");
		
		productList.stream().filter(ele ->! ele.equals("IPhone")).collect(Collectors.toList()).forEach(ele-> System.out.println(ele));
		
		List<String> name = Arrays.asList("ABBAA", "AABBBB", "AABB", "BBBBAA");
		name.stream().filter(ele -> !ele.equals("BB")).collect(Collectors.toList()).forEach(System.out :: println );
		
	}

}
