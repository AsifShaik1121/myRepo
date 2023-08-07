package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortingbyKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] students = {"asif","kumar","Phalguna","jaggu","firoz"};
		Integer[] strength = {20,80,70,90,60};
		
		
		Map<Integer,String> hashMap = new HashMap<>();
		
		for(int i=0;i<students.length;i++) {
			
			hashMap.put(strength[i], students[i]);
		}
		
		Set<Entry<Integer, String>> set = hashMap.entrySet();
		Iterator<Entry<Integer, String>> iter=set.iterator();
		while(iter.hasNext()) {
			
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>)iter.next();
			
			System.out.println("key : " + entry.getKey()+ "  Value : " + entry.getValue());
		}
		
		//sorting the hash map by keys using TreeMap
		
		System.out.println("After sorting using TreeMap");
		
		Map<Integer,String> map= new TreeMap<>(hashMap);
		
		Set<Entry<Integer, String>> s1 = map.entrySet();
		
		iter = s1.iterator();
		
		while(iter.hasNext()){
			
			Map.Entry<Integer, String> entry= iter.next();
			
			System.out.println("key : " + entry.getKey()+ "  Value : " + entry.getValue());
		}
		
		
		
	}

}
