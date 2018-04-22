/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Bean.MealBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewValueAction {
    public static int insertValue() throws SQLException
    {
        int status;
        Connection con=DbConnectionProvider.getDbCon();
        String sql="insert into admin_meal_table(fries,salad,hamburger,onion_rings,chicken_salad,fish_sandwich,cheese_sandwich,chicken_sandwich) "
                + "values(?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,new MealBean().getFries());
        ps.setString(2,new MealBean().getSalad());
        ps.setString(3,new MealBean().getHamburger());
        ps.setString(4,new MealBean().getOnionrings());
        ps.setString(5,new MealBean().getChickensalad());
        ps.setString(6,new MealBean().getFish_sandwich());
        ps.setString(7,new MealBean().getCheese_sandwich());
        ps.setString(8,new MealBean().getChicken_sandwich());
        status=ps.executeUpdate();
        
        
        
        return status;
    }
    
}
