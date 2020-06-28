package FirstSQL;
import java.sql.Connection;
import java.sql.DriverManager;

public class HiSQL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getConnection();
	}
	
	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/testdb";
			String user = "root";
			String password = "mYlife!0";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected");
			return conn;
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("Exception");
		}
		return null;
		
	}

}