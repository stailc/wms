/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.text.SimpleDateFormat;
import java.util.*;
import Connection.MyConnection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Employees extends javax.swing.JFrame {

    public int selectedRow;
    public String id;
    
    public Employees() {
        initComponents();
        BINDDATA("SELECT * FROM employees");
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchtxt = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        addemployee = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ReturnButton2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeetable = new javax.swing.JTable();
        deleteemployee = new javax.swing.JButton();
        editemployee = new javax.swing.JButton();
        generatecsv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        searchtxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        searchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtActionPerformed(evt);
            }
        });
        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtxtKeyPressed(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        addemployee.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addemployee.setText("Add Employee");
        addemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addemployeeActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(330, 129));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EMPLOYEES");

        ReturnButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Return Button.png"))); // NOI18N
        ReturnButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReturnButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReturnButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Name");

        employeetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "First Name", "Middle Name", "Last Name", "Birth Date", "Gender", "Company Name", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeetable);

        deleteemployee.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        deleteemployee.setText("Delete Employee");
        deleteemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteemployeeActionPerformed(evt);
            }
        });

        editemployee.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        editemployee.setText("Edit Employee");
        editemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editemployeeActionPerformed(evt);
            }
        });

        generatecsv.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        generatecsv.setText("Generate CSV");
        generatecsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatecsvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(generatecsv)
                .addGap(18, 18, 18)
                .addComponent(editemployee)
                .addGap(18, 18, 18)
                .addComponent(deleteemployee)
                .addGap(18, 18, 18)
                .addComponent(addemployee)
                .addGap(31, 31, 31))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search)
                    .addComponent(addemployee)
                    .addComponent(deleteemployee)
                    .addComponent(editemployee)
                    .addComponent(generatecsv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String sql = "SELECT * FROM employees WHERE firstname like '" + searchtxt.getText().trim() + "%';";

        BINDDATA(sql);
    }//GEN-LAST:event_searchActionPerformed

    private void ReturnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMouseClicked
        Home H = new Home();
        H.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReturnButtonMouseClicked

    private void addemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addemployeeActionPerformed
        new AddEmployee().show();
        dispose();
    }//GEN-LAST:event_addemployeeActionPerformed

    private void employeetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeetableMouseClicked

        DefaultTableModel table = (DefaultTableModel) employeetable.getModel();
        selectedRow = employeetable.getSelectedRow();

        this.id = table.getValueAt(selectedRow, 0).toString();

        //update.idrow.setText(String.valueOf(this.id));
    }//GEN-LAST:event_employeetableMouseClicked

    private void searchtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            String sql = "SELECT * FROM employees WHERE firstname like '" + searchtxt.getText().trim() + "%';";

            BINDDATA(sql);
        }
    }//GEN-LAST:event_searchtxtKeyPressed

    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed

    }//GEN-LAST:event_searchtxtActionPerformed

    private void deleteemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteemployeeActionPerformed
        DefaultTableModel table = (DefaultTableModel) employeetable.getModel();
        selectedRow = employeetable.getSelectedRow();
        
        this.id = table.getValueAt(selectedRow, 0).toString();
        
        int decision = JOptionPane.showConfirmDialog(null, "Are you sure?",null, JOptionPane.YES_NO_OPTION);
        if(decision == JOptionPane.YES_OPTION) 
        {
        
        try{

            String sql = "DELETE FROM employees WHERE employee_id = " + this.id;
            PreparedStatement ps = MyConnection.getConnection().prepareStatement(sql);
            ps.execute(sql);

            ps.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        BINDDATA("SELECT * from employees");
        
        }
    }//GEN-LAST:event_deleteemployeeActionPerformed

    private void editemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editemployeeActionPerformed
       try
       {
        
        EditEmployee update = new EditEmployee();
        
        int index = employeetable.getSelectedRow();
        
        TableModel model = employeetable.getModel();

        String id = model.getValueAt(index, 0).toString();
        String fname = model.getValueAt(index, 1).toString();
        String mname = model.getValueAt(index, 2).toString();
        String lname = model.getValueAt(index, 3).toString();
        String bdate = model.getValueAt(index, 4).toString();
        String gender = model.getValueAt(index, 5).toString();
        String company = model.getValueAt(index, 6).toString();
        String department = model.getValueAt(index, 7).toString();
        
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(bdate);

        update.setVisible(true);
        update.pack();
        update.setLocationRelativeTo(null);
        update.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
        update.idrow.setText(id);
        
        update.firstnametxt.setText(fname);
        update.middlenametxt.setText(mname);
        update.lastnametxt.setText(lname);
        update.employeeidtxt.setText(id);
        update.companynametxt.setText(company);
        update.departmenttxt.setText(department);
        update.bdatetxt.setDate(date);
        
        if(gender == "Male")
        {
            update.genderbox.setSelectedIndex(0);
        }
        else if(gender == "Female")
        {
            update.genderbox.setSelectedIndex(1);
        }

        dispose();
        
       }
       catch(Exception e)
       {
           
       }
    }//GEN-LAST:event_editemployeeActionPerformed

    private void generatecsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatecsvActionPerformed
        Connection conn = MyConnection.getConnection();

        try {
            JFileChooser f = new JFileChooser();
            f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            f.setDialogTitle("Select Save Directory");
            f.showSaveDialog(null);
            
            if(f.getSelectedFile() == null)
            {
               return;
            }
            else
            {
                String csvfilename;
                csvfilename = JOptionPane.showInputDialog("Input CSV Filename");

                    if(csvfilename != null)
                    {
                        String sql = "SELECT * FROM employees";
                        Statement st = conn.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        
                        PrintWriter pw = new PrintWriter(new File(f.getSelectedFile()+ "\\" + csvfilename + ".csv"));

                        StringBuilder sb = new StringBuilder();

                            sb.append("Employee ID");
                            sb.append(",");
                            sb.append("Company Name");
                            sb.append(",");
                            sb.append("Department");
                            sb.append(",");
                            sb.append("First Name");
                            sb.append(",");
                            sb.append("Last Name");
                            sb.append(",");
                            sb.append("Middle Name");
                            sb.append(",");
                            sb.append("Birth Date");
                            sb.append(",");
                            sb.append("Gender");
                            sb.append("\r\n");
            
            
                        while(rs.next())
                        {
                            sb.append(rs.getString("employee_id"));
                            sb.append(",");
                            sb.append(rs.getString("company_name"));
                            sb.append(",");
                            sb.append(rs.getString("department"));
                            sb.append(",");
                            sb.append(rs.getString("firstname"));
                            sb.append(",");
                            sb.append(rs.getString("lastname"));
                            sb.append(",");
                            sb.append(rs.getString("middlename"));
                            sb.append(",");
                            sb.append(rs.getString("birthdate"));
                            sb.append(",");
                            sb.append( rs.getString("gender"));
                            sb.append("\r\n");
                        } 

                        st.close();

                        pw.write(sb.toString());
                        pw.close();
                        System.out.println("Done");
                        JOptionPane.showMessageDialog(null, "CSV File Successfully Generated \n"
                        + "File path: " + f.getSelectedFile() + "\\"+ csvfilename +".csv");

                    }
                    else
                    {
                       return;
                    }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_generatecsvActionPerformed

    public void BINDDATA(String sql)
    {
      try{
         
         Statement st = MyConnection.getConnection().createStatement();
         ResultSet rs = st.executeQuery(sql);
 
        
         DefaultTableModel table = (DefaultTableModel) employeetable.getModel();
         table.setRowCount(0);
            
            while(rs.next())
                {
                 Object obj[] = {rs.getString("employee_id"), rs.getString("firstname") ,rs.getString("middlename")
                         ,rs.getString("lastname"),rs.getString("birthdate") ,rs.getString("gender") 
                         ,rs.getString("company_name") ,rs.getString("department")};
                 table.addRow(obj);
                } 
            st.close();
      }
      catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }
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
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ReturnButton2;
    private javax.swing.JButton addemployee;
    private javax.swing.JButton deleteemployee;
    private javax.swing.JButton editemployee;
    public javax.swing.JTable employeetable;
    private javax.swing.JButton generatecsv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchtxt;
    // End of variables declaration//GEN-END:variables
}
