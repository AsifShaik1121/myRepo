import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
	
	int rollno;
	String name,address;
	public Student(int rollno, String name, String address) {
	
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
}
	
	
	class Sortbyrollno implements Comparator<Student>{

		@Override
		public int compare(Student a, Student b) {
			// TODO Auto-generated method stub
			return a.rollno-b.rollno;
		}
		
		
	}
	
	class SortbyName implements Comparator<Student>{

		@Override
		public int compare(Student a1, Student b1) {
			// TODO Auto-generated method stub
			return a1.name.compareTo(b1.name);
		}
		
		
	}
	



public class SortingArrayListUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> arr=new ArrayList<>();
		
		arr.add(new Student(112,"Mukesh","mpl"));
		arr.add(new Student(221,"Asif","val"));
		arr.add(new Student(003,"salem","ctr"));
		arr.add(new Student(312,"ramesh","plr"));
		arr.add(new Student(133,"suresh","tpt"));
		arr.add(new Student(121,"rakesh","bnglr"));
		arr.add(new Student(001,"phalguna","mys"));
		
		
		
		
		Iterator<Student> itr= arr.iterator();
		
		System.out.println("array list before sorting");
		
		while(itr.hasNext()) {
			
			
			
			System.out.println(itr.next());
		}
		
		
		System.out.println("array list After sorting name");
		
		
		Collections.sort(arr, new SortbyName());
		
		for(Student std:arr) {
			
			System.out.println(std);
		}
		
		System.out.println("array list After sorting rollno");
		
		Collections.sort(arr, new Sortbyrollno());
		
		Iterator<Student> is=arr.iterator();
		
		while(is.hasNext()){
			
			
			
			System.out.println(is.next());
			
		}

	}

}
