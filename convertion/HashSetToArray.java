package convertion;

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> hset = new HashSet<>();
		
		hset.add("a");
		hset.add("d");
		hset.add("m");
		hset.add("e");
		hset.add("b");
		
		System.out.println(hset);
		
		//method 1

		
		String[] arr = new String[hset.size()];
		
				
		hset.toArray(arr);
		
		for(String str:arr)
		
		System.out.println(str);
		
		
		//method 2
		
		String[] arr1 = new String[hset.size()];
		
		int index=0;
		
		for(String ss: hset) {
			
			arr1[index++] = ss;
		}
		
		
		for(String entry: arr1)
			System.out.println(entry);
		

	}

}
