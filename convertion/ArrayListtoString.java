package convertion;

import java.util.ArrayList;

public class ArrayListtoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> ar=new ArrayList<>();
		
		ar.add("Asif");
		ar.add("pandu");
		ar.add("firoz");
		ar.add("jaggu");
		
		System.out.println(ar);
		
		String[] str= new String[ar.size()];
		
		for(int i=0;i<ar.size();i++) {
			
			str[i] = ar.get(i);
			
		}
		
		for(String s: str) {
			
			System.out.println(s);
		}

	}

}
