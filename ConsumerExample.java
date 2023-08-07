package functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("temp","tim","scott","steve");
		
		Consumer<String> names = name -> System.out.println("Hello " + name);
		
		list.forEach(names);
		
		List<Integer> ll = Arrays.asList(12,13,15,11,13);
		
		Consumer<Integer> temp = value -> System.out.println(value+2);
		
		ll.forEach(temp);
		
		

	}

}
