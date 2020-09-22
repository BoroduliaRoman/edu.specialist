package edu.specialist.stuff;

import java.util.ArrayList;

public class Person {
	public String name; //= "Unknown";
	public int age;
	static ArrayList<Person> persons = new ArrayList<Person>();
	
	public static int counter = 0;
	
	static {
		counter = 0;
	}
	
	public static void showCounter() {
		System.out.printf("Total persons: %d\n", Person.counter);
	}	
	
	/*
	{
		age = name.length();
	}
	*/
	
	public Person() {
		this("Unknown");
	}
	
	public Person(String name) {
		this(name, 18);
//		System.out.println();
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
//		Person.counter
//		counter++;
//		persons.add(this);
	}
	
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
		System.out.printf("%s - %d\n", this.name, age);
	}	
}
