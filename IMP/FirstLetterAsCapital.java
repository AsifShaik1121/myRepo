package IMP;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstLetterAsCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "first letter of the word as capital";
		
		String result = CapitalizeFirstLetter(input);
		
		String resultJava8 = CapitalizeusingJava8(input);
		
		System.out.println(result);
		
		System.out.println("using java8 : " +resultJava8);

	}

	private static String CapitalizeusingJava8(String input) {
		// TODO Auto-generated method stub
		
		return Arrays.stream(input.split("\\s+"))
				.map(word->Character.toUpperCase(word.charAt(0)) + word.substring(1))
				.collect(Collectors.joining(" "));
	}

	private static String CapitalizeFirstLetter(String input) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		
		boolean capitalizeNext = true;
		
		for (char ch : input.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                capitalizeNext = true;
                sb.append(ch); // Preserve the spaces between words
            } else {
                sb.append(capitalizeNext ? Character.toUpperCase(ch) : ch);
                capitalizeNext = false;
            }
        }

        return sb.toString();
    }
}
