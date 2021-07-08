/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Y2J_2
 */
public class TransferItem extends javax.swing.JFrame {

    private int qty; 
    public int selectedRow;
    public String id;
    public int transaction_id;
    public int ty_id;
    public TransferItem() {
        initComponents();
        
        BINDDATA("SELECT * from items");
        setdata();
        
        getid();
        
        this.transaction_id = Integer.parseInt(tlabel.getText());
        
        BINDDATA2("SELECT * FROM transactiondetails WHERE transaction_id = " + this.transaction_id);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        controltxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        uombox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        quantitytxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        locationtxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarkstxt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        borrowtable = new javax.swing.JTable();
        savebtn = new javax.swing.JButton();
        finishbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ReturnButton = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        itemtable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        tlabel = new javax.swing.JTextField();
        idlabel = new javax.swing.JTextField();
        namelabel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel3.setMinimumSize(new java.awt.Dimension(1373, 736));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Employee ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Name:");

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
        jLabel5.setText("UOM:");

        uombox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        uombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "mm", "cm", "m", "in", "ft", "yd", "mg", "g", "kg", "oz", "lb", "ton", "ml", "L", "gal", "qt", "pt", "Others" }));
        uombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uomboxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Quantity:");

        quantitytxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        quantitytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitytxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Location:");

        locationtxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        locationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationtxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Remarks:");

        remarkstxt.setColumns(20);
        remarkstxt.setRows(5);
        jScrollPane1.setViewportView(remarkstxt);

        borrowtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction Details ID", "Transaction ID", "Control ID", "UOM", "Quantity", "Remarks", "Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(borrowtable);
        if (borrowtable.getColumnModel().getColumnCount() > 0) {
            borrowtable.getColumnModel().getColumn(0).setResizable(false);
            borrowtable.getColumnModel().getColumn(0).setPreferredWidth(120);
            borrowtable.getColumnModel().getColumn(1).setResizable(false);
            borrowtable.getColumnModel().getColumn(2).setResizable(false);
            borrowtable.getColumnModel().getColumn(3).setResizable(false);
            borrowtable.getColumnModel().getColumn(4).setResizable(false);
            borrowtable.getColumnModel().getColumn(5).setResizable(false);
            borrowtable.getColumnModel().getColumn(6).setResizable(false);
            borrowtable.getColumnModel().getColumn(7).setResizable(false);
        }

        savebtn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

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
        jLabel3.setText("TRANSFER ITEM");

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

        itemtable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Control ID", "Item Name", "Description", "Color", "Quantity", "Location", "Serial No.", "Accountability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemtableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(itemtable);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Transaction ID:");

        tlabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tlabel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tlabel.setEnabled(false);

        idlabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        idlabel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        idlabel.setEnabled(false);

        namelabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        namelabel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        namelabel.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(savebtn)
                        .addGap(18, 18, 18)
                        .addComponent(finishbtn))
                    .addComponent(locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(idlabel)
                    .addComponent(namelabel)
                    .addComponent(controltxt)
                    .addComponent(uombox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(controltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel8)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savebtn)
                            .addComponent(finishbtn))
                        .addContainerGap(138, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1373, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMouseClicked
        EMPTYTRANSACTION();
        
        TransactionBorrow TB = new TransactionBorrow();
        TB.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReturnButtonMouseClicked

    private void uomboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uomboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uomboxActionPerformed

    private void quantitytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantitytxtActionPerformed

    private void locationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationtxtActionPerformed

    private void finishbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishbtnActionPerformed
        EMPTYTRANSACTION();
        
        Home H = new Home();
        H.setVisible(true);
        dispose();
    }//GEN-LAST:event_finishbtnActionPerformed

    private void itemtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemtableMouseClicked
        DefaultTableModel table = (DefaultTableModel) itemtable.getModel();
        selectedRow = itemtable.getSelectedRow();

        this.id = table.getValueAt(selectedRow, 0).toString();

        controltxt.setText(this.id);
        
        this.qty = Integer.parseInt(table.getValueAt(selectedRow, 4).toString());

    }//GEN-LAST:event_itemtableMouseClicked

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        String id = controltxt.getText();
        String uom = uombox.getSelectedItem().toString();
        String remarks = remarkstxt.getText();
        String quantity = quantitytxt.getText();
        String location = locationtxt.getText();
        String status = "Transfer";
        
        PreparedStatement ps;
        ResultSet rs;
        String register = "INSERT INTO `transactiondetails`(transaction_id, control_id, uom, quantity, remaining_quantity, remarks, location, status) VALUES(?,?,?,?,?,?,?,?)";
        
        try {

            ps = MyConnection.getConnection().prepareStatement(register);
            ps.setInt(1, this.ty_id);
            ps.setString(2, this.id);
            ps.setString(3, uom);
            ps.setString(4, quantity);
            ps.setString(5, quantity);
            ps.setString(6, remarks);
            ps.setString(7, location);
            ps.setString(8, status);
            
            String pattern1 = "^[A-Za-z0-9\\s`~!@#$%^&*)(-=_+;:\"',.<>/?]{0,200}$";
            String pattern2 = "^[A-Za-z0-9\\s`~!@#$%^&*)(-=_+;:\"',.<>/?]{0,45}$";
            String pattern3 = "^[0-9]{0,10}$";
            Pattern patt1 = Pattern.compile(pattern1);
            Pattern patt2 = Pattern.compile(pattern2);
            Pattern patt3 = Pattern.compile(pattern3);
            
            Matcher match2 = patt3.matcher(quantitytxt.getText());
            Matcher match3 = patt2.matcher(locationtxt.getText());
            Matcher match4 = patt1.matcher(remarkstxt.getText());

            if(!match2.matches() || 
               !match3.matches() || 
               !match4.matches())
            {
                JOptionPane.showMessageDialog(null, "Invalid Input");
                return;
            }

                if(controltxt.getText().toString().length() == 0)
                {
                    JOptionPane.showMessageDialog(null, "Select a Item");
                    
                }
                else if(uombox.getSelectedItem() == "None")
                {
                    JOptionPane.showMessageDialog(null, "Select a Unit of Measure");    
                }
                else if(quantitytxt.getText().toString().length() == 0)
                {
                    JOptionPane.showMessageDialog(null, "Input Quantity");
                    
                }
                else if(locationtxt.getText().toString().length() == 0)
                {
                    JOptionPane.showMessageDialog(null, "Input Location");
                    
                }
                else if(remarkstxt.getText().toString().length() == 0)
                {
                    JOptionPane.showMessageDialog(null, "Input Remarks");
                    
                }
                else
                {
                    
                if(Integer.parseInt(quantity) <= this.qty)
                    {   
                        
                        if(Integer.parseInt(quantity) != 0)
                        {
                        
                        int new_qty = this.qty - Integer.parseInt(quantity);
                        updateqty(new_qty);

                        ps.execute();
                        JOptionPane.showMessageDialog(null, "Item Successfully Added");

                        controltxt.setText("");
                        quantitytxt.setText("");
                        locationtxt.setText("");
                        remarkstxt.setText("");

                        ps.close();

                        BINDDATA("SELECT * from items");
                        BINDDATA2("SELECT * FROM transactiondetails WHERE transaction_id = " + this.transaction_id);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "The quantity should be not equal to 0");
                        }
                    }
                else
                    {
                       JOptionPane.showMessageDialog(null, "The quantity should be less than or equal to " + this.qty);
                    }
                }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void controltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controltxtActionPerformed

    public void BINDDATA(String sql)
    {
      try{
         
         Statement st = MyConnection.getConnection().createStatement();
         ResultSet rs = st.executeQuery(sql);
 
        
         DefaultTableModel table = (DefaultTableModel) itemtable.getModel();
         table.setRowCount(0);
            
            while(rs.next())
                {
                 Object obj[] = {rs.getString("control_id"), rs.getString("item_name") ,rs.getString("description") 
                         ,rs.getString("color") ,rs.getInt("quantity") ,rs.getString("location") 
                         ,rs.getString("serial_no") ,rs.getString("accountability")};
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
 
        
         DefaultTableModel table1 = (DefaultTableModel) borrowtable.getModel();
         table1.setRowCount(0);
            
            while(rs.next())
                {
                 Object obj[] = {rs.getInt("transactiondetails_id")
                                ,rs.getInt("transaction_id")
                                ,rs.getString("control_id")
                                ,rs.getString("uom") 
                                ,rs.getString("quantity") 
                                ,rs.getString("remarks") 
                                ,rs.getString("location") 
                                ,rs.getString("status")};
                 table1.addRow(obj);
                } 
            st.close();
      }
      catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }
    
    private void setdata()
    {
        try
        {
            
            String sql = "Select max(transaction_id) from transactions";
            Connection conn = MyConnection.getConnection();
            Statement s = conn.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            
             if(rs.next())
            {
                int id = rs.getInt(1);

                tlabel.setText(String.valueOf(id + 1));
                
            }
             
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    private void getid()
    {
        try
        {
            
            String sql = "Select MAX(transaction_id) from transactions";
            Connection conn = MyConnection.getConnection();
            Statement s = conn.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            
            if(rs.next())
            {
                int g_id = rs.getInt(1);
                this.ty_id = g_id + 1;

            }
             
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    public void updateqty(int new_qty)
    {
        try
        {
            String sql = "UPDATE items SET quantity = ? WHERE control_id = '" + this.id +"'";
            Connection conn = MyConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, new_qty);
            
            ps.execute();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void EMPTYTRANSACTION()
    {
        try
        {   
            Connection conn = MyConnection.getConnection();
            
            String sql = "DELETE FROM transactions WHERE transaction_id NOT IN (SELECT transaction_id FROM transactiondetails);";
            
            PreparedStatement ps = conn.prepareStatement(sql);
            
            String sql1 = "ALTER TABLE transactions AUTO_INCREMENT = 1;";
            
            PreparedStatement ps1 = conn.prepareStatement(sql1);

            ps.execute();
            ps1.execute();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
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
            java.util.logging.Logger.getLogger(TransferItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferItem().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ReturnButton;
    private javax.swing.JTable borrowtable;
    private javax.swing.JTextField controltxt;
    private javax.swing.JButton finishbtn;
    public javax.swing.JTextField idlabel;
    public javax.swing.JTable itemtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField locationtxt;
    public javax.swing.JTextField namelabel;
    private javax.swing.JTextField quantitytxt;
    private javax.swing.JTextArea remarkstxt;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField tlabel;
    private javax.swing.JComboBox<String> uombox;
    // End of variables declaration//GEN-END:variables
}
