/**
 * This is the connectionDB class, which creates the connection between the code and MySQL Database.
 * @ authors: Ethan
 * @ date of oldest edition: April 12 
 * @ version: 2 
 */

package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connectionDB {
    final String DB_URL
    = "jdbc:mysql://localhost:3306/EVML";

//  Database credentials

// We need two parameters to access the database
// Root and password 
 
// 1. Root 
    final String USER = "root";
 
// 2. Password to fetch database
    final String PASS = "Cristianocr7!";


/** 
 * @return Connection
 */
// Connection class for our database connectivity
    public Connection connectDB(){
        // Initially setting NULL
        // to connection class object
        Connection con = null;

        // Try block to check exceptions
        try {

            // Loading DB(SQL) drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Registering SQL drivers
            con = DriverManager.getConnection(DB_URL, USER,PASS);
        }

        // Catch block to handle database exceptions
        catch (SQLException e) {

            // Print the line number where exception occurs
            e.printStackTrace();
        }

        // Catch block to handle exception
        // if class not found
        catch (ClassNotFoundException e) {

            // Function prints the line number
            // where exception occurs
            e.printStackTrace();
        }

        // Returning Connection class object to
        // be used in (App/Main) GFG class
        return con;
    }
}

