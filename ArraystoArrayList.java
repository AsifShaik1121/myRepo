package convertion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArraystoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] ar = {"Asif","Afrid","nasif","asif"};
		
		for(String s: ar) {
			
			System.out.println(s);
		}
		
		HashSet<String> str= new HashSet<>();
		
		Collections.addAll(str, ar);
		
		System.out.println(str);

	}

}
