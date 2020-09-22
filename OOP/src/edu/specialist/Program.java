package edu.specialist;

import edu.specialist.stuff.Person;

public class Program {

	public static void main(String[] args) {
		
		Person.showCounter();
		
//		System.out.printf("Total persons: %d\n", Person.counter);
		
		Person p1 = Person.create("Roman", 29);
				//new Person("Roman", 29);
//		p1.name = "Roman";
//		p1.age = 29;
		
		Person p2 = new Person("Marishka");
//		p2.name = "Marishka";
//		p2.age = 29;
		
		Person px = new Person();
		
//		p1.show(); // this == p1
//		p2.show(); // this == p2
//		px.show();
		
//		System.out.printf("Total persons: %d\n", Person.counter);
		
		Person.showCounter();
		Person.showAll();
	}
}