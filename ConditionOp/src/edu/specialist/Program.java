package edu.specialist;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		{
			int n = -10;

			if (n > 0) {
				System.out.println("n больше нул€");
				System.out.println("n > 0");
			} else {
				if (n > -100) {
					System.out.println("n > -100");
				} else {
					System.out.println("n Ќе больше нул€");
				}
			}

			int a = 0;

			/*
			 * String s; if(a == 0) { s = "ноль"; } else { s = "не ноль"; }
			 */

			String s = (a == 0) ? "ноль" : "не ноль";
			String r = "roman";

			System.out.println((r == null) ? "" : r.toUpperCase());

			int b = -1;
			final int c = 1;
			switch (b) {
			case -1:
			case c:
				System.out.println("One");
				break;
			case c + 1:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break; // return
			default:
				System.out.println("mnogo");
			}
		}

		{
			Scanner sc = new Scanner(System.in);
			String s1 = "hello";
//			final String s3 = "lo";
//			String s2 = "hel" + s3;
			String s2 = new String("hello");
			
			System.out.println(s1);
			System.out.println(s2);	
			if (s1 == s2) {
			
//			if(s1.equals(s2)) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
	}
}