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

			Person p2 = Person.create("Marishka", 29);
			// new Person("Marishka");
//		p2.name = "Marishka";
//		p2.age = 29;

//			Person px = new Person();

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

			Shape s1 = p1; // implicit conv
			s1.color = "yellow";

			p1.draw();
			s1.draw(); // Point.draw

			if (s1 instanceof Point) { // true
				Point p3 = (Point) s1; // explicit conv (cast)
				p3.moveBy(1, 1);
			}

			Circle c1 = new Circle(100, 200, 50, "pink");

			c1.scale(1.5);
//			c1.setR(50);
			System.out.println(c1.getR());
			s1 = c1;

			s1.draw(); // Circle.draw

			/*
			 * Class Method Addr Shape draw xxx Point draw yyy Circle draw zzz *
			 */

			if (s1 instanceof Point) { // false
				Point p3 = (Point) s1;
			}
			
//			new Shape();

//			Shape.drawScene();

//			p2.draw(); // red

//		System.out.println(p1.toString());

			System.out.println(p1);
		}

		{
			Singleton s1 = Singleton.getInsatnce();
			Singleton s2 = Singleton.getInsatnce();
			
			System.out.println(s1 == s2);
		}
	}
}