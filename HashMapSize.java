package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSize {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hmap= new HashMap<>();
		
		
		hmap.put(11, "Asif");
		hmap.put(21, "guru");
		hmap.put(15, "firoz");
		hmap.put(41, "laddu");
		hmap.put(28, "jaggu");
		
		//map size
		System.out.println(hmap.size());
		
		//check if map is empty method 1
		System.out.println(hmap.isEmpty());
		
		//check if map is empty method 2
		System.out.println(hmap.size()==0);
		
		
		//iterating hash map using for each loop and keySet()
		
		System.out.println("iterating hash map using for each loop");
		
		for(Integer key: hmap.keySet()) {
			
			System.out.println("Key :" + key +" Value :"+hmap.get(key));
		}
		
		//Iterating using Iterator and keySet()
		
		System.out.println("Iterating using Iterator and keySet()");
		
		Set<Integer> keySet = hmap.keySet();
		
		Iterator<Integer> keysetIterator=keySet.iterator();
		
		while(keysetIterator.hasNext()) {
			
			Integer key=keysetIterator.next();
			
			System.out.println("Key :" + key +" Value :"+hmap.get(key));
		}
		
		//Iterating using for each and entrySet() method
		
		System.out.println("Iterating using for each and entrySet() method");
		
		Set<Map.Entry<Integer, String>> entrySet = hmap.entrySet();
		
		for(Map.Entry<Integer,String> entry: entrySet) {
			
			System.out.println("Key :" + entry.getKey() +" Value :"+entry.getValue());
		}
		
		//Iterating using Iterator and entrySet() Method
		
		System.out.println("Iterating using Iterator and entrySet() Method");
		
		Set<Map.Entry<Integer, String>> eSet= hmap.entrySet();
		
		Iterator<Map.Entry<Integer, String>> entry= eSet.iterator();
		
		while(entry.hasNext()) {
			
			Map.Entry<Integer, String>  e = entry.next();
			
			System.out.println("Key :" + e.getKey() +" Value :"+e.getValue());
			
		}
	}
	
	
	
	

}
