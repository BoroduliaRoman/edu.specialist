package edu.specialist;

public class Singleton {

	private Singleton() {

	}

	private static Singleton instance = null;

	public static Singleton getInsatnce() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}