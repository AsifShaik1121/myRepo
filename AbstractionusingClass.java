package oops;

//Abstract class representing an animal
abstract class Plant {
 // Abstract method for making a sound
 abstract void colour();

 // Non-abstract method (concrete method) shared by all animals
 void smell() {
     System.out.println("Smell of  " + getClass().getSimpleName() + " is aswm  ");
 }
}

//Concrete subclass representing a Dog
class Rose extends Plant {
 @Override
 void colour() {
     System.out.println("rose is red");
 }
}

//Concrete subclass representing a Cat
class Jasmine extends Plant {
 @Override
 void colour() {
     System.out.println("Jasmine is white");
 }
}

public class AbstractionusingClass {
 public static void main(String[] args) {
     Plant rose = new Rose();
     Plant jasmine = new Jasmine();

     rose.colour();
     jasmine.colour();

     rose.smell();
     jasmine.smell();
 }
}

