
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchDrinkDetail {
    public static ResultSet fetchDrink() throws SQLException
    {
        ResultSet rs=null;
        Connection con=DbConnectionProvider.getDbCon();
        String sql="select * from admin_drink_table";
        PreparedStatement ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        return rs;
        
    }
     public static ResultSet fetchCoffee() throws SQLException
    {
        ResultSet rs=null;
        Connection con=DbConnectionProvider.getDbCon();
        String sql="select * from admin_coffee_table";
        PreparedStatement ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        return rs;
        
    }
        public static ResultSet fetchTea() throws SQLException
    {
        ResultSet rs=null;
        Connection con=DbConnectionProvider.getDbCon();
        String sql="select * from admin_tea_table";
        PreparedStatement ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        return rs;
        
    }
    
}
