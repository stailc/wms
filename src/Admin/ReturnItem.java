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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Y2J_2
 */
public class ReturnItem extends javax.swing.JFrame {

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
    public int transaction_borrow_id;

    public ReturnItem(String id) {
        initComponents();

        setdata();
        
        BINDDATA("SELECT * from transactions WHERE type = 'Borrow' AND employee_id  = '" + id + "' ORDER BY transaction_id DESC");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        transactiontable = new javax.swing.JTable();
        savebtn = new javax.swing.JButton();
        finishbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quantitytxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ReturnButton = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tdtable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        controltxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        locationtxt = new javax.swing.JTextField();
        tlabel = new javax.swing.JTextField();
        idlabel = new javax.swing.JTextField();
        namelabel = new javax.swing.JTextField();
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Quantity:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Name:");

        quantitytxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        quantitytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitytxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Employee ID:");

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RETURN ITEM");

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Transaction ID:");

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Location:");

        locationtxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        locationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationtxtActionPerformed(evt);
            }
        });

        tlabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tlabel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tlabel.setEnabled(false);
        tlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlabelActionPerformed(evt);
            }
        });

        idlabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        idlabel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        idlabel.setEnabled(false);
        idlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idlabelActionPerformed(evt);
            }
        });

        namelabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        namelabel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        namelabel.setEnabled(false);
        namelabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namelabelActionPerformed(evt);
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
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(savebtn)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(finishbtn)
                    .addComponent(itemnamelabel)
                    .addComponent(namelabel)
                    .addComponent(idlabel)
                    .addComponent(tlabel)
                    .addComponent(locationtxt)
                    .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(itemnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(controltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savebtn)
                            .addComponent(finishbtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(preview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
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
        EMPTYTRANSACTION();
        
        TransactionReturn TR = new TransactionReturn();
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReturnButtonMouseClicked

    private void quantitytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantitytxtActionPerformed

    private void finishbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishbtnActionPerformed
        EMPTYTRANSACTION();
        
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
        quantitytxt.setText("");
        itemnamelabel.setText("");
        
        this.id = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
        
        BINDDATA2("SELECT * FROM transactiondetails WHERE transaction_id = " + this.id + " ORDER BY transaction_id DESC");

    }//GEN-LAST:event_transactiontableMouseClicked

    private void controltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controltxtActionPerformed

    private void locationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationtxtActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
    try {

        PreparedStatement ps;
               
        String sql = "SELECT uom FROM transactiondetails WHERE transactiondetails_id = " + this.id;
        Statement st = MyConnection.getConnection().prepareStatement(sql); 
        ResultSet rs  = st.executeQuery(sql);
        
        rs.next();

        String uom = rs.getString("uom");
        String id = controltxt.getText();
        String remarks = "Item is returned";
        String quantity = quantitytxt.getText();
        String location = locationtxt.getText();
        String status = "Return";
        

        this.t_id = tlabel.getText();
        
        this.qty1 = Integer.parseInt(quantitytxt.getText());

        int new_rqty = this.RQTY - this.qty1;
  

        String register = "INSERT INTO `transactiondetails`(transaction_id, control_id, uom, quantity, remaining_quantity, remarks, location, status, transaction_borrow_id) VALUES "
        + "(?,?,?,?,?,?,?,?,?)";

            ps = MyConnection.getConnection().prepareStatement(register);
            ps.setInt(1, Integer.parseInt(this.t_id));
            ps.setString(2, id);
            ps.setString(3, uom);
            ps.setString(4, quantity);
            ps.setString(5, String.valueOf(new_rqty));
            ps.setString(6, remarks);
            ps.setString(7, location);
            ps.setString(8, status);
            ps.setInt(9, this.transaction_borrow_id);

            
            String pattern2 = "^[A-Za-z0-9\\s`~!@#$%^&*)(-=_+;:\"',.<>/?]{0,45}$";
            String pattern3 = "^[0-9]{0,10}$";
            
            Pattern patt2 = Pattern.compile(pattern2);
            Pattern patt3 = Pattern.compile(pattern3);
            
            Matcher match2 = patt3.matcher(quantitytxt.getText());
            Matcher match3 = patt2.matcher(locationtxt.getText());
            

            if(!match2.matches() || !match3.matches())
            {
                JOptionPane.showMessageDialog(null, "Invalid Input");
                return;
            }
            
            
                if(controltxt.getText().toString().length() == 0)
                {
                    JOptionPane.showMessageDialog(null, "Select a Item");     
                }
                else if(quantitytxt.getText().toString().length() == 0)
                {
                    JOptionPane.showMessageDialog(null, "Input Quantity");   
                }
                else if(locationtxt.getText().toString().length() == 0)
                {
                    JOptionPane.showMessageDialog(null, "Input Location");    
                }               
                else
                {
                    
                if(Integer.parseInt(quantity) <= this.RQTY && (this.RQTY > 0))
                    {    
                        updateqty();
                        
                        ps.execute();
                        JOptionPane.showMessageDialog(null, "Item Successfully Returned");

                        controltxt.setText("");
                        quantitytxt.setText("");
                        locationtxt.setText("");

                        ps.close();

                        BINDDATA2("SELECT * FROM transactiondetails WHERE transaction_id = " + this.id + " ORDER BY transaction_id DESC");
                        BINDDATA3("SELECT * FROM transactiondetails WHERE control_id = '" + this.control_id +
                    "' AND status = 'Return' AND transaction_borrow_id = "+ this.transaction_borrow_id +" ORDER BY transactiondetails_id DESC");
                    }
                else
                    {
                       JOptionPane.showMessageDialog(null, "The quantity should be less than or equal to " + this.RQTY);
                    }
                }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void tdtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdtableMouseClicked
        preview.setText("");
        itemnamelabel.setText("");
        controltxt.setText("");
        quantitytxt.setText("");
        
        DefaultTableModel table = (DefaultTableModel) tdtable.getModel();
        selectedRow2 = tdtable.getSelectedRow();

        this.control_id = table.getValueAt(selectedRow2, 2).toString();
        BINDIMAGE(control_id);

        this.transaction_borrow_id = Integer.parseInt(table.getValueAt(selectedRow2, 1).toString());
        
        BINDDATA3("SELECT * FROM transactiondetails WHERE control_id = '" + this.control_id +
                    "' AND status = 'Return' AND transaction_borrow_id = "+ this.transaction_borrow_id +" ORDER BY transactiondetails_id DESC");
        
        
        if(tdreturn.getRowCount() == 0)
        {
            itemnamelabel.setText("");
            controltxt.setText("");
            quantitytxt.setText("");

            controltxt.setText(this.control_id);
            setitem();
            this.qty = Integer.parseInt(table.getValueAt(selectedRow2, 4).toString());
            this.RQTY = Integer.parseInt(table.getValueAt(selectedRow2, 5).toString());
            quantitytxt.setText(String.valueOf(this.RQTY));
        }
        else
        {
            
        }

        this.td_id = Integer.parseInt(table.getValueAt(selectedRow2, 0).toString());

    }//GEN-LAST:event_tdtableMouseClicked

    private void tlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlabelActionPerformed

    private void idlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idlabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idlabelActionPerformed

    private void namelabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namelabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namelabelActionPerformed

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
            quantitytxt.setText("");

            
            controltxt.setText(this.control_id);
            setitem();
            this.qty = Integer.parseInt(table.getValueAt(selectedRow3, 4).toString());
            this.RQTY = Integer.parseInt(table.getValueAt(selectedRow3, 5).toString());
            quantitytxt.setText(String.valueOf(this.RQTY));
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
    
    public void updateqty()
    {
        try
        {   
            Connection conn = MyConnection.getConnection();
            
            String get = "SELECT remaining_quantity FROM transactiondetails WHERE transactiondetails_id = " + this.td_id;
            String get2 = "SELECT quantity FROM items WHERE control_id = '" + this.control_id + "'";
            Statement st2 = conn.prepareStatement(get2);
            ResultSet rs2 = st2.executeQuery(get2);
            rs2.next();
            
            int get_qty = rs2.getInt("quantity");
            //JOptionPane.showMessageDialog(null, "Item1: " + get_qty);
            Statement st = conn.prepareStatement(get);
            ResultSet rs = st.executeQuery(get);
            rs.next();
            
            String getqtytxt = quantitytxt.getText();
            //JOptionPane.showMessageDialog(null, "Item2: " + getqtytxt);
            int newqty = Integer.parseInt(getqtytxt) + get_qty;
            
            //JOptionPane.showMessageDialog(null, "Item3: " + newqty);
            
            String sql = "UPDATE items SET quantity = ? WHERE control_id = '" + this.control_id + "'";
            
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, newqty);

            ps.execute();
            
            ps.close();
            
            newqty = 0;
            

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void setitem()
    {
        try
        {
   
            String sql = "SELECT item_name FROM items WHERE control_id = '" + this.control_id + "'";
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
        String sql = "SELECT image FROM items WHERE control_id = '" + id + "'";
        
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
  
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnItem(employeeid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ReturnButton;
    private javax.swing.JTextField controltxt;
    private javax.swing.JButton finishbtn;
    public javax.swing.JTextField idlabel;
    public javax.swing.JTextField itemnamelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField locationtxt;
    public javax.swing.JTextField namelabel;
    private javax.swing.JLabel preview;
    private javax.swing.JTextField quantitytxt;
    private javax.swing.JButton savebtn;
    private javax.swing.JTable tdreturn;
    private javax.swing.JTable tdtable;
    private javax.swing.JTextField tlabel;
    private javax.swing.JTable transactiontable;
    // End of variables declaration//GEN-END:variables
}
