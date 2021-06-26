
package Admin;

import Connection.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Y2J_2
 */
public class AddEmployee extends javax.swing.JFrame {

    private static final String PATTERN_1 = "^[A-Za-z]{0,29}$";
    private static final String PATTERN_2 = "^[A-Za-z]{0,29}$";
/*    private static final String PATTERN_3 = "^[A-Za-z0-9]{0,29}$";*/

    private static final Pattern patt1 = Pattern.compile(PATTERN_1);
    private static final Pattern patt2 = Pattern.compile(PATTERN_2);

    public AddEmployee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        firstnametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        middlenametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastnametxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        genderbox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        companynametxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        departmenttxt = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        bdatetxt = new com.toedter.calendar.JDateChooser();
        employeeidtxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(330, 129));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADD EMPLOYEE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Employee ID:");

        firstnametxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        firstnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnametxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Middle Name:");

        middlenametxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        middlenametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlenametxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Last Name:");

        lastnametxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lastnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnametxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Gender");

        genderbox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderboxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Birthdate:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Company Name:");

        companynametxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        companynametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companynametxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Department");

        departmenttxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        departmenttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmenttxtActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        bdatetxt.setDateFormatString("yyyy-dd-MM");
        bdatetxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        employeeidtxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        employeeidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeidtxtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("First Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(genderbox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlenametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(save)
                        .addGap(18, 18, 18)
                        .addComponent(cancel)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(companynametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(departmenttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(bdatetxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(employeeidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(middlenametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(companynametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(departmenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(genderbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(bdatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(cancel))
                .addGap(40, 40, 40))
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

    private void firstnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnametxtActionPerformed

    private void middlenametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlenametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlenametxtActionPerformed

    private void lastnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnametxtActionPerformed

    private void companynametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companynametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companynametxtActionPerformed

    private void departmenttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmenttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmenttxtActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        java.sql.Date sqldate = null;
        
        if(Optional.ofNullable(bdatetxt.getDate()).isPresent()){
            sqldate = new java.sql.Date(bdatetxt.getDate().getTime());
        }
        
        String id = employeeidtxt.getText();
        String fname = firstnametxt.getText();
        String mname = middlenametxt.getText();
        String lname = lastnametxt.getText();
        String birthdate = String.valueOf(sqldate);
        String gender = genderbox.getSelectedItem().toString();
        String companyname = companynametxt.getText();
        String department = departmenttxt.getText();
        
        
        String add = "INSERT INTO `employees`(employee_id, company_name, department, firstname, lastname, middlename, birthdate, gender) VALUES "
        + "(?,?,?,?,?,?,?,?)";

        try {
            Matcher match2 = getMatcherUsingPattern(employeeidtxt, patt2);
            Matcher match3 = getMatcherUsingPattern(firstnametxt, patt1);
            Matcher match4 = getMatcherUsingPattern(middlenametxt, patt1);
            Matcher match5 = getMatcherUsingPattern(lastnametxt, patt1);
            Matcher match6 = getMatcherUsingPattern(companynametxt, patt1);
            Matcher match7 = getMatcherUsingPattern(departmenttxt, patt1);

            if(anyInputIsInvalid(match2, match3, match4, match5, match6, match7))
            {
                JOptionPane.showMessageDialog(null, "Invalid Input");
                return;
            }

            if(id.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input Employee ID");
                return;
            }
            else if(companyname.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input Company Name");
                return;
            }
            else if(department.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input Department");
                return;
            }
            else if(fname.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input First Name");
                return;
            }
            else if(lname.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input Last Name");
                return;
            }
            else if(mname.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input Middle Name");
                return;
            }
            else if(sqldate == null)
            {
                JOptionPane.showMessageDialog(null, "Select a Birthdate");
                return;
            }

            PreparedStatement ps = MyConnection.getConnection().prepareStatement(add);
            
            ps.setString(1, id);
            ps.setString(2, companyname);
            ps.setString(3, department);
            ps.setString(4, fname);
            ps.setString(5, lname);
            ps.setString(6, mname);
            ps.setString(7, birthdate);
            ps.setString(8, gender);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Item Successfully Added");
            
            ps.close();
            
            Employees e = new Employees();
            e.setVisible(true);
            dispose();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }//GEN-LAST:event_saveActionPerformed

    private Matcher getMatcherUsingPattern(JTextField param, Pattern pattern){
        return pattern.matcher(param.getText());
    }

    private boolean anyInputIsInvalid(Matcher match2, Matcher match3, Matcher match4, Matcher match5, Matcher match6, Matcher match7){
        return (!match2.matches() ||
                !match3.matches() ||
                !match4.matches() ||
                !match5.matches() ||
                !match6.matches() ||
                !match7.matches()));
    }

    private void employeeidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeidtxtActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Employees e = new Employees();
        e.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void genderboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderboxActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser bdatetxt;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField companynametxt;
    private javax.swing.JTextField departmenttxt;
    private javax.swing.JTextField employeeidtxt;
    private javax.swing.JTextField firstnametxt;
    private javax.swing.JComboBox<String> genderbox;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField lastnametxt;
    private javax.swing.JTextField middlenametxt;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
