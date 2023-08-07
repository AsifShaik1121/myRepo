package convertion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListtoArrayList {

	public static void main(String[] args) {
		
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("apple");
		list.add("cat");
		list.add("new");
		list.add("life");
		
		System.out.println(list);
		
		List<String> ll = new ArrayList<>(list);
		
		System.out.println(ll);
		
		

	}

}
