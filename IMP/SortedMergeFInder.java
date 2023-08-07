package IMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedMergeFInder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1 = Arrays.asList(1,3,5,7,9);
		
		List<Integer> l2 = Arrays.asList(2,4,6,8);
		
		List<Integer> mergedList = mergeTwoLists(l1,l2);
		
		System.out.println(mergedList);

	}

	private static List<Integer> mergeTwoLists(List<Integer> l1, List<Integer> l2) {
		// TODO Auto-generated method stub
		List<Integer> mergedList = new ArrayList<>();
		int i=0,j=0;
		
		while(i<l1.size()&&j<l2.size()){
			
			if(l1.get(i)<l2.get(j)){
				
				mergedList.add(l1.get(i));
				i++;
			}else {
				
				mergedList.add(l2.get(j));
				j++;
			}
		}
			
			mergedList.addAll(l1.subList(i, l1.size()));
			mergedList.addAll(l2.subList(j, l2.size()));
			
		return mergedList;
	}

}
