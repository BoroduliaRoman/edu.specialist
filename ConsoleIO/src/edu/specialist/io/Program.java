package edu.specialist.io;

import java.util.Date;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) //throws IOException
											{
//		System.out.print("Привет");
//		System.out.println("Роман");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ваше имя: ");
		String name = sc.nextLine();
		System.out.println("Ваш возраст: ");
		int age = sc.nextInt();
		if(sc.hasNextLine()) {
			sc.nextLine();
		}
		
		sc.close();		
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Ваше имя: "); 
//		
//		String name = reader.readLine();
//		System.out.println("Ваш возраст: ");
//		int age = Integer.parseInt(reader.readLine());
		// Double.parseDouble(s)
		
		
		
		
		// Привет, Роман - 29!
		
		int k1 = 10;
		int k2 = 30;
		int k3 = 20;
		
		String.format("%d %d %d", k1, k2, k3);
		
		String r = String.format("Привет, %2$d - %1$s %3$d!", name, age, 100);
		
		System.out.println(r);
		
		System.out.printf("Привет, %-20s - 0x%x!\n", name, age);
		System.out.printf("pi = %8.2f\n", Math.PI);
		// 2020-09-08
		Date now = new Date();
//		System.out.printf("%1$tY-%1$tm-%1$td", now);
		System.out.printf("%tY-%<tm-%<td\n", now);
		System.out.printf("%tF\n", now);
		System.out.printf("%tR\n", now);
		
	}

}
