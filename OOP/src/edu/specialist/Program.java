package edu.specialist;

import edu.specialist.stuff.Person;
import edu.specialist.graph.*;

public class Program {

	public static void main(String[] args) {
		{
			Person.showCounter();

//		System.out.printf("Total persons: %d\n", Person.counter);

			Person p1 = Person.create("Roman", 29);
			// new Person("Roman", 29);
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

		{
			Point p1 = new Point(10, 20, "green");
			Point p2 = p1.clone();
			p1.color = "red";
			
			Circle c1 = new Circle(100, 200, 50, "pink");
			c1.scale(1.5);
			
			Shape.drawScene();

//			p2.draw(); // red

//		System.out.println(p1.toString());

		System.out.println(p1);
		}
	}
}