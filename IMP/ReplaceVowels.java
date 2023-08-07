package IMP;

public class ReplaceVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Asif Shaik";
		
		String result = ReplaceVowel(input);
		
		System.out.println(result);

	}

	private static String ReplaceVowel(String input) {
		// TODO Auto-generated method stub
		return input.replaceAll("[aeiouAEIOU]", "\\$");
	}

}
