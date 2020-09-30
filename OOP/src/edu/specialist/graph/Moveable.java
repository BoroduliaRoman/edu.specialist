package edu.specialist.graph;

public interface Moveable {
	double DEFAULT_FACTOR = 1D;
	
	void scale(double factor);
	
	default void scale() {
		scale(DEFAULT_FACTOR);
	}

}
