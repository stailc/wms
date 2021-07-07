/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Y2J_2
 */
public class GenerateInventoryReport {
    
    public void GenerateINV()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbwms","root","");
            
            String reportPath = "C:\\Users\\Y2J_2\\Desktop\\IT\\JAVA\\Test Programs\\WMS\\src\\Reports\\InventoryReport.jrxml";
        
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer.viewReport(jp, false); 
            con.close();
            
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
}
