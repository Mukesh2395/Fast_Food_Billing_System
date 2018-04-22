
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionProvider {
    
        public static Connection getDbCon(){
            Connection con=null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfoodbilling", "root", "");
	} 
        catch(Exception e)
        {
            System.out.println(e);
        }
      return con;
     }

}
