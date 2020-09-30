package edu.specialist.graph;

import java.util.ArrayList;

public /*final*/ abstract class Shape {

	public static final String DEFAULT_COLOR = "black";
	/*
	 * Modifier		Access Level	Visibility
	 * public		public			world
	 * private		private			this class only
	 * 				package			this package only
	 * protected	protected		this class, this package, subclass
	 */

	public String color;
	
//	public void color() {
//		
//	}

	static ArrayList<Shape> scene = new ArrayList<Shape>();

	public Shape() {
		this(DEFAULT_COLOR);
	}

	public Shape(String color) {
		System.out.println("Shape ctor");
		this.color = color;
		scene.add(this); // bad (see Person)
	}

	public static void drawScene() {
		for (Shape s : scene) {
			s.draw();
		}
	}
	
	public static void scaleScene(double factor) {
		for (Shape s : scene) {
			if (s instanceof Scaleable) {
				Scaleable sc = (Scaleable)s;
				sc.scale(factor);
			}
			
			/*
			// bad
			if (s instanceof Circle) {
				Circle c = (Circle)s;
				c.scale(factor);
			}
			*/
		}
	}

	public abstract void draw(); 
//	{
//		System.out.printf("Shape. Color: %s\n", color);
//	}
}