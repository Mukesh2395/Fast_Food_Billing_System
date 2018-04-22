/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

public class DessertBean {
    public static String dname;
    public static int quantity,price;

    public static String getDname() {
        return dname;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setDname(String dname) {
        DessertBean.dname = dname;
    }

    public static void setQuantity(int quantity) {
        DessertBean.quantity = quantity;
    }

    public static void setPrice(int price) {
        DessertBean.price = price;
    }

    public static int getPrice() {
        return price;
    }
    
}
