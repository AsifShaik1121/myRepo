package functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Reference{
	
	public int even(int n);

	
}

public class MethodReferenceExample {
	
	public static boolean isEven(int n) {
		
		return n%2==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		List<Integer> list = Arrays.asList(1,2,4,8,11,14,17);
		
		System.out.println("using lamdha");
		// using lamdha expressions
		
		list.stream()
		.filter(e->isEven(e))
		.forEach(n->System.out.println(n));
		
		
		System.out.println("using Method Reference");
		//using method Reference
		
		list.stream()
		.filter(MethodReferenceExample::isEven)
		.forEach(n->System.out.println(n));
		
		
		

	}

}
