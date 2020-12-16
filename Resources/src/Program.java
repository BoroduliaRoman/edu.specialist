public class Program {
	public static void main(String[] args) {
		/*
		DBConnection db = new DBConnection();
		try {
			db.execute();			
		}
		finally {
			db.close();			
		}
		*/
		
		try(DBConnection db = new DBConnection();
				DBConnection db1 = new DBConnection()) {
			db.execute();
		} // db.close()
		
//		System.gc();
	}
}