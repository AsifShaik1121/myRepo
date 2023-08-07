import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Test {

	public static void main(String[] args) {
		
		
		String word = "Asif Shaik";
		
		String[] ss = word.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(String words:ss) {
			
		String	reversedWord = reverseWord(words);
		
		  sb.append(reversedWord).append(" ");
		}
		
		System.out.println(sb.toString().trim());
		
	}

	private static String reverseWord(String words) {
		// TODO Auto-generated method stub
		
		StringBuilder reversedword = new StringBuilder();
		
		for(int i = words.length()-1;i>=0;i--) {
			
			reversedword.append(words.charAt(i));
		}
		
		return reversedword.toString();
	}		

}