package edu.specialist.graph;

import java.util.ArrayList;

public /*final*/ class Shape {

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
		scene.add(this);
	}

	public static void drawScene() {
		for (Shape s : scene) {
			s.draw();
		}
	}

	public void draw() {
		System.out.printf("Shape. Color: %s\n", color);
	}
}