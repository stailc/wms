/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;


import Connection.MyConnection;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Y2J_2
 */
public class Inventory extends javax.swing.JFrame {

    public int selectedRow;
    public String id;
    public File file;
    
    public Inventory() {
        initComponents();
        
        BINDDATA("SELECT * from items");
        
        
    }
    
    EditItem update = new EditItem();

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
        ReturnButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemtable = new javax.swing.JTable();
        filterbox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        additem = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        preview = new javax.swing.JLabel();
        edititem = new javax.swing.JButton();
        addcsv = new javax.swing.JButton();
        generatecsv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(330, 129));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INVENTORY");

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
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Item Name");

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
        jScrollPane1.setViewportView(itemtable);

        filterbox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        filterbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Location", "Color", "Control ID" }));
        filterbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterboxItemStateChanged(evt);
            }
        });
        filterbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterboxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Filter By:");

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

        additem.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        additem.setText("Add Item");
        additem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        delete.setText("Delete Item");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        preview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preview.setText("Image");
        preview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        preview.setPreferredSize(new java.awt.Dimension(300, 300));

        edititem.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        edititem.setText("Edit Item");
        edititem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edititemActionPerformed(evt);
            }
        });

        addcsv.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addcsv.setText("Add CSV");
        addcsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcsvActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search)
                        .addGap(231, 231, 231)
                        .addComponent(generatecsv)
                        .addGap(18, 18, 18)
                        .addComponent(addcsv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edititem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete)
                        .addGap(18, 18, 18)
                        .addComponent(additem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filterbox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(additem)
                            .addComponent(edititem)
                            .addComponent(delete)
                            .addComponent(addcsv)
                            .addComponent(generatecsv)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchtxt)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterbox))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMouseClicked
        Home_Staff HS = new Home_Staff();
        HS.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReturnButtonMouseClicked

    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed

    }//GEN-LAST:event_searchtxtActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String sql = "SELECT * FROM items WHERE item_name like '" + searchtxt.getText().trim() + "%';";

        BINDDATA(sql);
    }//GEN-LAST:event_searchActionPerformed

    private void additemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemActionPerformed
        new AddItem().show();
        dispose();
    }//GEN-LAST:event_additemActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        DefaultTableModel table = (DefaultTableModel) itemtable.getModel();
        selectedRow = itemtable.getSelectedRow();
        
        this.id = table.getValueAt(selectedRow, 0).toString();
        
        int decision = JOptionPane.showConfirmDialog(null, "Are you sure?",null, JOptionPane.YES_NO_OPTION);
        if(decision == JOptionPane.YES_OPTION) 
        {
            try
            {

                String sql = "DELETE FROM items WHERE control_id = '" + this.id + "'";
                PreparedStatement ps = MyConnection.getConnection().prepareStatement(sql);
                ps.execute(sql);

                ps.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.toString());
            }

        BINDDATA("SELECT * from items");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void itemtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemtableMouseClicked
        preview.setText("");
        preview.setIcon(null);
        DefaultTableModel table = (DefaultTableModel) itemtable.getModel();
        selectedRow = itemtable.getSelectedRow();
        
        this.id = table.getValueAt(selectedRow, 0).toString();
          
        BINDIMAGE(id, 0);
        
        update.idrow.setText(String.valueOf(this.id));
        
    }//GEN-LAST:event_itemtableMouseClicked

    private void searchtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
        String sql = "SELECT * FROM items WHERE item_name like '" + searchtxt.getText().trim() + "%';";

        BINDDATA(sql);
    }
    }//GEN-LAST:event_searchtxtKeyPressed

    private void filterboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterboxActionPerformed

    private void filterboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterboxItemStateChanged
        String query = filterbox.getSelectedItem().toString();

        FILTER(query);
    }//GEN-LAST:event_filterboxItemStateChanged

    private void edititemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edititemActionPerformed
        int index = itemtable.getSelectedRow();
        
        TableModel model = itemtable.getModel();
        
        String id = model.getValueAt(index, 0).toString();
        String itemname = model.getValueAt(index, 1).toString();
        String description = model.getValueAt(index, 2).toString();
        String color = model.getValueAt(index, 3).toString();
        String quantity = model.getValueAt(index, 4).toString();
        String location = model.getValueAt(index, 5).toString();
        String serial = model.getValueAt(index, 6).toString();
        String accountability = model.getValueAt(index, 7).toString();
        
        update.setVisible(true);
        update.pack();
        update.setLocationRelativeTo(null);
        update.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
        update.controlidtxt.setText(id);
        update.itemtxt.setText(itemname);
        update.descriptiontxt.setText(description);
        update.colortxt.setText(color);
        update.quantitytxt.setText(quantity);
        update.locationtxt.setText(location);
        update.serialtxt.setText(serial);
        update.acctxt.setText(accountability);
        
        BINDIMAGE(id, 1);
        
        dispose();
    }//GEN-LAST:event_edititemActionPerformed

    private void addcsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcsvActionPerformed
        JFileChooser chooser = new JFileChooser("C:\\Users\\Y2J_2\\Downloads\\CSV");
        chooser.setPreferredSize(new Dimension(500, 500));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV files (*csv)", "csv");
        chooser.setFileFilter(filter);
        
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        String filename = f.getAbsolutePath();
        
        try
        {
            
            Connection conn = MyConnection.getConnection();
            
            Statement st = conn.createStatement();

            String line = "";
            String insert_sql = "";
            
       
            BufferedReader br = new BufferedReader(new FileReader(filename));
            
            while((line = br.readLine()) != null)
            {
                String[] values = line.split(",");
                
                insert_sql = "INSERT INTO items (control_id, item_name, description, color, quantity, location, serial_no, accountability) "
                        + "VALUES('" + values[0] + "', '" + values[1] + "', '" + values[2] + "', '" + values[3] + "', " + values[4] 
                        + ", '" + values[5] + "', '" + values[6] + "', '" + values[7] + "');";
                
                System.out.println(values[0] + values[1] + values[2] + values[3] + values[4] + values[5] + values[6] + values[7]);
                st.execute(insert_sql);
            }
            
            
            insert_sql="";
            
            JOptionPane.showMessageDialog(null, "CSV File Successfully Added");
            
            BINDDATA("SELECT * from items");
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_addcsvActionPerformed

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
                        String sql = "SELECT * FROM items";
                        Statement st = conn.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        
                        PrintWriter pw = new PrintWriter(new File(f.getSelectedFile()+ "\\" + csvfilename + ".csv"));

                        StringBuilder sb = new StringBuilder();

                            sb.append("control_id");
                            sb.append(",");
                            sb.append("item_name");
                            sb.append(",");
                            sb.append("description");
                            sb.append(",");
                            sb.append("color");
                            sb.append(",");
                            sb.append("quantity");
                            sb.append(",");
                            sb.append("location");
                            sb.append(",");
                            sb.append("serial_no");
                            sb.append(",");
                            sb.append("accountability");
                            sb.append("\r\n");


                        while(rs.next())
                        {
                            sb.append(rs.getString("control_id"));
                            sb.append(",");
                            sb.append(rs.getString("item_name"));
                            sb.append(",");
                            sb.append(rs.getString("description"));
                            sb.append(",");
                            sb.append(rs.getString("color"));
                            sb.append(",");
                            sb.append(rs.getInt("quantity"));
                            sb.append(",");
                            sb.append(rs.getString("location"));
                            sb.append(",");
                            sb.append(rs.getString("serial_no"));
                            sb.append(",");
                            sb.append( rs.getString("accountability"));
                            sb.append("\r\n");
                        } 

                        st.close();

                        pw.write(sb.toString());
                        pw.close();
                        
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

    
    private void BINDIMAGE(String id, int x)
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
          
          if(x==0)
          {
            preview.setIcon(newImage);
          }
          else
          {
            update.preview.setIcon(newImage);
            update.img = img;
          }

        }
        st.close();
      }
      catch(Exception e){
      preview.setText("Photo Missing");

      }
    }
    
    private void FILTER(String query)
    {
        if(query.equals("Location"))
        {
            String sql = "SELECT * FROM items order by location ASC";

            BINDDATA(sql);
        }
        else if(query.equals("Color"))
        {
             String sql = "SELECT * FROM items order by color ASC ";

            BINDDATA(sql);
        }
        else if(query.equals("Control ID"))
        {
             String sql = "SELECT * FROM items order by control_id ASC";

            BINDDATA(sql);
        }
        else if(query.equals("None"))
        {
             String sql = "SELECT * FROM items";

            BINDDATA(sql);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ReturnButton;
    public javax.swing.JButton addcsv;
    private javax.swing.JButton additem;
    private javax.swing.JButton delete;
    public javax.swing.JButton edititem;
    private javax.swing.JComboBox<String> filterbox;
    public javax.swing.JButton generatecsv;
    public javax.swing.JTable itemtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel preview;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchtxt;
    // End of variables declaration//GEN-END:variables
}
