
public class Program {
	
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
	
	public static void main(String[] args) {
		
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
		
	}
}