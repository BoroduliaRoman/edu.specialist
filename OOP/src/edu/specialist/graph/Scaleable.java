package edu.specialist.graph;

public interface Scaleable {
	/*public static final*/ double DEFAULT_FACTOR = 2d;
	
	public static void test() {
		
	}
	
	/*public abstract*/ void scale(double factor);
	
	default void scale() {
		scale(DEFAULT_FACTOR);
	}
}

interface Scaleable3D extends Scaleable {
	void scale3D(double fx, double fy, double fz);
}