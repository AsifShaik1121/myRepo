package functions;

@FunctionalInterface
interface MathOperation{
	
	int operate(int a, int b);
}

@FunctionalInterface
interface CreatePerson{
	
	Person create(String name);
}

class Person{
private String name;

public Person(String name) {
	
	this.name = name;
}


public String getName() {
	
	return name;
}
}

public class MethodReferences {


	public static int add(int a,int b) {
		
		return a+b;
	}
	
	public int subtract(int a,int b) {
		
		return a-b;
	}
		

	public static void main(String[] args) {
		
		 // Reference to a static method
		MathOperation addition=MethodReferences::add;
		
		System.out.println("addition operation  "+ addition.operate(10, 20));
		
		// Reference to an instance method of a particular object
		MethodReferences instance = new MethodReferences();
		
		MathOperation sub = instance::subtract;
		
		System.out.println("Subtraction operation  "+ sub.operate(30, 15));
		
		//Constractor Reference
		
		CreatePerson opp = Person::new; 
		
		Person person = opp.create("asif");
		
		System.out.println("Created Person  " + person.getName());
		
		
		
		
		
		
		 

	}
	
}
