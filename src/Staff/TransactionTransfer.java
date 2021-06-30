
package Staff;

import Connection.MyConnection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;



public class TransactionTransfer extends javax.swing.JFrame {

    
    public TransactionTransfer() {
        initComponents();
        
        addtolist();
        setdate();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        employeebox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        datelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Date:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Employee Id:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Name:");

        nametxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nametxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nametxt.setEnabled(false);
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        savebtn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        cancelbtn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        employeebox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        employeebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        employeebox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                employeeboxItemStateChanged(evt);
            }
        });
        employeebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeboxActionPerformed(evt);
            }
        });

        datelabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(savebtn)
                                .addGap(18, 18, 18)
                                .addComponent(cancelbtn))
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeebox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(118, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(datelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(datelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(employeebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn)
                    .addComponent(cancelbtn))
                .addGap(29, 29, 29))
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

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        TransferItem TI = new TransferItem();

        String id = employeebox.getSelectedItem().toString();
        String sql = "SELECT CONCAT(firstname,' ',lastname) 'Fullname' FROM employees WHERE employee_id = " + id;
        //String auto_id = "SELECT CONCAT(max(transaction_id)) 'id' FROM transactions";
      try{
         
         Statement ps = MyConnection.getConnection().prepareStatement(sql);
         ResultSet rs = ps.executeQuery(sql);

         rs.next();       
         TI.idlabel.setText(id);
         TI.namelabel.setText(rs.getString("Fullname"));

         ADDTOTRANSACTIONS();
         TI.setVisible(true);
         dispose();

         ps.close();
      }
      catch(Exception e){}  
    }//GEN-LAST:event_savebtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        Home_Staff HS = new Home_Staff();
        HS.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void employeeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeboxActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void employeeboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_employeeboxItemStateChanged
        String id = employeebox.getSelectedItem().toString();
        String sql = "SELECT CONCAT(firstname,' ',lastname) 'Fullname' FROM employees WHERE employee_id = " + id;
        
      try{
         
         Statement ps = MyConnection.getConnection().prepareStatement(sql);
         ResultSet rs = ps.executeQuery(sql);
  
         while(rs.next())
         {
            nametxt.setText(rs.getString("Fullname")); 
         }   
         
         ps.close();
      }
      catch(Exception e){}
    }//GEN-LAST:event_employeeboxItemStateChanged

    public void addtolist()
    {
        String sql = "SELECT * from employees";
        
      try{
         
         Statement ps = MyConnection.getConnection().prepareStatement(sql);
         ResultSet rs = ps.executeQuery(sql);
         
         while(rs.next())
         {
             employeebox.addItem(rs.getString("employee_id"));
             
         }

         ps.close();
      }
      catch(Exception e){}
    }
    
    public void setdate()
    {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        datelabel.setText(year + "-" + (month + 1) + "-" + day);
    }
    
    public void ADDTOTRANSACTIONS()
    {
        
        Connection conn = MyConnection.getConnection();
        
        try{

            String e_id = employeebox.getSelectedItem().toString();
            String name = nametxt.getText();
            String date = datelabel.getText();
            String type = "Transfer";
            
            String add = "INSERT INTO transactions (date, employee_id, type, process_by) VALUES(?,?,?,?)";

            PreparedStatement ps;
 
            ps = conn.prepareStatement(add);
            
            ps.setString(1, date);
            ps.setString(2, e_id);
            ps.setString(3, type);
            ps.setString(4, name);
            
            
            ps.execute();
            
          }
      catch(SQLException e){JOptionPane.showMessageDialog(null, e.toString());}
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionTransfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    public javax.swing.JLabel datelabel;
    private javax.swing.JComboBox<String> employeebox;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField nametxt;
    private javax.swing.JButton savebtn;
    // End of variables declaration//GEN-END:variables
}
