/**
 * This is the GFG class, which uses the connection between 
 * the java code and the database to pull up the tables from
 * the database.
 * @ authors: Ethan
 * @ date of oldest edition: April 12 
 * @ version: 3 
 */

package src;
import java.sql.*;
import java.util.Scanner;


public class GFG {


   public static void main(String[] args) {
       // Establishing a connection
       connectionDB connection = new connectionDB();
       Connection con = null;
       PreparedStatement p = null;
       ResultSet rs = null;


       // Loading and registering drivers
       con = connection.connectDB();


       // Try block to check exceptions
       try {
           // Prompting user for input
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter the color to search for:");
           String colorInput = scanner.nextLine();


           // Writing a parameterized statement
           String sql = "select * from product where color=?";


           // Executing the query
           p = con.prepareStatement(sql);
           p.setString(1, colorInput); // Setting the parameter value
           rs = p.executeQuery();


           // Processing the results
           System.out.println("id\t\tcolor\t\tstyle\t\tsize\t\tprice");
           while (rs.next()) {
               int id = rs.getInt("product_id");
               String color = rs.getString("color");
               String style = rs.getString("style");
               String size = rs.getString("size");
               double price = rs.getDouble("price");




               // Print and display name, emailID and password
               System.out.println(id + "\t\t" + color + "\t\t" + style + "\t\t" + size + "\t\t" + price);
           }
           scanner.close();
       } catch (SQLException e) {
           // Print the exception
           System.out.println(e);
       }
   }
}





