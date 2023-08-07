package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

class Student {

	// Attributes of student
	String Name;
	int Age;

	// Parameterized constructor
	public Student(Integer Age, String Name) {

		// This keyword refers to current instance itself
		this.Name = Name;
		this.Age = Age;
	}

	// Getter setter methods
	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer Age) {
		this.Age = Age;
	}

	// Method
	// Overriding toString() method
	@Override
	public String toString() {
		return "Customer{" + "Name=" + Name + ", Age=" + Age + '}';
	}
}

class Comparemultiplevarabiles implements Comparator<Student> {

	@Override
	public int compare(Student c1, Student c2) {
		// TODO Auto-generated method stub

		int nameCompare = c1.getName().compareTo(c2.getName());
		

		int ageCompare = c1.getAge().compareTo(c2.getAge());

		return (nameCompare == 0) ? ageCompare : nameCompare;
		
		//return ageCompare;
	}

}

public class SortingMultipleVaribleUsingComparator {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		Student c1 = new Student(30, "Mukesh");
		Student c2 = new Student(24, "Asif");
		Student c3 = new Student(31, "Phalguna");
		Student c4 = new Student(26, "Firoz");
		Student c5 = new Student(54, "Jaggu");
		Student c6 = new Student(45, "Kumar");

		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		list.add(c6);

		System.out.println("list before sorting");

		for (Student ss : list) {

			System.out.println(ss);
		}

		Collections.sort(list, new Comparemultiplevarabiles());

		System.out.println("list after sorting");

		java.util.Iterator<Student> t = list.iterator();

		while (t.hasNext()) {

			System.out.println(t.next());

		}
}
}








