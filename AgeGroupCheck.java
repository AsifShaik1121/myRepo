package enums;

import java.util.Scanner;

public class AgeGroupCheck {
	
	enum AgeGroup{
		
		child(0,12),
		teen(13,19),
		adult(20,59),
		Senior(60,Integer.MAX_VALUE);
		
		private final int minage;
		private final int maxage;
		

		AgeGroup(int minage, int maxage) {
			
			this.minage = minage;
			this.maxage=maxage;
		}
		
		public boolean inRange(int age) {
			
			return age>=minage&&age<=maxage ;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the person's age: ");
	 
		int age = sc.nextInt();
		
		AgeGroup ageGroup = getAgeGroup(age);
		
		System.out.println("The person belongs to the age group: " + ageGroup);

	}

	private static AgeGroup getAgeGroup(int age) {
		for(AgeGroup group:AgeGroup.values()) {
			
			if(group.inRange(age)) {
				
				return group;
			}
		}
		
		 throw new IllegalArgumentException("Invalid age: " + age);
	}

}
