import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.Iterator;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		/*int[] nums = new int[3];		
		nums[0] = 10;
		nums[1] = 123;*/
		
//		int[] nums = new int[] {10, 123, 0};
		int[] nums = {10, 123, 0};
		
//		System.out.println(nums.length);
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			
		}
		
//		System.out.println(nums[3]);
		
		String[] names = /*new String[4]*/ {"Roman", "Mari", "Kostya", "Sashka"};
		
		Arrays.sort(names);
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		for (String name : names) {
			System.out.println(name);
		}
		
		int[][] matrix = 
			{
					{1, 2, 3},
					{4, 5}
			};
		
		System.out.println(matrix.length);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%-4d", matrix[i][j]);
			}
			System.out.println();
		}
		
		ArrayList<String> persons = new ArrayList<String>();		
		System.out.println(persons.size());
		
		persons.add("Roman");
		persons.add("Mari");
		persons.add("Sashka");
		
		persons.set(2, "Marishka");
		persons.remove(0);
		
		System.out.println(persons.size());
		
//		for (int i = 0; i < persons.size(); i++) {
//			System.out.println(persons.get(i));			
//		}
		
		/*Iterator<String> iter = persons.iterator();
		while (iter.hasNext()) {
			String p = iter.next();
			System.out.println(p);
		}*/
		
		Collections.sort(persons);
		for (String p : persons) {
			System.out.println(p);
		}
		
		List<String> up = Collections.unmodifiableList(persons);
		persons.add("Roman");
//		up.add("Roman");
		for (String p : up) {
			System.out.println(p);
		}
	}

}
