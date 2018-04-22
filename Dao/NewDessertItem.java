/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.DessertBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewDessertItem {
    public static int addDessert() throws SQLException
    {
        int status;
        Connection con=DbConnectionProvider.getDbCon();
        String sql="insert into admin_desrt_table(DessertName,quantity,price) values(?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,new DessertBean().getDname());
        ps.setInt(2,new DessertBean().getQuantity());
        ps.setInt(3,new DessertBean().getPrice());
        status=ps.executeUpdate();
        return status;
    }
    public static ResultSet showDessert() throws SQLException
    {
        ResultSet rs;
        Connection con=DbConnectionProvider.getDbCon();
        String sql="select * from admin_desrt_table";
        PreparedStatement ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        
        return rs;
    }
}
