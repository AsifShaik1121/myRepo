package Set;

import java.util.HashSet;
import java.util.Iterator;

public class IterateaSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs= new HashSet<>();
		
		hs.add("lime");
		hs.add("mint");
		hs.add("salt");
		hs.add("soda");
		
		//method 1
		Iterator<String> ir= hs.iterator();
		
		while(ir.hasNext()) {
			
			System.out.println(ir.next());
		}
		
		//method 2 using for each
		for(String str:hs) {
			
			System.out.println(str);
		}
		//check if value exists
		if(hs.contains("salt")) {
			
			System.out.println(true);
		}else {
			
			System.out.println(false);
		}

	}

}
