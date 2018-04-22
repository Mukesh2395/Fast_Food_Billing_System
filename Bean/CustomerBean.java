
package Bean;

public class CustomerBean {
 public static String customer_name,mobileno,email;
  public static int costofmeal,costoftea,costofcoffee,costofdrink,DessertPrice,tax,subtotal,total;

    public static void setCustomer_name(String customer_name) {
        CustomerBean.customer_name = customer_name;
    }

    public static void setMobileno(String mobileno) {
        CustomerBean.mobileno = mobileno;
    }

    public static void setEmail(String email) {
        CustomerBean.email = email;
    }

    public static void setCostofmeal(int costofmeal) {
        CustomerBean.costofmeal = costofmeal;
    }

    public static void setCostoftea(int costoftea) {
        CustomerBean.costoftea = costoftea;
    }

    public static void setCostofcoffee(int costofcoffee) {
        CustomerBean.costofcoffee = costofcoffee;
    }

    public static void setCostofdrink(int costofdrink) {
        CustomerBean.costofdrink = costofdrink;
    }

    public static void setDessertPrice(int DessertPrice) {
        CustomerBean.DessertPrice = DessertPrice;
    }

    public static void setTax(int tax) {
        CustomerBean.tax = tax;
    }

    public static void setSubtotal(int subtotal) {
        CustomerBean.subtotal = subtotal;
    }

    public static void setTotal(int total) {
        CustomerBean.total = total;
    }

    public static String getCustomer_name() {
        return customer_name;
    }

    public static String getMobileno() {
        return mobileno;
    }

    public static String getEmail() {
        return email;
    }

    public static int getCostofmeal() {
        return costofmeal;
    }

    public static int getCostoftea() {
        return costoftea;
    }

    public static int getCostofcoffee() {
        return costofcoffee;
    }

    public static int getCostofdrink() {
        return costofdrink;
    }

    public static int getDessertPrice() {
        return DessertPrice;
    }

    public static int getTax() {
        return tax;
    }

    public static int getSubtotal() {
        return subtotal;
    }

    public static int getTotal() {
        return total;
    }
}
