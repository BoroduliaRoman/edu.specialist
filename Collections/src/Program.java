import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

class Test {
	private String data;

	public Test(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}
	
	
	@Override
	public int hashCode() {
		return getData().hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Test) {
			Test t1 = (Test)obj;
			return getData().equals(t1.getData());
		}
		else return false;
	}
		
}

public class Program {	
	public static boolean testString(String s) {
		System.out.printf("%s : ", s);
		
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (ch == '(' || ch == '[') {
				st.push(ch);
			}
			if (ch == ')' || ch == ']') {
				if (st.size() == 0) {
					return false;
				}
				char p = st.pop();
				if (!((p == '(' && ch == ')') || (p == '[' && ch == ']'))) {
					return false;
				}				
			}			
		}
		
		return st.size() == 0;
	}

	public static void main(String[] args) {
		System.out.println(testString("([sdaf])asdfjk(s)d[()as()](sdf)"));
		
		
		Map<String, Integer> persons = new Hashtable<String, Integer>();
		
		persons.put("Сергей", 40);
		persons.put("Наталия", 35);
		persons.put("Костя", 11);
		persons.put("Саша", 7);
		persons.put("Костя", 12);
		
		System.out.println(persons.size());
		
		String name = "Костя";
		if(persons.containsKey(name)) {
			int age = persons.get(name);
			System.out.printf("%s - %d\n", name, age);
		}
		
		{
			Set<String> set = new HashSet<String>();
			
			set.add("one");
			set.add(new String("two"));
			set.add(new String("two"));
			
			System.out.println(set.size());
			for (String t : set) {
				System.out.println(t);
			}
		}
		
		{
			Set<Test> set = new HashSet<Test>();
			
			set.add(new Test("one"));
			set.add(new Test("two"));
			set.add(new Test("two"));
			
			System.out.println(set.size());
			for (Test t : set) {
				System.out.println(t.getData());
			}
		}
		

	}

}
