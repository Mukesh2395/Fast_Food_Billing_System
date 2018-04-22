/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.CustomerBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RecordOfCustomer {
    public static int addCustomer() throws SQLException
    {
    
        int status=0;
        Connection con=DbConnectionProvider.getDbCon();
        String sql="insert into Record_customer_table(name,mobileno,email,cost_drink,cost_tea,cost_coffee,cost_dessert,tax,subtotal,total,cost_meal"
                + "values(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,new CustomerBean().getCustomer_name());
        ps.setString(2,new CustomerBean().getMobileno());
        ps.setString(3,new CustomerBean().getEmail());
        ps.setInt(4,new CustomerBean().getCostofcoffee());
        ps.setInt(5,new CustomerBean().getCostofdrink());
        ps.setInt(6,new CustomerBean().getCostofmeal());
        ps.setInt(7,new CustomerBean().getCostoftea());
        ps.setInt(8,new CustomerBean().getDessertPrice());
        ps.setInt(9,new CustomerBean().getSubtotal());
        ps.setInt(10,new CustomerBean().getTax());
        ps.setInt(11,new CustomerBean().getTotal());
           status=ps.executeUpdate();
        return status;
    }
    
}
