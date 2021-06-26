
package Admin;

import Connection.MyConnection;
import Login.LoginForm;
import java.awt.Dimension;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class EditItem extends javax.swing.JFrame {

    public int selectedRow;
    public SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss");
    public int photo_id;
    public String photo_name;
    public byte[] file;
    public boolean selectImage = false;
    public byte[] img;
    
    
    public EditItem() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        itemtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptiontxt = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        colortxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        quantitytxt = new javax.swing.JTextField();
        locationtxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        serialtxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        acctxt = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        controlidtxt = new javax.swing.JTextField();
        preview = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        idrow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Item Name:");

        itemtxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        itemtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemtxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Description:");

        descriptiontxt.setColumns(20);
        descriptiontxt.setRows(5);
        jScrollPane1.setViewportView(descriptiontxt);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Image:");

        upload.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        upload.setText("Upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Color:");

        colortxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        colortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colortxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Quantity:");

        quantitytxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        quantitytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitytxtActionPerformed(evt);
            }
        });

        locationtxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        locationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationtxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Location:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Serial No:");

        serialtxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        serialtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialtxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setText("Acountability:");

        acctxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        acctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acctxtActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Control ID:");

        controlidtxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        controlidtxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        controlidtxt.setEnabled(false);
        controlidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlidtxtActionPerformed(evt);
            }
        });

        preview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        preview.setPreferredSize(new java.awt.Dimension(300, 300));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(330, 129));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EDIT ITEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        idrow.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(acctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jLabel2))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(44, 44, 44)
                                                        .addComponent(jLabel6))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(jLabel7))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(23, 23, 23)
                                                        .addComponent(jLabel8)))
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(itemtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(colortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(serialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(controlidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(110, 110, 110)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(upload, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idrow, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel11))
                            .addComponent(controlidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel4))
                            .addComponent(upload))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(86, 86, 86)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(colortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(itemtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(acctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(save)
                            .addComponent(cancel))
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idrow, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemtxtActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        selectImage = true;
        
        JFileChooser chooser = new JFileChooser("C:\\Users\\Y2J_2\\Downloads\\Icons");
        chooser.setPreferredSize(new Dimension(500, 500));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp");
        chooser.setFileFilter(filter);

        chooser.showOpenDialog(null);

        preview.setText("");

        File f = chooser.getSelectedFile();
        preview.setIcon(new ImageIcon(f.toString()));

        String filename = f.getAbsolutePath();

        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            byte[] buf = new byte[1024];
            for(int readNum; (readNum=fis.read(buf)) !=-1;)
            {
                bos.write(buf,0,readNum);
            }

            file = bos.toByteArray();

        }
        catch(IOException e){JOptionPane.showMessageDialog(null, "Error establishing connection!!!"  + e.toString());}
    }//GEN-LAST:event_uploadActionPerformed

    private void colortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colortxtActionPerformed

    private void quantitytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantitytxtActionPerformed

    private void locationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationtxtActionPerformed

    private void serialtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialtxtActionPerformed

    private void acctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acctxtActionPerformed
    
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        int id = Integer.valueOf(idrow.getText()).intValue();

        String itemname = itemtxt.getText();
        String description = descriptiontxt.getText();
        String color = colortxt.getText();
        String quantity = quantitytxt.getText();
        String location = locationtxt.getText();
        String serial = serialtxt.getText();
        String accountability = acctxt.getText();

        PreparedStatement ps;
        ResultSet rs;
        String register = "UPDATE items SET item_name =?, description=? , image=?, color=?, quantity=?, location=?, serial_no=?, accountability=? WHERE control_id =" + id;

        try {

            ps = MyConnection.getConnection().prepareStatement(register);

            ps.setString(1, itemname);
            ps.setString(2, description);
            //ps.setBytes(3, file);
            ps.setString(4, color);
            ps.setString(5, quantity);
            ps.setString(6, location);
            ps.setString(7, serial);
            ps.setString(8, accountability);
            
            if(selectImage == true)
            {
                ps.setBytes(3, file);
            }
            else
            {
                file = img;
                ps.setBytes(3, file);
            }
            
            String pattern1 = "^[A-Za-z]{0,29}$";
            String pattern2 = "^[A-Za-z0-9]{0,29}$";
            String pattern3 = "^[0-9]{0,29}$";
            String pattern4 = "^[A-Za-z0-9]{0,199}$";
            Pattern patt1 = Pattern.compile(pattern1);
            Pattern patt2 = Pattern.compile(pattern2);
            Pattern patt3 = Pattern.compile(pattern3);
            Pattern patt4 = Pattern.compile(pattern4);
            
            Matcher match2 = patt1.matcher(itemtxt.getText());
            Matcher match3 = patt4.matcher(descriptiontxt.getText());
            Matcher match4 = patt1.matcher(colortxt.getText());
            Matcher match5 = patt3.matcher(quantitytxt.getText());
            Matcher match6 = patt2.matcher(locationtxt.getText());
            Matcher match7 = patt2.matcher(serialtxt.getText());
            Matcher match8 = patt1.matcher(acctxt.getText());
            
            if(!match2.matches() || 
               !match3.matches() || 
               !match4.matches() || 
               !match5.matches() || 
               !match6.matches() || 
               !match7.matches() || 
               !match8.matches())
            {
                JOptionPane.showMessageDialog(null, "Invalid Input");
                return;
            }
            
            
            if(itemname.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input Item Name");
                return;
            }
            else if(description.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input Description");
                return;
            }
            else if(file == null)
            {
                JOptionPane.showMessageDialog(null, "Select a photo!");
                return;
            }
            
            else if(color.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input Color");
                return;
            }
            else if(quantity.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input Quantity");
                return;
            }
            else if(location.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input Location");
                return;
            }
            else if(serial.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input Serial No.");
                return;
            }
            else if(accountability.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input Accountability");
                return;
            }

            ps.execute();
            JOptionPane.showMessageDialog(null, "Item Successfully Updated");

            ps.close();

            //inv.BINDDATA("SELECT * from items");

            Inventory H = new Inventory();
            H.setVisible(true);
            dispose();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Inventory I = new Inventory();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void controlidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controlidtxtActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField acctxt;
    private javax.swing.JButton cancel;
    public javax.swing.JTextField colortxt;
    public javax.swing.JTextField controlidtxt;
    public javax.swing.JTextArea descriptiontxt;
    public javax.swing.JLabel idrow;
    public javax.swing.JTextField itemtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField locationtxt;
    public javax.swing.JLabel preview;
    public javax.swing.JTextField quantitytxt;
    private javax.swing.JButton save;
    public javax.swing.JTextField serialtxt;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
