/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Connection.MyConnection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Y2J_2
 */
public class TransactionLog extends javax.swing.JFrame {

    /**
     * Creates new form TransactionLog
     */
    public TransactionLog() {
        initComponents();
        
         BINDDATA("SELECT * FROM transactions");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        transactiontable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ReturnButton2 = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filterbox = new javax.swing.JComboBox<>();
        generatecsv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        transactiontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
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
        jScrollPane2.setViewportView(transactiontable);
        if (transactiontable.getColumnModel().getColumnCount() > 0) {
            transactiontable.getColumnModel().getColumn(0).setResizable(false);
            transactiontable.getColumnModel().getColumn(1).setResizable(false);
            transactiontable.getColumnModel().getColumn(2).setResizable(false);
            transactiontable.getColumnModel().getColumn(3).setResizable(false);
            transactiontable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Transaction Log");

        ReturnButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Return Button.png"))); // NOI18N
        ReturnButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnButton2MouseClicked(evt);
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

        searchtxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
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

        refresh.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Transaction ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Filter By:");

        filterbox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        filterbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Date", "Employee ID", "Type (Transfer)", "Type (Borrow)", "Type (Return)" }));
        filterbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterboxItemStateChanged(evt);
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
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search)
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(filterbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                .addComponent(generatecsv)
                .addGap(18, 18, 18)
                .addComponent(refresh)
                .addGap(38, 38, 38))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search)
                    .addComponent(refresh)
                    .addComponent(jLabel2)
                    .addComponent(filterbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generatecsv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void ReturnButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButton2MouseClicked
        Home H = new Home();
        H.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReturnButton2MouseClicked

    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtActionPerformed

    private void searchtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            String sql = "SELECT * FROM transactions WHERE transaction_id like '" + searchtxt.getText().trim() + "%';";
            BINDDATA(sql);
        }
    }//GEN-LAST:event_searchtxtKeyPressed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String sql = "SELECT * FROM transactions WHERE transaction_id like '" + searchtxt.getText().trim() + "%';";

        BINDDATA(sql);
    }//GEN-LAST:event_searchActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        String sql = "SELECT * FROM transactions";
        
        BINDDATA(sql);
    }//GEN-LAST:event_refreshActionPerformed

    private void filterboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterboxItemStateChanged
        String query = filterbox.getSelectedItem().toString();

        FILTER(query);
    }//GEN-LAST:event_filterboxItemStateChanged

    private void generatecsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatecsvActionPerformed
        Connection conn = MyConnection.getConnection();

        try{
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
                        String sql = "SELECT * FROM transactions";
                        Statement st = conn.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        
                        PrintWriter pw = new PrintWriter(new File(f.getSelectedFile()+ "\\" + csvfilename + ".csv"));

                        StringBuilder sb = new StringBuilder();

                            sb.append("Transaction ID");
                            sb.append(",");
                            sb.append("Date");
                            sb.append(",");
                            sb.append("Employee ID");
                            sb.append(",");
                            sb.append("Type");
                            sb.append(",");
                            sb.append("Process By");
                            sb.append("\r\n");
            
            
                        while(rs.next())
                        {
                            sb.append(rs.getInt("transaction_id"));
                            sb.append(",");
                            sb.append(rs.getString("date"));
                            sb.append(",");
                            sb.append(rs.getString("employee_id"));
                            sb.append(",");
                            sb.append(rs.getString("type"));
                            sb.append(",");
                            sb.append(rs.getString("process_by"));
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

    private void BINDDATA(String sql)
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
    
    private void FILTER(String query)
    {
        if(query.equals("Date"))
        {
            String sql = "SELECT * FROM transactions order by date ASC";

            BINDDATA(sql);
        }
        else if(query.equals("Employee ID"))
        {
            String sql = "SELECT * FROM transactions order by employee_id ASC";

            BINDDATA(sql);
        }
        else if(query.equals("Type (Transfer)"))
        {
            String sql = "SELECT * FROM transactions WHERE type = 'Transfer' order by type ASC";

            BINDDATA(sql);
        }
        else if(query.equals("Type (Borrow)"))
        {
            String sql = "SELECT * FROM transactions WHERE type = 'Borrow' order by type ASC";

            BINDDATA(sql);
        }
        else if(query.equals("Type (Return)"))
        {
            String sql = "SELECT * FROM transactions WHERE type = 'Return' order by type ASC";

            BINDDATA(sql);
        }
        else if(query.equals("None"))
        {
            String sql = "SELECT * FROM transactions order by transaction_id ASC";

            BINDDATA(sql);
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
            java.util.logging.Logger.getLogger(TransactionLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ReturnButton2;
    private javax.swing.JComboBox<String> filterbox;
    private javax.swing.JButton generatecsv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refresh;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JTable transactiontable;
    // End of variables declaration//GEN-END:variables
}
