package edu.specialist.graph;

public class Circle extends Shape {
	public int x;
	public int y;

	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		if (r > 0) {
			this.r = r;
		} else {
			throw new RuntimeException("radius <= 0"); 
		}
	}

	public Circle(int x, int y, int r, String color) {
		super(color);
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public void scale(double factor) {
		r = (int) (factor * r);
	}

	@Override
	public String toString() {
		return String.format("Circle (%d, %d) R: %d Color: %s\n", x, y, r, color);
	}

	@Override
	public void draw() {
		System.out.println(this);
	}

	@Override
	public Circle clone() {
		return new Circle(this.x, this.y, this.r, this.color);
	}

}
