
package Dao;

import Bean.CoffeeBean;
import Bean.DrinkBean;
import Bean.TeaBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AddDrinkAction {
    public static int addCoffee() throws SQLException
    {
        int status=0;
        Connection con=DbConnectionProvider.getDbCon();
        String sql="insert into admin_coffee_table(brown_coffee,latte_coffee,americano_coffee,cappachino_coffee,hocha_coffee,black_coffee)"
                + "values(?,?,?,?,?,?)";
       
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,new CoffeeBean().getBrown_coffee());
        ps.setString(2,new CoffeeBean().getLatte_coffee());
        ps.setString(3,new CoffeeBean().getAmericano_coffee());
        ps.setString(4,new CoffeeBean().getCappachino_coffee());
        ps.setString(5,new CoffeeBean().getHocha_coffee());
        ps.setString(6,new CoffeeBean().getBlack_coffee());
         status=ps.executeUpdate();
        return status;
        
    }
    public static int addTea() throws SQLException
    {
        int status=0;
        Connection con=DbConnectionProvider.getDbCon();
        String sql="insert into admin_tea_table(brown_tea,green_tea,black_tea,lemon_tea,Ginger_tea,Ice_tea)"
                + "values(?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,new TeaBean().getBrown_tea());
        ps.setString(2,new TeaBean().getGreen_tea());
        ps.setString(3,new TeaBean().getBlack_tea());
        ps.setString(4,new TeaBean().getLemon_Tea());
        ps.setString(5,new TeaBean().getGinger_tea());
        ps.setString(6,new TeaBean().getIce_tea());
        status=ps.executeUpdate();
     return status;   
    }
    public static int addDrink() throws SQLException
    {
       int status=0;
        Connection con=DbConnectionProvider.getDbCon();
        String sql="insert into admin_drink_table(coco_cola,pepsi,diet_cock,mountain_dew,fanta,maza,redbull)"
                + "values(?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,new DrinkBean().getCoca_cola());
        ps.setString(2,new DrinkBean().getPepsi());
        ps.setString(3,new DrinkBean().getDiet_coak());
        ps.setString(4,new DrinkBean().getMountain_dew());
        ps.setString(5,new DrinkBean().getFanta());
        ps.setString(6,new DrinkBean().getMaza());
        ps.setString(7,new DrinkBean().getRedbull());
        status=ps.executeUpdate();
     return status; 
    }
    
    
    
}
