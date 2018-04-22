
package Dao;

import Bean.CustomerBean;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;

public class MakePdfFormat {
 public static void pdfFormat()
    {
      ResultSet rs=null;
        Document document=new Document();
        try {
               PdfWriter.getInstance(document,new FileOutputStream(new File("C:\\Users\\user\\Documents\\NetBeansProjects\\FastFoodBIllingSystem\\src\\Bill\\mukesh.pdf")));
               document.open();
             
                PdfPTable table1=new PdfPTable(2);
                  PdfPCell cell1=new PdfPCell(new Paragraph("Fast Food Billing System",FontFactory.getFont(FontFactory.TIMES_BOLD,22,Font.BOLD,BaseColor.RED)));
                cell1.setBorder(1);
                        cell1.setColspan(8);
                        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
                        cell1.setPadding(10.0f);
                  table1.addCell(cell1);
                  
                  document.add(table1);
                  
               document.add(new Paragraph("======================================================================"));
               rs=FetchCustomerDetail.fetchCustomer();
               try {
                    if(rs.next())
                    {
                        
                        PdfPTable table=new PdfPTable(2);
                        PdfPCell cell=new PdfPCell(new Paragraph("Bill"));
                        cell.setBorder(1);
                        cell.setColspan(8);
                        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                        cell.setPadding(10.0f);
                        table.addCell(cell);
                        table.addCell("CustomerName");
              
                        table.addCell(new Paragraph(rs.getString("name")));
                        table.addCell("Mobileno:");
                        table.addCell(new Paragraph(String.valueOf(rs.getString("mobileno"))));
                        table.addCell("Email:");
                        table.addCell(new Paragraph(String.valueOf(rs.getString("email"))));
                        table.addCell("Cost of Coffee");
                        table.addCell(new Paragraph(rs.getInt("cost_coffee")));
                        table.addCell("Cost of Tea");
                        table.addCell(new Paragraph(String.valueOf(rs.getInt("cost_tea"))));
                        table.addCell("Cost of Drink");
                        table.addCell(new Paragraph(String.valueOf(rs.getInt("cost_drink"))));
                         table.addCell("Cost of meal");
                        table.addCell(new Paragraph(String.valueOf(rs.getInt("cost_meal"))));
                         table.addCell("Tax");
                        table.addCell(new Paragraph(String.valueOf(rs.getInt("tax"))));
                          table.addCell("subtotal");
                        table.addCell(new Paragraph(String.valueOf(rs.getInt("subtotal"))));
                         table.addCell("total");
                        table.addCell(new Paragraph(String.valueOf(rs.getInt("total"))));
                        document.add(table);
                    }
                
            } catch (Exception e) {
            }
                  
       
               
               document.close();
            
        } catch (Exception e) {
        System.out.println(e);
        }
       
    }
}

    
    

