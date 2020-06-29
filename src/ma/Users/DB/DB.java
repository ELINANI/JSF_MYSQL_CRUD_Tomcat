package ma.Users.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	Connection connection;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/User?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}

	

}
