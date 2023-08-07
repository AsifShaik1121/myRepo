package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(10,15,4,3,7,11,18);
		
		List<Integer> ll =list.stream().sorted((i1,i2)->(i1<i2)?-1:(i1>i2)?1:0).collect(Collectors.toList());
		
		System.out.println(ll);
		
		Long l2 =list.stream().filter(e->e%2==0).count();
		
		System.out.println(l2);
		
		List<Integer> l3 = list.stream().filter(e->e%2==0).sorted().collect(Collectors.toList());
		
		System.out.println(l3);
		
		List<Integer> l4 = list.stream().map(i->i*2).sorted().collect(Collectors.toList());
		
		System.out.println(l4);

	}

}
