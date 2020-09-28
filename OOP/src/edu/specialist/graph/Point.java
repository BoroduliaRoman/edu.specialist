package edu.specialist.graph;

/*
 * Modifier		Access Level	Visibility
 * public		public			world
 * 				package			this package only
 */

public class Point extends Shape {
	public int x;
	public int y;
	
//	public String color;
	
	public Point(int x, int y) {
		this(x, y, DEFAULT_COLOR);
	}
	
	public Point(int x, int y, String color) {
		super(color);
		System.out.println("Point ctor");
		this.x = x;
		this.y = y;
	}
	
	public void moveBy(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	@Override
	public final void draw() {
		System.out.printf("Point (%d) (%d). Color: %s\n", x, y, super.color);
//		super.draw();
	}	
	
	@Override
	public String toString() {
		return String.format("Point (%d) (%d). Color: %s\n", x, y, this.color);
	}
	
	@Override
	public Point clone() {
		return new Point(this.x, this.y, this.color);
	}
}