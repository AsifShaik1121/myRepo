package IMP;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,4,5,6,7};
		
		int n = arr.length+1;
		
		int totalSum = n*(n+1)/2;
		
		int arrSum = Arrays.stream(arr).sum();
		
		int missingNumber = totalSum - arrSum ;
		
		System.out.println(missingNumber);

	}

}
