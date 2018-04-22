
package JframeForm;

import Bean.CustomerBean;
import Dao.DbConnectionProvider;
import Dao.FetchDessertPrice;
import Dao.FetchDrinkDetail;
import Dao.FetchMealValue;
import Dao.MakePdfFormat;
import Dao.RecordOfCustomer;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

int []drink=new int[6];
int []count=new int[9];
int []coffee=new int[6];
int []tea=new int[6];
int []meal=new int[9];
int count_total1=0;
int count_total=0;
int sub_meal=0;
int sub_tea=0;
int sub_drink=0;
int sub_coffee=0;
int dpricetxt1=0;
int subtotal1=0;
int brown_coffee=0;
int black_coffee=0;
int latte_coffee=0;
int americano_coffee=0;
int hocha_coffee=0;
int cappachino_coffee=0;
 int brown_tea=0;int black_tea=0;int ice_tea=0;int green_tea=0;int ginger_tea=0;int lemon_Tea=0;

 public int fries=0;int salad=0;
 int hamburger=0;
 int onionrings=0;
 int chickensalad=0;
 int fish_sandwich=0;
 int chicken_sandwich=0;
 int cheese_sandwich=0;
 int coca_cola=0;
 int pepsi=0;
 int Diet_coak=0;
 int mountain_dew=0;
 int fanta=0;
 int maza=0;
 int redbull=0;
 int tax1=0;
  
    public Main() throws SQLException {
        initComponents();
        addDesert();
        meal();
        ShowDrink();
        ShowCoffee();
        ShowTea();
     
    }
    public void meal() throws SQLException
    {
          ResultSet rs=FetchMealValue.fetchData();
        if(rs.next())
        {
            fries=rs.getInt("fries");
            salad=rs.getInt("salad");
            hamburger=rs.getInt("hamburger");
            onionrings=rs.getInt("onion_rings");
            chickensalad=rs.getInt("chicken_salad");
            fish_sandwich=rs.getInt("fish_sandwich");
            chicken_sandwich=rs.getInt("cheese_sandwich");
            cheese_sandwich=rs.getInt("chicken_sandwich");
                    
        } 
    }
    public void addDesert() throws SQLException
    {
       ResultSet rs=FetchMealValue.fetchMedicine();
       while(rs.next())
       {
             dessertcombo.addItem(rs.getString("DessertName"));
       }
    }
public void ShowDrink() throws SQLException
{
    ResultSet rs=FetchDrinkDetail.fetchDrink();
    if(rs.next())
    {
        coca_cola=Integer.parseInt(rs.getString("coco_cola")+"");
        pepsi=Integer.parseInt(rs.getString("pepsi")+"");
        Diet_coak=Integer.parseInt(rs.getString("diet_cock")+"");
        mountain_dew=Integer.parseInt(rs.getString("mountain_dew")+"");
        fanta=Integer.parseInt(rs.getString("fanta")+"");
        maza=Integer.parseInt(rs.getString("maza")+"");
        System.out.println(maza);
        redbull=Integer.parseInt(rs.getString("redbull")+"");   
     }
}
public void ShowCoffee() throws SQLException
{
      ResultSet rs2=FetchDrinkDetail.fetchCoffee();
    if(rs2.next())
    {
        brown_coffee=Integer.parseInt(rs2.getString("brown_coffee"));
       
        latte_coffee=Integer.parseInt(rs2.getString("latte_coffee"));
        americano_coffee=Integer.parseInt(rs2.getString("americano_coffee"));
        cappachino_coffee=Integer.parseInt(rs2.getString("cappachino_coffee"));
        hocha_coffee=Integer.parseInt(rs2.getString("hocha_coffee"));
        black_coffee=Integer.parseInt(rs2.getString("black_coffee"));
       
    }
}
public void ShowTea() throws SQLException
{
      ResultSet rs=FetchDrinkDetail.fetchTea();
        if(rs.next())
        {
           brown_tea=(Integer.parseInt(rs.getString("brown_tea")));
           green_tea=(Integer.parseInt(rs.getString("green_tea")));
           black_tea=(Integer.parseInt(rs.getString("black_tea")));
           lemon_Tea=(Integer.parseInt(rs.getString("lemon_tea")));
           ginger_tea=(Integer.parseInt(rs.getString("Ginger_tea")));
           ice_tea=(Integer.parseInt(rs.getString("Ice_tea")));
           
                    
        } 
}
      
/*public void sub_total()
{
String service=mealtxt.getText();
String service2=costoftea.getText();

String service3=costofdrink.getText();
String service4=costofcoffee.getText();
String service5=dprice.getText(); 
subtotal1=Integer.parseInt(service)+Integer.parseInt(service2)+Integer.parseInt(service4)+Integer.parseInt(service5);
System.out.println(subtotal1);
subtotal.setText(subtotal1+" ");
}*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        fishsandwichcheckbox = new javax.swing.JCheckBox();
        cheesesandwichcheckbox = new javax.swing.JCheckBox();
        onionringscheckbox = new javax.swing.JCheckBox();
        HamburgerCheckbox = new javax.swing.JCheckBox();
        Friescheckbox = new javax.swing.JCheckBox();
        saladcheckbox = new javax.swing.JCheckBox();
        chickensaladcheckbox = new javax.swing.JCheckBox();
        chickenSandwichcheckbox = new javax.swing.JCheckBox();
        lbl1 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        txt8 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        dessertcombo = new javax.swing.JComboBox<>();
        lbldessert = new javax.swing.JLabel();
        txtdessert = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabledessert = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        tax = new javax.swing.JTextField();
        mealtxt = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        costoftea = new javax.swing.JTextField();
        costofcoffee = new javax.swing.JTextField();
        costofdrink = new javax.swing.JTextField();
        dprice = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        mountainChck = new javax.swing.JCheckBox();
        cocochk = new javax.swing.JCheckBox();
        cockchk = new javax.swing.JCheckBox();
        pepsichk = new javax.swing.JCheckBox();
        fantachk = new javax.swing.JCheckBox();
        mazachk = new javax.swing.JCheckBox();
        redbullchk = new javax.swing.JCheckBox();
        drinktxt6 = new javax.swing.JTextField();
        drinktxt5 = new javax.swing.JTextField();
        drinktxt4 = new javax.swing.JTextField();
        drinktxt1 = new javax.swing.JTextField();
        drinktxt2 = new javax.swing.JTextField();
        drinktxt3 = new javax.swing.JTextField();
        drinktxt7 = new javax.swing.JTextField();
        drinklablel7 = new javax.swing.JLabel();
        drinklablel1 = new javax.swing.JLabel();
        drinklablel4 = new javax.swing.JLabel();
        drinklablel3 = new javax.swing.JLabel();
        drinklablel2 = new javax.swing.JLabel();
        drinklablel6 = new javax.swing.JLabel();
        drinklablel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        coffiechik2 = new javax.swing.JCheckBox();
        coffiechk = new javax.swing.JCheckBox();
        coffiechk3 = new javax.swing.JCheckBox();
        coffiechk5 = new javax.swing.JCheckBox();
        coffiechk4 = new javax.swing.JCheckBox();
        coffiechk6 = new javax.swing.JCheckBox();
        coffieetxt2 = new javax.swing.JTextField();
        Coffieetxt5 = new javax.swing.JTextField();
        Coffieetxt4 = new javax.swing.JTextField();
        coffeetxt1 = new javax.swing.JTextField();
        Coffieetxt3 = new javax.swing.JTextField();
        Coffieetxt6 = new javax.swing.JTextField();
        coffeelabel1 = new javax.swing.JLabel();
        coffeelabel4 = new javax.swing.JLabel();
        coffeelabel3 = new javax.swing.JLabel();
        coffeelabel2 = new javax.swing.JLabel();
        coffeelabel6 = new javax.swing.JLabel();
        coffeelabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        tea3 = new javax.swing.JCheckBox();
        tea1 = new javax.swing.JCheckBox();
        tea2 = new javax.swing.JCheckBox();
        tea6 = new javax.swing.JCheckBox();
        tea4 = new javax.swing.JCheckBox();
        tea5 = new javax.swing.JCheckBox();
        teatxt4 = new javax.swing.JTextField();
        teatxt1 = new javax.swing.JTextField();
        teatxt3 = new javax.swing.JTextField();
        teatxt2 = new javax.swing.JTextField();
        teatxt6 = new javax.swing.JTextField();
        teatxt5 = new javax.swing.JTextField();
        tealabel5 = new javax.swing.JLabel();
        tealabel4 = new javax.swing.JLabel();
        tealabel3 = new javax.swing.JLabel();
        tealabel6 = new javax.swing.JLabel();
        tealabel2 = new javax.swing.JLabel();
        tealabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cphone = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        cemail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fast Food Billing System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(479, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 401, 401))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fast Meal and Vegeterian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        fishsandwichcheckbox.setBackground(new java.awt.Color(0, 0, 0));
        fishsandwichcheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fishsandwichcheckbox.setForeground(new java.awt.Color(255, 255, 255));
        fishsandwichcheckbox.setText("Fish Sandwich");
        fishsandwichcheckbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fishsandwichcheckboxMouseClicked(evt);
            }
        });
        fishsandwichcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fishsandwichcheckboxActionPerformed(evt);
            }
        });

        cheesesandwichcheckbox.setBackground(new java.awt.Color(0, 0, 0));
        cheesesandwichcheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cheesesandwichcheckbox.setForeground(new java.awt.Color(255, 255, 255));
        cheesesandwichcheckbox.setText("cheese sandwich");
        cheesesandwichcheckbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cheesesandwichcheckboxMouseClicked(evt);
            }
        });

        onionringscheckbox.setBackground(new java.awt.Color(0, 0, 0));
        onionringscheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        onionringscheckbox.setForeground(new java.awt.Color(255, 255, 255));
        onionringscheckbox.setText("Onion Rings");
        onionringscheckbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onionringscheckboxMouseClicked(evt);
            }
        });
        onionringscheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onionringscheckboxActionPerformed(evt);
            }
        });

        HamburgerCheckbox.setBackground(new java.awt.Color(0, 0, 0));
        HamburgerCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HamburgerCheckbox.setForeground(new java.awt.Color(255, 255, 255));
        HamburgerCheckbox.setText("Hamburger");
        HamburgerCheckbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HamburgerCheckboxMouseClicked(evt);
            }
        });
        HamburgerCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HamburgerCheckboxActionPerformed(evt);
            }
        });

        Friescheckbox.setBackground(new java.awt.Color(0, 0, 0));
        Friescheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Friescheckbox.setForeground(new java.awt.Color(255, 255, 255));
        Friescheckbox.setText("Fries");
        Friescheckbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FriescheckboxMouseClicked(evt);
            }
        });
        Friescheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FriescheckboxActionPerformed(evt);
            }
        });

        saladcheckbox.setBackground(new java.awt.Color(0, 0, 0));
        saladcheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saladcheckbox.setForeground(new java.awt.Color(255, 255, 255));
        saladcheckbox.setText("Salad");
        saladcheckbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saladcheckboxMouseClicked(evt);
            }
        });
        saladcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saladcheckboxActionPerformed(evt);
            }
        });

        chickensaladcheckbox.setBackground(new java.awt.Color(0, 0, 0));
        chickensaladcheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chickensaladcheckbox.setForeground(new java.awt.Color(255, 255, 255));
        chickensaladcheckbox.setText("Chicken Salad");
        chickensaladcheckbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chickensaladcheckboxMouseClicked(evt);
            }
        });
        chickensaladcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickensaladcheckboxActionPerformed(evt);
            }
        });

        chickenSandwichcheckbox.setBackground(new java.awt.Color(0, 0, 0));
        chickenSandwichcheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chickenSandwichcheckbox.setForeground(new java.awt.Color(255, 255, 255));
        chickenSandwichcheckbox.setText("chicken sandwich");
        chickenSandwichcheckbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chickenSandwichcheckboxMouseClicked(evt);
            }
        });
        chickenSandwichcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenSandwichcheckboxActionPerformed(evt);
            }
        });

        lbl1.setBackground(new java.awt.Color(51, 51, 51));
        lbl1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl4.setBackground(new java.awt.Color(51, 51, 51));
        lbl4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl5.setBackground(new java.awt.Color(51, 51, 51));
        lbl5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl5.setForeground(new java.awt.Color(255, 255, 255));
        lbl5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl9.setBackground(new java.awt.Color(51, 51, 51));
        lbl9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl9.setForeground(new java.awt.Color(255, 255, 255));
        lbl9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl7.setBackground(new java.awt.Color(51, 51, 51));
        lbl7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl7.setForeground(new java.awt.Color(255, 255, 255));
        lbl7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl6.setBackground(new java.awt.Color(51, 51, 51));
        lbl6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl6.setForeground(new java.awt.Color(255, 255, 255));
        lbl6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl2.setBackground(new java.awt.Color(51, 51, 51));
        lbl2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl8.setBackground(new java.awt.Color(51, 51, 51));
        lbl8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl8.setForeground(new java.awt.Color(255, 255, 255));
        lbl8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });

        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });

        txt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt9ActionPerformed(evt);
            }
        });

        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Friescheckbox)
                            .addComponent(saladcheckbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fishsandwichcheckbox)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(onionringscheckbox)
                                        .addComponent(HamburgerCheckbox))
                                    .addComponent(chickensaladcheckbox)))
                            .addComponent(cheesesandwichcheckbox)
                            .addComponent(chickenSandwichcheckbox))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(Friescheckbox)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saladcheckbox)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HamburgerCheckbox)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(onionringscheckbox)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chickensaladcheckbox)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fishsandwichcheckbox)
                                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cheesesandwichcheckbox)
                                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chickenSandwichcheckbox))
                    .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dessert", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        dessertcombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dessertcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select one" }));

        lbldessert.setBackground(new java.awt.Color(0, 0, 0));
        lbldessert.setForeground(new java.awt.Color(255, 255, 255));
        lbldessert.setText("Select ");

        txtdessert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdessert.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdessertKeyPressed(evt);
            }
        });

        jtabledessert.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                " Dessert Name", "Quantity", "Price"
            }
        ));
        jScrollPane2.setViewportView(jtabledessert);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("order");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbldessert, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dessertcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdessert, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dessertcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldessert, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdessert, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dessert Price");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sub Total");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tax");

        subtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subtotal.setText("0");
        subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalActionPerformed(evt);
            }
        });

        tax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tax.setText("0");

        mealtxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        mealtxt.setText("0");
        mealtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealtxtActionPerformed(evt);
            }
        });

        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total.setText("0");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cost of Meal");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cost of Tea");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cost of Coffee");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cost of Drink");

        costoftea.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        costoftea.setText("0");
        costoftea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costofteaActionPerformed(evt);
            }
        });

        costofcoffee.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        costofcoffee.setText("0");
        costofcoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costofcoffeeActionPerformed(evt);
            }
        });

        costofdrink.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        costofdrink.setText("0");
        costofdrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costofdrinkActionPerformed(evt);
            }
        });

        dprice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dprice.setText("0");

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(costofcoffee, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(costoftea, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(mealtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(costofdrink, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(tax, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(dprice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mealtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costoftea, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costofcoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(costofdrink, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dprice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton6)
                        .addComponent(jButton5)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane2.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        mountainChck.setBackground(new java.awt.Color(0, 0, 0));
        mountainChck.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mountainChck.setForeground(new java.awt.Color(255, 255, 255));
        mountainChck.setText("Mountain Dew");
        mountainChck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mountainChckMouseClicked(evt);
            }
        });
        mountainChck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mountainChckActionPerformed(evt);
            }
        });

        cocochk.setBackground(new java.awt.Color(0, 0, 0));
        cocochk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cocochk.setForeground(new java.awt.Color(255, 255, 255));
        cocochk.setText("Coco Cola");
        cocochk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cocochkMouseClicked(evt);
            }
        });

        cockchk.setBackground(new java.awt.Color(0, 0, 0));
        cockchk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cockchk.setForeground(new java.awt.Color(255, 255, 255));
        cockchk.setText("Diet Coke");
        cockchk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cockchkMouseClicked(evt);
            }
        });

        pepsichk.setBackground(new java.awt.Color(0, 0, 0));
        pepsichk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pepsichk.setForeground(new java.awt.Color(255, 255, 255));
        pepsichk.setText("Pepsi");
        pepsichk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pepsichkMouseClicked(evt);
            }
        });

        fantachk.setBackground(new java.awt.Color(0, 0, 0));
        fantachk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fantachk.setForeground(new java.awt.Color(255, 255, 255));
        fantachk.setText("Fanta");
        fantachk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fantachkMouseClicked(evt);
            }
        });

        mazachk.setBackground(new java.awt.Color(0, 0, 0));
        mazachk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mazachk.setForeground(new java.awt.Color(255, 255, 255));
        mazachk.setText("Maza");
        mazachk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mazachkMouseClicked(evt);
            }
        });

        redbullchk.setBackground(new java.awt.Color(0, 0, 0));
        redbullchk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        redbullchk.setForeground(new java.awt.Color(255, 255, 255));
        redbullchk.setText("Red Bull");
        redbullchk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redbullchkMouseClicked(evt);
            }
        });

        drinktxt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinktxt6ActionPerformed(evt);
            }
        });

        drinklablel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        drinklablel7.setForeground(new java.awt.Color(255, 255, 255));

        drinklablel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        drinklablel1.setForeground(new java.awt.Color(255, 255, 255));

        drinklablel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        drinklablel4.setForeground(new java.awt.Color(255, 255, 255));

        drinklablel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        drinklablel3.setForeground(new java.awt.Color(255, 255, 255));
        drinklablel3.setText(" ");

        drinklablel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        drinklablel2.setForeground(new java.awt.Color(255, 255, 255));

        drinklablel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        drinklablel6.setForeground(new java.awt.Color(255, 255, 255));

        drinklablel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        drinklablel5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cocochk)
                            .addComponent(mazachk)
                            .addComponent(fantachk)
                            .addComponent(redbullchk))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drinktxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drinktxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drinktxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drinktxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drinktxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drinktxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drinktxt7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pepsichk)
                    .addComponent(mountainChck)
                    .addComponent(cockchk))
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(drinklablel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(drinklablel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addComponent(drinklablel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinklablel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(drinklablel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(drinklablel1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(drinklablel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drinklablel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cocochk)
                        .addComponent(drinktxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drinklablel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pepsichk)
                        .addComponent(drinktxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cockchk)
                    .addComponent(drinktxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinklablel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drinklablel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mountainChck)
                        .addComponent(drinktxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drinklablel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fantachk)
                        .addComponent(drinktxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drinklablel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(redbullchk)
                        .addComponent(drinktxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drinklablel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mazachk)
                        .addComponent(drinktxt7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Drink", jPanel7);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        coffiechik2.setBackground(new java.awt.Color(0, 0, 0));
        coffiechik2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffiechik2.setForeground(new java.awt.Color(255, 255, 255));
        coffiechik2.setText("Cappuchino");
        coffiechik2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coffiechik2MouseClicked(evt);
            }
        });

        coffiechk.setBackground(new java.awt.Color(0, 0, 0));
        coffiechk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffiechk.setForeground(new java.awt.Color(255, 255, 255));
        coffiechk.setText("Black Coffee");
        coffiechk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coffiechkMouseClicked(evt);
            }
        });

        coffiechk3.setBackground(new java.awt.Color(0, 0, 0));
        coffiechk3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffiechk3.setForeground(new java.awt.Color(255, 255, 255));
        coffiechk3.setText("Lattel");
        coffiechk3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coffiechk3MouseClicked(evt);
            }
        });

        coffiechk5.setBackground(new java.awt.Color(0, 0, 0));
        coffiechk5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffiechk5.setForeground(new java.awt.Color(255, 255, 255));
        coffiechk5.setText("Hocha");
        coffiechk5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coffiechk5MouseClicked(evt);
            }
        });

        coffiechk4.setBackground(new java.awt.Color(0, 0, 0));
        coffiechk4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffiechk4.setForeground(new java.awt.Color(255, 255, 255));
        coffiechk4.setText("Brown Coffee");
        coffiechk4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coffiechk4MouseClicked(evt);
            }
        });
        coffiechk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coffiechk4ActionPerformed(evt);
            }
        });

        coffiechk6.setBackground(new java.awt.Color(0, 0, 0));
        coffiechk6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffiechk6.setForeground(new java.awt.Color(255, 255, 255));
        coffiechk6.setText("Americano");
        coffiechk6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coffiechk6MouseClicked(evt);
            }
        });
        coffiechk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coffiechk6ActionPerformed(evt);
            }
        });

        coffieetxt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffieetxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coffieetxt2ActionPerformed(evt);
            }
        });

        Coffieetxt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Coffieetxt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        coffeetxt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Coffieetxt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Coffieetxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Coffieetxt3ActionPerformed(evt);
            }
        });

        Coffieetxt6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        coffeelabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffeelabel1.setForeground(new java.awt.Color(255, 255, 255));

        coffeelabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffeelabel4.setForeground(new java.awt.Color(255, 255, 255));

        coffeelabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffeelabel3.setForeground(new java.awt.Color(255, 255, 255));

        coffeelabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffeelabel2.setForeground(new java.awt.Color(255, 255, 255));

        coffeelabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffeelabel6.setForeground(new java.awt.Color(255, 255, 255));

        coffeelabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coffeelabel5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coffiechk6)
                    .addComponent(coffiechk5)
                    .addComponent(coffiechk4)
                    .addComponent(coffiechk)
                    .addComponent(coffiechk3)
                    .addComponent(coffiechik2))
                .addGap(37, 37, 37)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coffeetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Coffieetxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(coffeelabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(Coffieetxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(coffeelabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(coffeelabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(coffeelabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(coffeelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(Coffieetxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(coffeelabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(coffieetxt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Coffieetxt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(coffiechk)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(coffeetxt1)
                        .addComponent(coffeelabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(coffiechik2)
                        .addComponent(coffieetxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(coffeelabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coffiechk3)
                    .addComponent(Coffieetxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coffeelabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coffiechk4)
                    .addComponent(Coffieetxt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coffeelabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coffiechk5)
                    .addComponent(Coffieetxt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coffeelabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coffiechk6)
                            .addComponent(Coffieetxt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(coffeelabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );

        jTabbedPane2.addTab("Coffee", jPanel8);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        tea3.setBackground(new java.awt.Color(0, 0, 0));
        tea3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tea3.setForeground(new java.awt.Color(255, 255, 255));
        tea3.setText("Black Tea");
        tea3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tea3MouseClicked(evt);
            }
        });
        tea3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tea3ActionPerformed(evt);
            }
        });

        tea1.setBackground(new java.awt.Color(0, 0, 0));
        tea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tea1.setForeground(new java.awt.Color(255, 255, 255));
        tea1.setText("Brown Tea");
        tea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tea1MouseClicked(evt);
            }
        });

        tea2.setBackground(new java.awt.Color(0, 0, 0));
        tea2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tea2.setForeground(new java.awt.Color(255, 255, 255));
        tea2.setText("Green Tea");
        tea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tea2MouseClicked(evt);
            }
        });

        tea6.setBackground(new java.awt.Color(0, 0, 0));
        tea6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tea6.setForeground(new java.awt.Color(255, 255, 255));
        tea6.setText("Ice Tea");
        tea6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tea6MouseClicked(evt);
            }
        });
        tea6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tea6ActionPerformed(evt);
            }
        });

        tea4.setBackground(new java.awt.Color(0, 0, 0));
        tea4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tea4.setForeground(new java.awt.Color(255, 255, 255));
        tea4.setText("Lemon Tea");
        tea4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tea4MouseClicked(evt);
            }
        });

        tea5.setBackground(new java.awt.Color(0, 0, 0));
        tea5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tea5.setForeground(new java.awt.Color(255, 255, 255));
        tea5.setText("Ginger Tea");
        tea5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tea5MouseClicked(evt);
            }
        });

        teatxt4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        teatxt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        teatxt3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        teatxt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        teatxt6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        teatxt5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        tealabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tealabel5.setForeground(new java.awt.Color(255, 255, 255));

        tealabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tealabel4.setForeground(new java.awt.Color(255, 255, 255));

        tealabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tealabel3.setForeground(new java.awt.Color(255, 255, 255));

        tealabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tealabel6.setForeground(new java.awt.Color(255, 255, 255));

        tealabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tealabel2.setForeground(new java.awt.Color(255, 255, 255));

        tealabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tealabel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tea5)
                            .addComponent(tea6))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teatxt5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(teatxt6)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tea1)
                            .addComponent(tea3)
                            .addComponent(tea2)
                            .addComponent(tea4))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(teatxt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(teatxt2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teatxt1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teatxt4))))
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tealabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tealabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tealabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tealabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tealabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tealabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tealabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tea1)
                        .addComponent(teatxt1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tealabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tea2)
                    .addComponent(teatxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tea3)
                            .addComponent(teatxt3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tea4)
                            .addComponent(teatxt4))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tea5)
                            .addComponent(teatxt5))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tealabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tealabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(tealabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tealabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tea6)
                        .addComponent(teatxt6)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tea", jPanel6);

        jTabbedPane1.addTab("Drinks", jTabbedPane2);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone No");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cemail, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cphone, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 162, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cphone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cemail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Drinks");

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chickenSandwichcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenSandwichcheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chickenSandwichcheckboxActionPerformed

    private void chickensaladcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickensaladcheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chickensaladcheckboxActionPerformed

    private void onionringscheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onionringscheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onionringscheckboxActionPerformed

    private void HamburgerCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HamburgerCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HamburgerCheckboxActionPerformed

    private void saladcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saladcheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saladcheckboxActionPerformed

    private void fishsandwichcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishsandwichcheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fishsandwichcheckboxActionPerformed

    private void FriescheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FriescheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FriescheckboxActionPerformed

    private void txt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9ActionPerformed

    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5ActionPerformed

    private void subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalActionPerformed

    private void mealtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mealtxtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Coffieetxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Coffieetxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Coffieetxt3ActionPerformed

    private void coffieetxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coffieetxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coffieetxt2ActionPerformed

    private void coffiechk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coffiechk6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coffiechk6ActionPerformed

    private void coffiechk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coffiechk4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coffiechk4ActionPerformed

    private void mountainChckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mountainChckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mountainChckActionPerformed

    private void tea6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tea6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tea6ActionPerformed

    private void tea3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tea3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tea3ActionPerformed

    private void FriescheckboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FriescheckboxMouseClicked
        if(Friescheckbox.isSelected()==true)
            {   
            if(txt1.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                txt1.requestFocus();
                Friescheckbox.setSelected(false);
                return;
             } 
           
                 count[1]=(fries*(Integer.parseInt(txt1.getText())));
                 sub_meal=sub_meal+count[1];
                 mealtxt.setText(sub_meal+" ");
                lbl1.setText(count[1]+"");
                count_total=count_total+count[1];
                subtotal.setText(count_total+" ");
                tax1=count_total*2/100;
                tax.setText(tax1+" ");
               count_total1=count_total+tax1;
               total.setText(count_total1+"");
               
                
               
            }
             else
        {
                sub_meal=sub_meal-count[1];
                 mealtxt.setText(sub_meal+" "); 
                 count_total=count_total-count[1];
                subtotal.setText(count_total+" ");
              tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
          }
          
    }//GEN-LAST:event_FriescheckboxMouseClicked

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6ActionPerformed

    private void saladcheckboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saladcheckboxMouseClicked
        if(saladcheckbox.isSelected()==true)
            {   
            if(txt2.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                txt2.requestFocus();
                saladcheckbox.setSelected(false);
                return;
             } 
               count[2]=(salad*(Integer.parseInt(txt2.getText())));
                lbl2.setText(count[2]+"");
                 sub_meal=sub_meal+count[2];
                 mealtxt.setText(sub_meal+" ");
                  count_total=count_total+count[2];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                
            }
        else
        {
           sub_meal=sub_meal-count[2];
                 mealtxt.setText(sub_meal+" ");  
                count_total=count_total-count[2];
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
          }
    }//GEN-LAST:event_saladcheckboxMouseClicked

    private void HamburgerCheckboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HamburgerCheckboxMouseClicked
      
               if(saladcheckbox.isSelected()==true)
            {   
            if(txt4.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                txt4.requestFocus();
                saladcheckbox.setSelected(false);
                return;
             } 
           
                 count[3]=(hamburger*(Integer.parseInt(txt4.getText())));
                 lbl4.setText(count[3]+"");
                  sub_meal=sub_meal+count[3];
                 mealtxt.setText(sub_meal+" ");
                  count_total=count_total+count[3];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                
             
                 
            }
                else
              {
           sub_meal=sub_meal-count[3];
                 mealtxt.setText(sub_meal+" ");
                  count_total=count_total-count[3];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
               
        
          }
               
          
    }//GEN-LAST:event_HamburgerCheckboxMouseClicked

    private void onionringscheckboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onionringscheckboxMouseClicked

          if(onionringscheckbox.isSelected()==true)
            {   
            if(txt5.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                txt5.requestFocus();
                onionringscheckbox.setSelected(false);
                return;
             } 
              count[4]=(onionrings*(Integer.parseInt(txt5.getText())));
                 lbl5.setText(count[4]+"");
                  sub_meal=sub_meal+count[4];
                 mealtxt.setText(sub_meal+" ");
                  count_total=count_total+count[4];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                  
            } else
             {
                sub_meal=sub_meal-count[4];
                 mealtxt.setText(sub_meal+" ");
                  count_total=count_total-count[4];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                
                 
        
          }
          
        // TODO add your handling code here:
    }//GEN-LAST:event_onionringscheckboxMouseClicked

    private void chickensaladcheckboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chickensaladcheckboxMouseClicked
        // TODO add your handling code here:
                if(chickensaladcheckbox.isSelected()==true)
            {   
            if(txt6.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                txt6.requestFocus();
                chickensaladcheckbox.setSelected(false);
                return;
             } 
           
                 count[5]=(chickensalad*(Integer.parseInt(txt6.getText())));
                 lbl6.setText(count[5]+"");
                  sub_meal=sub_meal+count[5];
                 mealtxt.setText(sub_meal+" ");
                  count_total=count_total+count[5];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
            
            }
                 else
        {
           sub_meal=sub_meal-count[5];
                 mealtxt.setText(sub_meal+" ");
                  count_total=count_total-count[5];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                 count_total1=count_total+tax1;
               total.setText(count_total1+"");
        
          }
    }//GEN-LAST:event_chickensaladcheckboxMouseClicked

    private void fishsandwichcheckboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fishsandwichcheckboxMouseClicked
        // TODO add your handling code here:
             if(fishsandwichcheckbox.isSelected()==true)
            {   
            if(txt7.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                txt7.requestFocus();
                fishsandwichcheckbox.setSelected(false);
                return;
             } 
         
                 count[6]=(fish_sandwich*(Integer.parseInt(txt7.getText())));
                 lbl7.setText(count[6]+"");
                  sub_meal=sub_meal+count[6];
                 mealtxt.setText(sub_meal+" ");
                  count_total=count_total+count[6];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
            
            }
              else
        {
           sub_meal=sub_meal-count[6];
                 mealtxt.setText(sub_meal+" "); 
                  count_total=count_total-count[6];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                
        
          }
    }//GEN-LAST:event_fishsandwichcheckboxMouseClicked

    private void cheesesandwichcheckboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cheesesandwichcheckboxMouseClicked
        // TODO add your handling code here:
              if(cheesesandwichcheckbox.isSelected()==true)
            {   
            if(txt8.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                txt8.requestFocus();
                cheesesandwichcheckbox.setSelected(false);
                return;
             } 
          
                 count[7]=(chicken_sandwich*(Integer.parseInt(txt8.getText())));
                 lbl8.setText(count[7]+"");
                  sub_meal=sub_meal+count[7];
                 mealtxt.setText(sub_meal+" ");
                  count_total=count_total+count[7];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
            
            }
               else
        {
                    sub_meal=sub_meal-count[7];
                 mealtxt.setText(sub_meal+" "); 
                 lbl8.setText(" ");
                 txt8.setText(" ");
                  count_total=count_total-count[7];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                
        
          }
    }//GEN-LAST:event_cheesesandwichcheckboxMouseClicked

    private void chickenSandwichcheckboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chickenSandwichcheckboxMouseClicked
        // TODO add your handling code here:
             if(chickenSandwichcheckbox.isSelected()==true)
            {   
            if(txt9.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                txt9.requestFocus();
                chickenSandwichcheckbox.setSelected(false);
                return;
             } 
          
                 count[8]=(cheese_sandwich*(Integer.parseInt(txt9.getText())));
                 lbl9.setText(count[8]+"");
                  sub_meal=sub_meal+count[8];
                 mealtxt.setText(sub_meal+" ");
                  count_total=count_total+count[8];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
            
            }
              else
        {
           sub_meal=sub_meal-count[8];
                 mealtxt.setText(sub_meal+" ");  
                  lbl9.setText(" ");
                 txt9.setText(" ");
                  count_total=count_total-count[8];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
        
          }
        
    }//GEN-LAST:event_chickenSandwichcheckboxMouseClicked

    private void txtdessertKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdessertKeyPressed
    
    }//GEN-LAST:event_txtdessertKeyPressed

    private void costofteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costofteaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costofteaActionPerformed

    private void costofcoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costofcoffeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costofcoffeeActionPerformed

    private void costofdrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costofdrinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costofdrinkActionPerformed

    private void drinktxt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinktxt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drinktxt6ActionPerformed

    private void cocochkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cocochkMouseClicked
       if(cocochk.isSelected()==true)
            {   
            if(drinktxt1.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                drinktxt1.requestFocus();
                cocochk.setSelected(false);
                return;
             } 
           
                 drink[0]=(coca_cola*(Integer.parseInt(drinktxt1.getText())));
                 drinklablel1.setText(drink[0]+"");
                 sub_drink=sub_drink+drink[0];
                 costofdrink.setText(sub_drink+" ");
                  count_total=count_total+drink[0];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
                 
            
            }
       else{
            sub_drink=sub_drink-drink[0];
            costofdrink.setText(sub_drink+" ");
            drinklablel1.setText(" ");
            drinktxt1.setText(" ");
             count_total=count_total-drink[0];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
        
                 
       }
    }//GEN-LAST:event_cocochkMouseClicked

    private void pepsichkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pepsichkMouseClicked
 if(pepsichk.isSelected()==true)
            {   
            if(drinktxt2.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                drinktxt2.requestFocus();
                pepsichk.setSelected(false);
                return;
             } 
               drink[1]=(pepsi*(Integer.parseInt(drinktxt2.getText())));
                 drinklablel2.setText(drink[1]+"");
                      sub_drink=sub_drink+drink[1];
                 costofdrink.setText(sub_drink+" ");
                  count_total=count_total+drink[1];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
            }
       else{
            sub_drink=sub_drink-drink[1];
            costofdrink.setText(sub_drink+" ");
            drinklablel2.setText(" ");
            drinktxt2.setText(" ");
             count_total=count_total-drink[1];
                subtotal.setText(count_total+" ");
             tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
       }
            
            
    }//GEN-LAST:event_pepsichkMouseClicked

    private void cockchkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cockchkMouseClicked

        if(cockchk.isSelected()==true)
            {   
            if(drinktxt3.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                drinktxt3.requestFocus();
                cockchk.setSelected(false);
                return;
             } 
               drink[2]=(Diet_coak*(Integer.parseInt(drinktxt3.getText())));
                 drinklablel3.setText(drink[2]+"");
                 sub_drink=sub_drink+drink[2];
                 costofdrink.setText(sub_drink+" ");
                  count_total=count_total+drink[2];
                subtotal.setText(count_total+" ");
                  tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            
            }
       else{
            sub_drink=sub_drink-drink[2];
            costofdrink.setText(sub_drink+" ");
            drinklablel3.setText(" ");
            drinktxt3.setText(" ");
             count_total=count_total-drink[2];
                subtotal.setText(count_total+" ");
            tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
       }
    }//GEN-LAST:event_cockchkMouseClicked

    private void mountainChckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mountainChckMouseClicked

        if(mountainChck.isSelected()==true)
            {   
            if(drinktxt4.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                drinktxt4.requestFocus();
                mountainChck.setSelected(false);
                return;
             } 
            
                 drink[3]=(mountain_dew*(Integer.parseInt(drinktxt4.getText())));
                 drinklablel4.setText(drink[3]+"");
                      sub_drink=sub_drink+drink[3];
                 costofdrink.setText(sub_drink+" ");
                  count_total=count_total+drink[3];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            
            }
       else{
            sub_drink=sub_drink-drink[3];
            costofdrink.setText(sub_drink+" ");
            drinklablel4.setText(" ");
            drinktxt4.setText(" ");
             count_total=count_total-drink[3];
                subtotal.setText(count_total+" ");
             tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                
       
            
            }
    }//GEN-LAST:event_mountainChckMouseClicked

    private void fantachkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fantachkMouseClicked
      if(fantachk.isSelected()==true)
            {   
            if(drinktxt5.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                drinktxt5.requestFocus();
                fantachk.setSelected(false);
                return;
             } 
               drink[4]=(fanta*(Integer.parseInt(drinktxt5.getText())));
                 drinklablel5.setText(drink[4]+"");
                 sub_drink=sub_drink+drink[4];
                 costofdrink.setText(sub_drink+" ");
                  count_total=count_total+drink[4];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            
            }
       else{
            sub_drink=sub_drink-drink[4];
            costofdrink.setText(sub_drink+" ");
            drinklablel5.setText(" ");
            drinktxt5.setText(" ");
             count_total=count_total-drink[4];
                subtotal.setText(count_total+" ");
        tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
       }
    }//GEN-LAST:event_fantachkMouseClicked

    private void redbullchkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redbullchkMouseClicked
        // TODO add your handling code here:
          if(redbullchk.isSelected()==true)
            {   
            if(drinktxt6.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                drinktxt6.requestFocus();
                redbullchk.setSelected(false);
                return;
             } 
         
                 drink[5]=(redbull*(Integer.parseInt(drinktxt6.getText())));
                 drinklablel6.setText(drink[5]+"");
                 sub_drink=sub_drink+drink[5];
                 costofdrink.setText(sub_drink+" ");
                  count_total=count_total+drink[5];
                subtotal.setText(count_total+" ");
                tax1=count_total*2/100;
                tax.setText(tax1+" "); 
            count_total1=count_total+tax1;
               total.setText(count_total1+"");
            }
       else{
            sub_drink=sub_drink-drink[5];
            costofdrink.setText(sub_drink+" ");
            drinklablel6.setText(" ");
            drinktxt6.setText(" ");
             count_total=count_total-drink[5];
                subtotal.setText(count_total+" ");
                tax1=count_total*2/100;
                tax.setText(tax1+" "); 
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
       }
    }//GEN-LAST:event_redbullchkMouseClicked

    private void mazachkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mazachkMouseClicked
        // TODO add your handling code here:
            if(mazachk.isSelected()==true)
            {   
            if(drinktxt7.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                drinktxt7.requestFocus();
                mazachk.setSelected(false);
                return;
             } 
           
                 drink[6]=(maza*(Integer.parseInt(drinktxt7.getText())));
                 drinklablel7.setText(drink[6]+"");
                 sub_drink=sub_drink+drink[6];
                 costofdrink.setText(sub_drink+" ");
                  count_total=count_total+drink[6];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            
            }
       else{
            sub_drink=sub_drink-drink[6];
            costofdrink.setText(sub_drink+" ");
            drinklablel7.setText(" ");
            drinktxt7.setText(" ");
             count_total=count_total-drink[6];
                subtotal.setText(count_total+" ");
       tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
       }
    }//GEN-LAST:event_mazachkMouseClicked

    private void coffiechkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coffiechkMouseClicked
 
         if(coffiechk.isSelected()==true)
            {   
            if(coffeetxt1.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                coffeetxt1.requestFocus();
                coffiechk.setSelected(false);
                return;
             } 
           
                 coffee[0]=(black_coffee*(Integer.parseInt(coffeetxt1.getText())));
                 coffeelabel1.setText(coffee[0]+"");
                  sub_coffee=sub_coffee+coffee[0];
                 costofcoffee.setText(sub_coffee+" ");
                  count_total=count_total+coffee[0];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
            }
        else{
            sub_coffee=sub_coffee-coffee[0];
             costofcoffee.setText(sub_coffee+" ");
             coffeelabel1.setText(" ");
         coffeetxt1.setText(" ");
      count_total=count_total-coffee[0];
                subtotal.setText(count_total+" ");
           tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            }
    }//GEN-LAST:event_coffiechkMouseClicked

    private void coffiechik2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coffiechik2MouseClicked
        if(coffiechik2.isSelected()==true)
            {   
            if(coffieetxt2.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                coffeetxt1.requestFocus();
                coffiechik2.setSelected(false);
                return;
             } 
           
                 coffee[1]=(cappachino_coffee*(Integer.parseInt(coffieetxt2.getText())));
                 coffeelabel2.setText(coffee[1]+"");
                  sub_coffee=sub_coffee+coffee[1];
                 costofcoffee.setText(sub_coffee+" ");
                  count_total=count_total+coffee[1];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
            }
        else{
            sub_coffee=sub_coffee-coffee[1];
             costofcoffee.setText(sub_coffee+" ");
             coffeelabel2.setText(" ");
         coffieetxt2.setText(" ");
          count_total=count_total-coffee[1];
                subtotal.setText(count_total+" ");
              tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
          
            }


    }//GEN-LAST:event_coffiechik2MouseClicked

    private void coffiechk3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coffiechk3MouseClicked
      if(coffiechk3.isSelected()==true)
            {   
            if(Coffieetxt3.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                Coffieetxt3.requestFocus();
                coffiechk3.setSelected(false);
                return;
             } 
          
                 coffee[2]=(latte_coffee*(Integer.parseInt(Coffieetxt3.getText())));
                 coffeelabel3.setText(coffee[2]+"");
                  sub_coffee=sub_coffee+coffee[2];
                 costofcoffee.setText(sub_coffee+" ");
                  count_total=count_total+coffee[2];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
            }
        else{
            sub_coffee=sub_coffee-coffee[2];
             costofcoffee.setText(sub_coffee+" ");
             coffeelabel3.setText(" ");
             Coffieetxt3.setText(" ");
              count_total=count_total-coffee[2];
                subtotal.setText(count_total+" ");
        tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
             
            
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_coffiechk3MouseClicked

    private void coffiechk4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coffiechk4MouseClicked
    if(coffiechk4.isSelected()==true)
            {   
            if(Coffieetxt4.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                Coffieetxt4.requestFocus();
                coffiechk4.setSelected(false);
                return;
             } 
           
                 coffee[3]=(brown_coffee*(Integer.parseInt(Coffieetxt4.getText())));
                 coffeelabel4.setText(coffee[3]+"");
                  sub_coffee=sub_coffee+coffee[3];
                 costofcoffee.setText(sub_coffee+" ");
                   count_total=count_total+coffee[3];
                subtotal.setText(count_total+" ");
                tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            }
        else{
            sub_coffee=sub_coffee-coffee[3];
             costofcoffee.setText(sub_coffee+" ");
             coffeelabel4.setText(" ");
         Coffieetxt4.setText(" ");
          count_total=count_total-coffee[3];
                subtotal.setText(count_total+" ");
          tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
             
            
            }
    }//GEN-LAST:event_coffiechk4MouseClicked

    private void coffiechk5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coffiechk5MouseClicked
if(coffiechk5.isSelected()==true)
            {   
            if(Coffieetxt5.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                Coffieetxt5.requestFocus();
                coffiechk5.setSelected(false);
                return;
             } 
           
                 coffee[4]=(hocha_coffee*(Integer.parseInt(Coffieetxt5.getText())));
                 coffeelabel5.setText(coffee[4]+"");
             sub_coffee=sub_coffee+coffee[4];
                 costofcoffee.setText(sub_coffee+" ");
                  count_total=count_total+coffee[4];
                subtotal.setText(count_total+" ");
                tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
            }
        else{
            sub_coffee=sub_coffee-coffee[4];
             costofcoffee.setText(sub_coffee+" ");
             coffeelabel5.setText(" ");
         Coffieetxt5.setText(" ");
          count_total=count_total-coffee[4];
                subtotal.setText(count_total+" ");
      tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
             
            }
    }//GEN-LAST:event_coffiechk5MouseClicked

    private void coffiechk6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coffiechk6MouseClicked
if(coffiechk6.isSelected()==true)
            {   
            if(Coffieetxt6.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                Coffieetxt6.requestFocus();
                coffiechk6.setSelected(false);
                return;
             } 
             
                 coffee[5]=(americano_coffee*(Integer.parseInt(Coffieetxt6.getText())));
                 coffeelabel6.setText(coffee[5]+"");
                 sub_coffee=sub_coffee+coffee[5];
                 costofcoffee.setText(sub_coffee+" ");
                  count_total=count_total+coffee[5];
                subtotal.setText(count_total+" ");
                tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
                 
            }
        else{
            sub_coffee=sub_coffee-coffee[5];
             costofcoffee.setText(sub_coffee+" ");
             coffeelabel6.setText(" ");
         Coffieetxt6.setText(" ");
          count_total=count_total-coffee[5];
                subtotal.setText(count_total+" ");
     tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            
        }
    
    }//GEN-LAST:event_coffiechk6MouseClicked

    private void tea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tea1MouseClicked
    if(tea1.isSelected()==true)
            {   
            if(teatxt1.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                teatxt1.requestFocus();
               tea1.setSelected(false);
                return;
             } 
           
                 tea[0]=(brown_tea*(Integer.parseInt(teatxt1.getText())));
                 tealabel1.setText(tea[0]+"");
                  sub_tea=sub_tea+tea[0];
               costoftea.setText(sub_tea+" ");
                count_total=count_total+tea[0];
                subtotal.setText(count_total+" ");
                tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
          
            }
              else{
              sub_tea=sub_tea-tea[0];
               costoftea.setText(sub_tea+" ");
               teatxt1.setText(" ");
               tea1.setSelected(false);tealabel6.setText(" ");
               count_total=count_total-tea[0];
                subtotal.setText(count_total+" ");
              tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
               
            }
    }//GEN-LAST:event_tea1MouseClicked

    private void tea2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tea2MouseClicked
     if(tea2.isSelected()==true)
            {   
            if(teatxt2.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                teatxt2.requestFocus();
               tea2.setSelected(false);
                return;
             } 
              tea[1]=(green_tea*(Integer.parseInt(teatxt2.getText())));
                 tealabel2.setText(tea[1]+"");
                  sub_tea=sub_tea+tea[1];
               costoftea.setText(sub_tea+" ");
               count_total=count_total+tea[1];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            
            }
       else{
              sub_tea=sub_tea-tea[1];
               costoftea.setText(sub_tea+" ");
               teatxt2.setText(" ");
               tea2.setSelected(false);tealabel6.setText(" ");
               count_total=count_total-tea[1];
                subtotal.setText(count_total+" ");
                tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            }
    }//GEN-LAST:event_tea2MouseClicked

    private void tea3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tea3MouseClicked
         if(tea3.isSelected()==true)
            {   
            if(teatxt3.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                teatxt3.requestFocus();
               tea3.setSelected(false);
                return;
             } 
           
                 tea[2]=(black_tea*(Integer.parseInt(teatxt3.getText())));
                 tealabel3.setText(tea[2]+"");
                  sub_tea=sub_tea+tea[2];
               costoftea.setText(sub_tea+" ");
               count_total=count_total+tea[2];
                subtotal.setText(count_total+" ");
                tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            }
           else{
              sub_tea=sub_tea-tea[2];
               costoftea.setText(sub_tea+" ");
               teatxt3.setText(" ");
               tea3.setSelected(false);
               tealabel6.setText(" ");
               count_total=count_total-tea[2];
                subtotal.setText(count_total+" ");
                tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            }
    }//GEN-LAST:event_tea3MouseClicked

    private void tea4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tea4MouseClicked
          if(tea4.isSelected()==true)
            {   
            if(teatxt4.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                teatxt4.requestFocus();
               tea4.setSelected(false);
                return;
             } 
          
                 tea[3]=(lemon_Tea*(Integer.parseInt(teatxt4.getText())));
                 tealabel4.setText(tea[3]+"");
                  sub_tea=sub_tea+tea[3];
               costoftea.setText(sub_tea+" ");
               count_total=count_total+tea[3];
                subtotal.setText(count_total+" ");
                tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            
            }
            else{
              sub_tea=sub_tea-tea[3];
               costoftea.setText(sub_tea+" ");
               teatxt4.setText(" ");
               tea4.setSelected(false);
               tealabel6.setText(" ");
               count_total=count_total-tea[3];
                subtotal.setText(count_total+" ");
                
                tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            }
    }//GEN-LAST:event_tea4MouseClicked

    private void tea5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tea5MouseClicked
  if(tea5.isSelected()==true)
            {   
            if(teatxt5.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                teatxt5.requestFocus();
               tea5.setSelected(false);
                return;
             } 
          
                 tea[4]=(ginger_tea*(Integer.parseInt(teatxt5.getText())));
                 tealabel5.setText(tea[4]+"");
                  sub_tea=sub_tea+tea[4];
               costoftea.setText(sub_tea+" ");
               count_total=count_total+tea[4];
                subtotal.setText(count_total+" ");
                 tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
            
            }
    else{
              sub_tea=sub_tea-tea[4];
               costoftea.setText(sub_tea+" ");
               teatxt5.setText(" ");tealabel6.setText(" ");
               tea5.setSelected(false);
               count_total=count_total-tea[4];
                subtotal.setText(count_total+" ");
                tax1=count_total*2/100;
                tax.setText(tax1+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
               
            }
    }//GEN-LAST:event_tea5MouseClicked

    private void tea6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tea6MouseClicked
        // TODO add your handling code here:
         if(tea6.isSelected()==true)
            {   
            if(teatxt6.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "plz enter quantity..!");
                teatxt6.requestFocus();
               tea6.setSelected(false);
                return;
             } 
           
                 tea[5]=(ice_tea*(Integer.parseInt(teatxt6.getText())));
                 tealabel6.setText(tea[5]+"");
                  sub_tea=sub_tea+tea[5];
               costoftea.setText(sub_tea+" ");
                sub_tea=sub_tea+tea[5];
               costoftea.setText(sub_tea+" ");
               count_total=count_total+tea[5];
                subtotal.setText(count_total+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
               
            }
         else{
              sub_tea=sub_tea-tea[5];
               costoftea.setText(sub_tea+" ");
               teatxt6.setText(" ");
               tealabel6.setText(" ");
               tea6.setSelected(false);
               count_total=count_total-tea[5];
                subtotal.setText(count_total+" ");
                count_total1=count_total+tax1;
               total.setText(count_total1+"");
               
            }
    }//GEN-LAST:event_tea6MouseClicked
 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    DefaultTableModel model=(DefaultTableModel)jtabledessert.getModel();
       model.setRowCount(0);
       
        String dname=dessertcombo.getSelectedItem().toString();
  int price=0;
    try {
        ResultSet rs=FetchDessertPrice.fetchPrice(dname);
        if(rs.next())
        {
         price=rs.getInt("price");   
        }
    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    int dQuantity=Integer.parseInt(txtdessert.getText());
     dpricetxt1=price*dQuantity;
  
         model.addRow(new Object[]{dname,dQuantity,dpricetxt1});
         dprice.setText(dpricetxt1+" ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     /*
      CustomerBean.setCustomer_name(cname.getText());
      CustomerBean.setMobileno(cname.getText());
      CustomerBean.setEmail(cemail.getText());
      CustomerBean.setCostofcoffee(Integer.parseInt(costofcoffee.getText()));
      CustomerBean.setCostofdrink(Integer.parseInt(costofdrink.getText()));
      CustomerBean.setCostofmeal(Integer.parseInt(mealtxt.getText()));
     CustomerBean.setCostoftea(Integer.parseInt(costoftea.getText()));
      CustomerBean.setDessertPrice(Integer.parseInt(dprice.getText()));
     CustomerBean.setTax(Integer.parseInt(tax.getText()));
     CustomerBean.setSubtotal(Integer.parseInt(subtotal.getText()));
     CustomerBean.setTotal(Integer.parseInt(total.getText()));*/
      Connection con=DbConnectionProvider.getDbCon();
      int status=0;
        String sql="insert into Record_customer_table(name,mobileno,email,cost_drink,cost_tea,cost_coffee,cost_dessert,tax,subtotal,total,cost_meal"
                + "values(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps;
    try {
         ps = con.prepareStatement(sql);
         ps.setString(1,cname.getText());
         ps.setString(2,cphone.getText());
         ps.setString(3,cemail.getText());
        ps.setInt(4,Integer.parseInt(costofdrink.getText()));
        ps.setInt(5,Integer.parseInt(costoftea.getText()));
        ps.setInt(6,Integer.parseInt(costofcoffee.getText()));
        ps.setInt(7,Integer.parseInt(dprice.getText()));
        ps.setInt(8,Integer.parseInt(tax.getText()));
        ps.setInt(9,Integer.parseInt(subtotal.getText()));
        ps.setInt(10,Integer.parseInt(total.getText()));
        ps.setInt(11,Integer.parseInt(mealtxt.getText()));
           status=ps.executeUpdate();
     
        if(status>0)
        {
            JOptionPane.showMessageDialog(null,"Success");
        }
  
    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
       
       

       
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     MakePdfFormat.pdfFormat();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
mealtxt.setText(" ");
costofcoffee.setText("");
costofdrink.setText("");
costoftea.setText("");
tax.setText("");
subtotal.setText("");
total.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
this.setVisible(false);
new Home().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Coffieetxt3;
    private javax.swing.JTextField Coffieetxt4;
    private javax.swing.JTextField Coffieetxt5;
    private javax.swing.JTextField Coffieetxt6;
    private javax.swing.JCheckBox Friescheckbox;
    private javax.swing.JCheckBox HamburgerCheckbox;
    private javax.swing.JTextField cemail;
    private javax.swing.JCheckBox cheesesandwichcheckbox;
    private javax.swing.JCheckBox chickenSandwichcheckbox;
    private javax.swing.JCheckBox chickensaladcheckbox;
    private javax.swing.JTextField cname;
    private javax.swing.JCheckBox cockchk;
    private javax.swing.JCheckBox cocochk;
    private javax.swing.JLabel coffeelabel1;
    private javax.swing.JLabel coffeelabel2;
    private javax.swing.JLabel coffeelabel3;
    private javax.swing.JLabel coffeelabel4;
    private javax.swing.JLabel coffeelabel5;
    private javax.swing.JLabel coffeelabel6;
    private javax.swing.JTextField coffeetxt1;
    private javax.swing.JCheckBox coffiechik2;
    private javax.swing.JCheckBox coffiechk;
    private javax.swing.JCheckBox coffiechk3;
    private javax.swing.JCheckBox coffiechk4;
    private javax.swing.JCheckBox coffiechk5;
    private javax.swing.JCheckBox coffiechk6;
    private javax.swing.JTextField coffieetxt2;
    private javax.swing.JTextField costofcoffee;
    private javax.swing.JTextField costofdrink;
    private javax.swing.JTextField costoftea;
    private javax.swing.JTextField cphone;
    private javax.swing.JComboBox<String> dessertcombo;
    private javax.swing.JTextField dprice;
    private javax.swing.JLabel drinklablel1;
    private javax.swing.JLabel drinklablel2;
    private javax.swing.JLabel drinklablel3;
    private javax.swing.JLabel drinklablel4;
    private javax.swing.JLabel drinklablel5;
    private javax.swing.JLabel drinklablel6;
    private javax.swing.JLabel drinklablel7;
    private javax.swing.JTextField drinktxt1;
    private javax.swing.JTextField drinktxt2;
    private javax.swing.JTextField drinktxt3;
    private javax.swing.JTextField drinktxt4;
    private javax.swing.JTextField drinktxt5;
    private javax.swing.JTextField drinktxt6;
    private javax.swing.JTextField drinktxt7;
    private javax.swing.JCheckBox fantachk;
    private javax.swing.JCheckBox fishsandwichcheckbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jtabledessert;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lbldessert;
    private javax.swing.JCheckBox mazachk;
    private javax.swing.JTextField mealtxt;
    private javax.swing.JCheckBox mountainChck;
    private javax.swing.JCheckBox onionringscheckbox;
    private javax.swing.JCheckBox pepsichk;
    private javax.swing.JCheckBox redbullchk;
    private javax.swing.JCheckBox saladcheckbox;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTextField tax;
    private javax.swing.JCheckBox tea1;
    private javax.swing.JCheckBox tea2;
    private javax.swing.JCheckBox tea3;
    private javax.swing.JCheckBox tea4;
    private javax.swing.JCheckBox tea5;
    private javax.swing.JCheckBox tea6;
    private javax.swing.JLabel tealabel1;
    private javax.swing.JLabel tealabel2;
    private javax.swing.JLabel tealabel3;
    private javax.swing.JLabel tealabel4;
    private javax.swing.JLabel tealabel5;
    private javax.swing.JLabel tealabel6;
    private javax.swing.JTextField teatxt1;
    private javax.swing.JTextField teatxt2;
    private javax.swing.JTextField teatxt3;
    private javax.swing.JTextField teatxt4;
    private javax.swing.JTextField teatxt5;
    private javax.swing.JTextField teatxt6;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextField txtdessert;
    // End of variables declaration//GEN-END:variables
}
