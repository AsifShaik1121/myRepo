import java.util.ArrayList;
import java.util.Collections;


public class ArrayListSortingDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//sorting using 
		
		ArrayList<String> alist = new ArrayList<>();
		
		alist.add("asif");
		alist.add("phalguna");
		alist.add("firoz");
		alist.add("jaggu");
		alist.add("laddu");
		alist.add("afrid");
		
		System.out.println("before sorting");
		
		for(String str:alist) {
			
			System.out.println(str);
		}
		
		Collections.sort(alist, Collections.reverseOrder());
		
		// another method is to use below 2 methods to first sort and the reverse the list
		
//		Collections.sort(list);
//		Collections.reverse(list);
		
		System.out.println("After Sorting");
		
		for(String s:alist) {
			
			System.out.println(s);
		}
		
		

	}

}
