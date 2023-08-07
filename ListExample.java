import java.util.ArrayList;
import java.util.LinkedList;


public class ListExample {
	
	public static void main(String[] args) {
		
		
		ListExample list=new ListExample();
		
		list.arrayList();
		list.linkedList();
	
	
	
	
	}
	
	public void arrayList() {
		
		ArrayList<String> str=new ArrayList<String>();
		
		str.add("asif");
		str.add("jaggu");
		str.add("phalguna");
		str.add("firoz");
		str.add("laddu");
		
		str.set(1, "kumar");
		str.set(2 , "firoz");
		
		System.out.println(str.indexOf("firoz"));
		System.out.println(str.lastIndexOf("firoz"));
		
		str.remove(3);
		
		str.get(1);
		
		boolean b = str.contains("asif");
		System.out.println(b);
		
		
		System.out.println(str);
		
		for(String s: str) {
			
			System.out.print(s+ " ");
		}
		
		
	}
	
public void linkedList() {
		
		LinkedList<String> str=new LinkedList<String>();
		
		str.add("asif");
		str.add("jaggu");
		str.add("phalguna");
		str.add("firoz");
		str.add("laddu");
		
		
		System.out.println(str);
		
		for(String s: str) {
			
			System.out.println(s+ " ");
		}
		
		 // check if ArrayList contains element
        if (str.contains("asif")) {
            System.out.println(" asif was found in the list");
        } else {
            System.out.println("asif  was not found in the list");
        }
		
		
	}
}
