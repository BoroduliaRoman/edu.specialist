package edu.specialist.stuff;

import java.util.ArrayList;
import java.util.Date;

public class Person {
	public String name; //= "Unknown";
//	private int age;
	private int birthYear;
	
	public int getAge() {
		return new Date().getYear() + 1900 - birthYear;
	}
	
	public void setAge(int age) {
		this.birthYear = new Date().getYear() + 1900 - age;
	}
	
	public static int counter = 0;
	
	static {
		counter = 0;
	}
	
	static ArrayList<Person> persons = new ArrayList<>();
	
	public static void showCounter() {
		System.out.printf("Total persons: %d\n", Person.counter);
	}	
	
	/*
	{
		age = name.length();
	}
	*/
	
	private Person() {
		this("Unknown");
	}
	
	private Person(String name) {
		this(name, 18);
//		System.out.println();
	}
	
	public Person(String name, int age) {
		this.name = name;
		setAge(age);
		
//		this.age = age;
//		Person.counter
//		counter++;
//		persons.add(this);
	}
	// GoF
	
	public static Person create(String name, int age) {
		Person p = new Person(name, age);
		persons.add(p);
		return p;
	}
	
	public static void showAll() {
		for(Person p : persons) {
			p.show();
		}
	}
	
	public void show() {
		System.out.printf("%s - %d\n", this.name, getAge());
	}	
}
