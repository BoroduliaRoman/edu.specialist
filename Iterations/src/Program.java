
public class Program {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if (i == 3) continue;
			if (i == 8) break;
			System.out.println(i);
		}
		
		int k = 1;
		for ( ; k < 10; ) {
			System.out.println(k++);
		}
		
//		for( ; ; );
		
		// 1 2 3 ... 10
		// 2 4 6 ... 20
		label:
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (j == 5) break label;
//				return;
				System.out.printf("%-4d", i * j);
			}
			System.out.println();
		}
		
		System.out.println("продолжение main");
		int a = 2;
		
//		for ( ; a < 1000; ) {
		while(a < 1000) {
			System.out.println(a);
			a *= 2;
		}
		
		a = 2000;
		do {
			System.out.println(a);
			a *= 2;
		} while(a < 1000);
		
		
		
	}
}