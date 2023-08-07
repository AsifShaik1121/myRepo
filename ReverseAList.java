package convertion;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> str=new ArrayList<String>();
		
		str.add("asif");
		str.add("jaggu");
		str.add("phalguna");
		str.add("firoz");
		str.add("laddu");
		
		System.out.println(str);
		
		Collections.reverse(str);
		
		System.out.println(str);

	}

}
