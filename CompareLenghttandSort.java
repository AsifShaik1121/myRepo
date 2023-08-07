package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CompareLenghttandSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("asif","anil","jaggu","maggu","phalguna");
		
		
		Comparator<String> comp = (s1,s2)->{
			
			int l1 = s1.length();
			int l2 = s2.length();
			if(l1>l2) return 1;
			else if (l1<l2) return -1;
			else return s1.compareTo(s2);
			};
			
	List<String> sortedList = list.stream().sorted(comp).collect(Collectors.toList());
	
	System.out.println(sortedList);
	
	String min = list.stream().min((s1,s2)->s1.compareTo(s2)).get();
		
	System.out.println(min);
	
	String max = list.stream().max((s1,s2)->s1.compareTo(s2)).get();
	
	System.out.println(max);
	
	list.stream().forEach(i->System.out.println(i+"ece"));
	
	

	}

}
