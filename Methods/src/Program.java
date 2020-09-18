
public class Program {
	
	public static int gcd(int k1, int k2) {
		int k;
		while ((k = k1 % k2) != 0) {
			k1 = k2;
			k2 = k;
		}		
		return k2;
	}
	
	public static double average(int... m) {
		int sum = 0;
		for (int k : m) {
			sum += k;			
		}
		return (double)sum / m.length;
	}
	
	public static double average(int a, int b) {
		double avg = (a + b) / 2d;
		return avg;
	}
	
	public static void sayHello() {
		System.out.printf("Привет!\n");
	}
	
	public static void sayHello(String userName) {
		sayHello(userName, 18);
	}
	
	public static void sayHello(int age) {
		System.out.printf("Привет, %d!\n", age);
	}
	
	public static void sayHello(String userName, int age) {
		System.out.printf("Привет, %s - %d!\n", userName, age);
	}
	
	static void test1(int a) {
		a++;
		System.out.printf("Test1 a = %d\n", a);
	}
	
	static void test2(int[] a) {
		a[0]++;
		System.out.printf("Test2 a = %d\n", a[0]);
	}
	
	static void test3(String a) {
		a += "!";
		System.out.printf("test 3 a = %s\n", a);
	}
	
	static void test4(StringBuilder a) {
		a.append("!");
		System.out.printf("test 4 a = %s\n", a);
	}
			
	public static void main(String[] args) {
		
		{
			StringBuilder a = new StringBuilder("Roman");
			test4(a);
			System.out.printf("main 4 a = %s\n", a);
		}
		
		{
			String a = "Roman";
			test3(a);
			System.out.printf("main 3 a = %s\n", a);
		}
		
		{
			int[] a = {10};
			test2(a);
			System.out.printf("main 2 a = %d\n", a[0]);
		}
		
		{
			int a = 10;
			test1(a);
			System.out.printf("main a = %d\n", a);
		}
		
//		Program p = new Program();
//		p.sayHello();
//		p.sayHello();
		
//		Program.sayHello();		
		sayHello("Roman", 29);
		sayHello(29);
		sayHello("Ivan");
		sayHello();
		
//		double x = average(10, 11);
//		System.out.println(x);
		
		System.out.println(average(10, 11));
		System.out.println(average(new int[] {10, 11, 12, 13}));
		System.out.println(average(10, 11, 12, 13, 14));
		
		System.out.println(gcd(1071, 462));
		System.out.println(gcd(462, 1071));
		
		
		{
			int a = 10;
			int b = a;
			a++;
			
			System.out.printf("a = %d\nb = %d\n", a, b);
		}
		
		{
			int[] a = {10};
			int[] b = a; //a.clone();
			a[0]++;
			
			System.out.printf("a = %d\nb = %d", a[0], b[0]);
		}
		
	}
}