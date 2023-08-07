package IMP;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Asif Ahamad Shaik";
		
		String removeWord = "Ahamad";
		
		String result = Arrays.stream(input.split("\\s+"))
				.filter(word->!word.equalsIgnoreCase(removeWord))
				.collect(Collectors.joining(" "));
		
		System.out.println(result);
	}

}
