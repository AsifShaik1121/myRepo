package oops;

//Superclass (Base class)
class Animal {
 String name;
 
 void eat() {
     System.out.println(name + " is eating.");
 }
}

//Subclass (Derived class)
class Dog extends Animal {
 void bark() {
     System.out.println(name + " is barking.");
 }
}

public class Inheritance {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.name = "Buddy";
     dog.eat(); // Output: Buddy is eating.
     dog.bark(); // Output: Buddy is barking.
 }
}

