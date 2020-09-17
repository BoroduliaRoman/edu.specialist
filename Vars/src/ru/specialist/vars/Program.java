package ru.specialist.vars;

//import java.util.Date;
//import java.util.Calendar;
//import java.util.*;
//import java.sql.*;
import java.io.BufferedReader;
import java.util.Calendar;
import java.util.Date;

//import static java.lang.Math.PI;
//import static java.lang.Math.sin;
//import static java.lang.Math.cos;
import static java.lang.Math.*;
import static java.lang.System.out;
//import com.mysql.jdbc.Driver;

public class Program {

	public static int x;

	int y;

	public static void main(String[] args) {
//		goto
		{
//		java.util.Date d;
			Date d = new Date();
			int year = d.getYear() + 1900;

			Calendar c;
			BufferedReader b2;

			int k = 2;
			final double q = k;

			double r = cos(sin(PI * q));

//		int k = 4;
			Integer k2 = k; // boxing
			Integer k1 = k;

			Integer k4 = k1 + k2;

			int k3 = k2; // unboxing

			out.println(r);

			{
				int z = 10;
				System.out.println(z);
			}
			{
				String z = "abc";
				System.out.println(z);
			}

			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}

			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}

			int counter;
			String userName = "Roman";
			int a = 2, b = 3;

			String s;

			counter = 10 + 1;

			System.out.println(x);

			System.out.println(counter);
			System.out.println(userName);

			// + * - / %

			// Math.PI

			byte b1 = 040;
			int ix = b1;
			byte b3 = (byte) ix;

			int mValue = Integer.MAX_VALUE;
			System.out.println(mValue);

			long l1 = mValue + 1L;

			System.out.println(l1);

			double dd = 2.; // + - * /
			float ff = 2.5F;
		}
		
		{
			int a = 5;
			int b = 2;
			double c = (double)a / b;
			
			System.out.println(c);			
		}
		
		{
			char ch = 'A';
			char ch2 = '\u004D';
			int charCode = (int)ch2;
			
			System.out.println(ch2);
		}
		
		{
			boolean a = true;
			boolean b = false;
			
			boolean c = a && b;
			c = a || b;
			c = !a;
			
			c = a && !b;
			c = !(a && b);
			c = a || !b;
			
			System.out.println(c);
		}
		
		{
			int n = 10;
			boolean r = (n / 2) == (n - 5);
			
			r = (n >= 0) && (n <= 100);
			
			System.out.println(r);
		}
		
		{
			int a = 10;
//			a = a * 2;
			a *= 2;
		}
		
		{
			int a = 7; // 0111
			int b = 5; // 0101
			
			int c = a & b; //0101
			c = a | b; // 0111
			c = ~a; // 1000
			
			c = a << 2; // 0111 << 2 = 011100
			c = a >> 1; // 0111 >> 1 = 0011
			
			c = a >>> 1; // 0111 >> 1 = 0011
			
			
			
			System.out.println(c);
		}
		
		int n = 16;
		
		for (n = 1; n <= 1024; n++) {
//			if (((n + 1) & (n - 1)) == 1) {
//			if ( (n & (n - 1)) == 0) {
			if ((n & -n) == n) {
				System.out.println(n);
			}
		}

	}	
}
