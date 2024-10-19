
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author prajwal
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            System.out.println("Database");
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Prajwal@23");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","123456");
            System.out.println("Database Connected");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}

