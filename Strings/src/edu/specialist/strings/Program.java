package edu.specialist.strings;

import static java.lang.System.out;

public class Program {

	public static void main(String[] args) {
		String hello = "Привет";
		String name = "Сергей";
		//String h = "Привет";
//				"\t\"\\Пр\u003Fи\nвет";
		
		String r = hello + " " + name + "!";
		
		out.println(r);
		out.println(r.length());
		out.println(r.charAt(0));
		out.println(r.charAt(r.length() - 1));
		out.println(r.contains("Сергей"));
		out.println(r.indexOf("Сергей"));

		out.println(r.toUpperCase());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 100; i++) {
			sb.append(i).append(' ');
		}
		
		String result = sb.toString();
		
		System.out.println(result);
		
	}
}