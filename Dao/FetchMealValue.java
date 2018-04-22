/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FetchMealValue {
    public static ResultSet fetchData() throws SQLException
    {
        ResultSet rs=null;
        Connection con=DbConnectionProvider.getDbCon();
        String sql="select * from admin_meal_table";
        PreparedStatement ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        return rs;
        
    }

    public static ResultSet fetchMedicine()
    {
             ResultSet rs=null; 
        Connection con=DbConnectionProvider.getDbCon();
        String sql="select DessertName from admin_desrt_table";
        try
        {
            PreparedStatement preparedStatement=con.prepareStatement(sql);
            rs=preparedStatement.executeQuery();
        }
        catch(Exception e){
            System.err.println(e);
        }
         
        return rs;
        
    }
    
}
