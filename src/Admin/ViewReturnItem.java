/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Connection.MyConnection;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Y2J_2
 */
public class ViewReturnItem extends javax.swing.JFrame {

    public int selectedRow;
    public int selectedRow2;
    public int selectedRow3;
    public int id;
    public String control_id;
    public int qty; 
    public int qty1;
    public String t_id;
    public int RQTY;
    public int td_id;
    public String employeeid;

    public ViewReturnItem() {
        initComponents();
        
        BINDDATA("SELECT * from transactions WHERE type = 'Borrow' ORDER BY transaction_id DESC");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        transactiontable = new javax.swing.JTable();
        finishbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ReturnButton = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tdtable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        controltxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        itemnamelabel = new javax.swing.JTextField();
        preview = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tdreturn = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        transactiontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Transaction ID", "Date", "Employee ID", "Type", "Process By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        transactiontable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactiontableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(transactiontable);
        if (transactiontable.getColumnModel().getColumnCount() > 0) {
            transactiontable.getColumnModel().getColumn(0).setResizable(false);
            transactiontable.getColumnModel().getColumn(1).setResizable(false);
            transactiontable.getColumnModel().getColumn(2).setResizable(false);
            transactiontable.getColumnModel().getColumn(2).setPreferredWidth(50);
            transactiontable.getColumnModel().getColumn(3).setResizable(false);
            transactiontable.getColumnModel().getColumn(3).setPreferredWidth(50);
            transactiontable.getColumnModel().getColumn(4).setResizable(false);
        }

        finishbtn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        finishbtn.setText("Finish");
        finishbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishbtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VIEW RETURN ITEM");

        ReturnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Return Button.png"))); // NOI18N
        ReturnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReturnButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReturnButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tdtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction Details ID", "Transaction ID", "Control ID", "UOM", "Quantity", "Remaining Quantity", "Remarks", "Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tdtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tdtable);
        if (tdtable.getColumnModel().getColumnCount() > 0) {
            tdtable.getColumnModel().getColumn(0).setResizable(false);
            tdtable.getColumnModel().getColumn(0).setPreferredWidth(120);
            tdtable.getColumnModel().getColumn(1).setResizable(false);
            tdtable.getColumnModel().getColumn(1).setPreferredWidth(100);
            tdtable.getColumnModel().getColumn(2).setResizable(false);
            tdtable.getColumnModel().getColumn(3).setResizable(false);
            tdtable.getColumnModel().getColumn(3).setPreferredWidth(30);
            tdtable.getColumnModel().getColumn(4).setResizable(false);
            tdtable.getColumnModel().getColumn(5).setResizable(false);
            tdtable.getColumnModel().getColumn(5).setPreferredWidth(120);
            tdtable.getColumnModel().getColumn(6).setResizable(false);
            tdtable.getColumnModel().getColumn(7).setResizable(false);
            tdtable.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Control No:");

        controltxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        controltxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        controltxt.setEnabled(false);
        controltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controltxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Item Name:");

        itemnamelabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        itemnamelabel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        itemnamelabel.setEnabled(false);
        itemnamelabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemnamelabelActionPerformed(evt);
            }
        });

        preview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preview.setText("Image");
        preview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        preview.setPreferredSize(new java.awt.Dimension(300, 300));

        tdreturn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction Details ID", "Transaction ID", "Control ID", "UOM", "Quantity", "Remaining Quantity", "Remarks", "Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tdreturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdreturnMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tdreturn);
        if (tdreturn.getColumnModel().getColumnCount() > 0) {
            tdreturn.getColumnModel().getColumn(0).setResizable(false);
            tdreturn.getColumnModel().getColumn(0).setPreferredWidth(120);
            tdreturn.getColumnModel().getColumn(1).setResizable(false);
            tdreturn.getColumnModel().getColumn(1).setPreferredWidth(100);
            tdreturn.getColumnModel().getColumn(2).setResizable(false);
            tdreturn.getColumnModel().getColumn(3).setResizable(false);
            tdreturn.getColumnModel().getColumn(3).setPreferredWidth(30);
            tdreturn.getColumnModel().getColumn(4).setResizable(false);
            tdreturn.getColumnModel().getColumn(5).setResizable(false);
            tdreturn.getColumnModel().getColumn(5).setPreferredWidth(120);
            tdreturn.getColumnModel().getColumn(6).setResizable(false);
            tdreturn.getColumnModel().getColumn(7).setResizable(false);
            tdreturn.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(itemnamelabel)
                                .addComponent(controltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(finishbtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(itemnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(controltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(finishbtn)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMouseClicked
        TransactionReturn TR = new TransactionReturn();
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReturnButtonMouseClicked

    private void finishbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishbtnActionPerformed
        Home H = new Home();
        H.setVisible(true);
        dispose();
    }//GEN-LAST:event_finishbtnActionPerformed

    private void transactiontableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactiontableMouseClicked
        preview.setIcon(null);
        preview.setText("Image");
        
        DefaultTableModel table = (DefaultTableModel) transactiontable.getModel();
        selectedRow = transactiontable.getSelectedRow();
        
        controltxt.setText("");
        
        itemnamelabel.setText("");
        
        this.id = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
        
        BINDDATA2("SELECT * FROM transactiondetails WHERE transaction_id = " + this.id + " ORDER BY transaction_id DESC");

    }//GEN-LAST:event_transactiontableMouseClicked

    private void controltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controltxtActionPerformed

    private void tdtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdtableMouseClicked
        preview.setText("");
        itemnamelabel.setText("");
        controltxt.setText("");
        
        DefaultTableModel table = (DefaultTableModel) tdtable.getModel();
        selectedRow2 = tdtable.getSelectedRow();

        this.control_id = table.getValueAt(selectedRow2, 2).toString();
        BINDIMAGE(control_id);
        
        BINDDATA3("SELECT * FROM transactiondetails WHERE control_id = " + this.control_id +
                    " AND status = 'Return' ORDER BY transactiondetails_id DESC");
        
        
        if(tdreturn.getRowCount() == 0)
        {
            itemnamelabel.setText("");
            controltxt.setText("");
            

            controltxt.setText(this.control_id);
            setitem();
            this.qty = Integer.parseInt(table.getValueAt(selectedRow2, 4).toString());
            this.RQTY = Integer.parseInt(table.getValueAt(selectedRow2, 5).toString());
            
        }
        else
        {
            
        }

        this.td_id = Integer.parseInt(table.getValueAt(selectedRow2, 0).toString());

    }//GEN-LAST:event_tdtableMouseClicked

    private void itemnamelabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemnamelabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemnamelabelActionPerformed

    private void tdreturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdreturnMouseClicked
        preview.setText("");
        itemnamelabel.setText("");
        controltxt.setText("");
        
        DefaultTableModel table = (DefaultTableModel) tdreturn.getModel();
        selectedRow3 = tdreturn.getSelectedRow();

        this.control_id = table.getValueAt(selectedRow3, 2).toString();
        BINDIMAGE(control_id);

        if(selectedRow3 == 0)
        {
            itemnamelabel.setText("");
            controltxt.setText("");

            controltxt.setText(this.control_id);
            setitem();
            this.qty = Integer.parseInt(table.getValueAt(selectedRow3, 4).toString());
            this.RQTY = Integer.parseInt(table.getValueAt(selectedRow3, 5).toString());
            
        }

        this.td_id = Integer.parseInt(table.getValueAt(selectedRow3, 0).toString());
    }//GEN-LAST:event_tdreturnMouseClicked

    public void BINDDATA(String sql)
    {
      try{
         
         Statement st = MyConnection.getConnection().createStatement();
         ResultSet rs = st.executeQuery(sql);
 
        
         DefaultTableModel table = (DefaultTableModel) transactiontable.getModel();
         table.setRowCount(0);
            
            while(rs.next())
                {
                 Object obj[] = {rs.getInt("transaction_id")
                                ,rs.getString("date") 
                                ,rs.getString("employee_id") 
                                ,rs.getString("type")
                                ,rs.getString("process_by")};
                 table.addRow(obj);
                } 
            st.close();
      }
      catch(Exception e){}
    }
    
    public void BINDDATA2(String sql)
    {
      try{
         
         Statement st = MyConnection.getConnection().createStatement();
         ResultSet rs = st.executeQuery(sql);
 
        
         DefaultTableModel table1 = (DefaultTableModel) tdtable.getModel();
         table1.setRowCount(0);
            
            while(rs.next())
                {
                 Object obj[] = {rs.getInt("transactiondetails_id")
                         ,rs.getInt("transaction_id")
                         ,rs.getString("control_id")
                         ,rs.getString("uom")
                         ,rs.getString("quantity")
                         ,rs.getString("remaining_quantity")
                         ,rs.getString("remarks") 
                         ,rs.getString("location") 
                         ,rs.getString("status")
                         };
                 table1.addRow(obj);
                } 
            st.close();
      }
      catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }
    
    public void BINDDATA3(String sql)
    {
      try{
         
         Statement st = MyConnection.getConnection().createStatement();
         ResultSet rs = st.executeQuery(sql);
 
        
         DefaultTableModel table1 = (DefaultTableModel) tdreturn.getModel();
         table1.setRowCount(0);
            
            while(rs.next())
                {
                 Object obj[] = {rs.getInt("transactiondetails_id")
                         ,rs.getInt("transaction_id")
                         ,rs.getString("control_id")
                         ,rs.getString("uom")
                         ,rs.getString("quantity")
                         ,rs.getString("remaining_quantity")
                         ,rs.getString("remarks") 
                         ,rs.getString("location") 
                         ,rs.getString("status")
                         };
                 table1.addRow(obj);
                } 
            st.close();
      }
      catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }

    public void setitem()
    {
        try
        {
   
            String sql = "SELECT item_name FROM items WHERE control_id = " + this.control_id;
            Statement st = MyConnection.getConnection().prepareStatement(sql); 
            ResultSet rs  = st.executeQuery(sql);

            rs.next();

            String itemname = rs.getString("item_name");
            
            itemnamelabel.setText(itemname);
  
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
      
    }
    
    private void BINDIMAGE(String id)
    {
            
      try{
       
        Statement st = MyConnection.getConnection().createStatement();
        String sql = "SELECT image FROM items WHERE control_id = " + id;
        
        ResultSet rs = st.executeQuery(sql);
        
        if(rs.next())
        {
          byte[] img = rs.getBytes("image");
          ImageIcon image = new ImageIcon(img);
          Image im = image.getImage();
          Image myImg = im.getScaledInstance(300, 250, Image.SCALE_SMOOTH );
          ImageIcon newImage = new ImageIcon(myImg);
          preview.setIcon(newImage);

        }
        st.close();
      }
      catch(Exception e){
      preview.setText("Photo Missing");
      }
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
            java.util.logging.Logger.getLogger(ViewReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReturnItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ReturnButton;
    private javax.swing.JTextField controltxt;
    private javax.swing.JButton finishbtn;
    public javax.swing.JTextField itemnamelabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel preview;
    private javax.swing.JTable tdreturn;
    private javax.swing.JTable tdtable;
    private javax.swing.JTable transactiontable;
    // End of variables declaration//GEN-END:variables
}
