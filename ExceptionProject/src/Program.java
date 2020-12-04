public class Program {
	public static void test(String a, String b) throws MyException {
		try {
			int n1 = Integer.parseInt(a);
			int n2 = Integer.parseInt(b);	
			
			if (n1 < 0 || n1 > 100) {
				//throw new IllegalArgumentException("n1 out of [0, 100]");
				throw new MyException("n1 out of [0, 100]", n1);
			}
			
			int n = n1 / n2;
			
			System.out.println(n);			
		} 
		
		catch(NumberFormatException /* | ArithmeticException */ ex) {
			System.out.println("Не число");
			throw new RuntimeException("не число", ex);
		}		
		
//		catch(Exception ex) {
//			System.out.println(ex.getMessage());
//		}

//		catch(ArithmeticException ex) {
//			System.out.println("Деление на ноль");
//		}
		
		System.out.println("Продолжение test");
	}
	
	public static void main(String[] args) /* throws MyException */ {
		try {
			test("123", "0");	
		} catch (ArithmeticException ex) {
			System.out.println("Деление на ноль");
		}  catch (MyException ex) {
			System.out.printf("%s invalid data == %d\n", ex.getMessage(), ex.getInvalidData());
		}
		
		System.out.println("Продолжение main");
	}
}