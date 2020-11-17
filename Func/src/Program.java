import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("������", 40));
		persons.add(new Person("����", 7));
		persons.add(new Person("�����", 11));
		persons.add(new Person("�������", 35));
		
//		for (Person p : persons) {
//			System.out.println(p);
//		}		
//		persons.stream().forEach(System.out :: println);
		
//		for (Person p : persons) {
//			if(p.age >= 18) {
//				System.out.println(p);
//			}
//		}		
//		persons.stream().filter(p -> p.age >= 18).forEach(System.out :: println);
		
//		ArrayList<Person> result = new ArrayList<Person>();
//		for (Person p : persons) {
//			if (p.age >= 18) {
//				result.add(p);
//			}
//		}
//		
//		Collections.sort(result, (p1, p2) -> p1.name.compareTo(p2.name));
//		for (Person p : result) {
//			System.out.println(p);
//		}
		
		persons.parallelStream().sequential().filter(p -> p.age >= 18).sorted((p1, p2) -> p1.name.compareTo(p2.name)).
			forEach(System.out :: println);
	}
}