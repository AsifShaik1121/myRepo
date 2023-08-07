package IMP;

import java.util.HashMap;
import java.util.Map;

public class FrequencyofCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "hey this is Asif Shaik";
		
		Map<Character, Integer> frequencyMap = new HashMap<>();
		
		for(char ch: inputString.toCharArray()) {
			
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}

	}

}
