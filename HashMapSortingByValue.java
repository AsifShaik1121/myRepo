package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSortingByValue {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(30, "John");
        hashMap.put(20 ,"Alex");
        hashMap.put(40, "Emily");
        hashMap.put(25 ,"Michael");
        
        Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		
		for(Entry<Integer, String> entry: entrySet) {
			
			System.out.println("Key :" + entry.getKey() +" Value :"+entry.getValue());
		}

        // Step 1: Create a List of Map.Entry objects
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(hashMap.entrySet());

        // Step 2: Sort the list by values using a custom Comparator
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>() {
            public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer, String> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        // Step 3: Create a new LinkedHashMap to store the sorted entries
        LinkedHashMap<Integer, String> sortedHashMap = new LinkedHashMap<>();

        // Step 4: Put the sorted entries into the LinkedHashMap
        for (Map.Entry<Integer, String> entry : entryList) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted HashMap
        for (Map.Entry<Integer, String> entry : sortedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
