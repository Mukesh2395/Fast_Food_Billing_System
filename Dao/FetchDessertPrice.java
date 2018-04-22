
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchDessertPrice {
    public static ResultSet fetchPrice(String dname) throws SQLException
    {
        ResultSet rs=null;
        Connection con=DbConnectionProvider.getDbCon();
        String sql="select * from admin_desrt_table where DessertName=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,dname);
        rs=ps.executeQuery();
        
        return rs;
    }
    
}
