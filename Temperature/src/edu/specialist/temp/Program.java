package edu.specialist.temp;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
//		Locale.setDefault(new Locale("ru", "ru"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("T (C): ");
		double tc = sc.nextDouble();
		
		double tf = 9d / 5d * tc + 32d;
		System.out.printf(/*Locale.US,*/ "T (F): %.2f\n", tf);
		
		sc.close();
	}

}
