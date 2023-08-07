package oops;

interface Saplings{
	
	 public void colour();

	 // Non-abstract method (concrete method) shared by all animals
	 default void smell() {
	     System.out.println("Smell of  " + getClass().getSimpleName() + " is aswm  ");
	 }
}

class Roses implements Saplings {
	 @Override
	public void colour() {
	     System.out.println("rose is red");
	 }
	}

	//Concrete subclass representing a Cat
	class Jasmines implements Saplings {
	 @Override
	 public void colour() {
	     System.out.println("Jasmine is white");
	 }
	}
public class AbstractionusingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Saplings rose = new Roses();
		Saplings jasmine = new Jasmines();
		
		
		rose.colour();
		rose.smell();
		
		jasmine.colour();
		jasmine.smell();

	}

}
