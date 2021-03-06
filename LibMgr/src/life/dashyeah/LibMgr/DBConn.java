package life.dashyeah.LibMgr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Provide specified database connection
 * 
 * @author Dash Wong
 *
 */
public class DBConn {
	
	/**
	 * @return Database connection
	 */
	private static Connection connectDB() {
		Connection conn = null;
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			
		    conn = DriverManager.getConnection("jdbc:mysql://localhost/librarysys?useSSL=false", "root", "2269");
		    System.out.println("[MSG] DB connection got.");
		    
		    return conn;
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * @return Database connection
	 */
	public static Connection getConn() {
		return connectDB();
	}
}
