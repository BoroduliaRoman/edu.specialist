import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Name: ");
			String name = sc.nextLine().trim();
			if(name.isEmpty()) {
				break;
			} else {
				names.add(name);
			}
		}
		
		Collections.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
