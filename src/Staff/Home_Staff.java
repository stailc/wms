package Staff;


import Connection.MyConnection;
import Login.LoginForm;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JPanel;

public class Home_Staff extends javax.swing.JFrame {

    public Home_Staff() {
        initComponents();
        
        
        resetColor(AddItemPanel);
        resetColor(LogoutPanel);
        resetColor(ItemsPanel);
        resetColor(TransferItemPanel);
        resetColor(BorrowItemPanel);
        resetColor(ReturnItemPanel);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        DisplayUserLogin = new javax.swing.JLabel();
        ItemsPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        ItemsIcon = new javax.swing.JLabel();
        LogoutPanel = new javax.swing.JPanel();
        LogoutIcon = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        AddItemPanel = new javax.swing.JPanel();
        AddItemIcon = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        TransferItemPanel = new javax.swing.JPanel();
        TransferItemIcon = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        BorrowItemPanel = new javax.swing.JPanel();
        BorrowItemIcon = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ReturnItemPanel = new javax.swing.JPanel();
        ReturnItemIcon = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setMaximumSize(new java.awt.Dimension(900, 600));
        MainPanel.setMinimumSize(new java.awt.Dimension(900, 600));
        MainPanel.setPreferredSize(new java.awt.Dimension(900, 600));
        MainPanel.setVerifyInputWhenFocusTarget(false);
        MainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MainPanelMouseEntered(evt);
            }
        });

        HeaderPanel.setBackground(new java.awt.Color(255, 102, 0));
        HeaderPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderPanelMouseDragged(evt);
            }
        });
        HeaderPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderPanelMousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Warehouse Management System");

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Los Baños Centtromall");

        DisplayUserLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DisplayUserLogin.setForeground(new java.awt.Color(255, 255, 255));
        DisplayUserLogin.setText("Logged In as: Staff");
        DisplayUserLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(DisplayUserLogin)
                        .addGap(46, 46, 46))))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DisplayUserLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        ItemsPanel.setBackground(java.awt.SystemColor.controlHighlight);
        ItemsPanel.setMaximumSize(new java.awt.Dimension(140, 120));
        ItemsPanel.setMinimumSize(new java.awt.Dimension(140, 120));
        ItemsPanel.setPreferredSize(new java.awt.Dimension(140, 120));
        ItemsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ItemsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ItemsPanelMouseExited(evt);
            }
        });
        ItemsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 102, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Inventory");
        ItemsPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 140, -1));

        ItemsIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ItemsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Inventory.png"))); // NOI18N
        ItemsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ItemsIconMouseEntered(evt);
            }
        });
        ItemsPanel.add(ItemsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, 116, -1));

        LogoutPanel.setBackground(java.awt.SystemColor.controlHighlight);
        LogoutPanel.setMaximumSize(new java.awt.Dimension(140, 120));
        LogoutPanel.setMinimumSize(new java.awt.Dimension(140, 120));
        LogoutPanel.setPreferredSize(new java.awt.Dimension(140, 120));
        LogoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutPanelMouseExited(evt);
            }
        });
        LogoutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoutIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Logout.png"))); // NOI18N
        LogoutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutIconMouseEntered(evt);
            }
        });
        LogoutPanel.add(LogoutIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, 116, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 102, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Logout");
        LogoutPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 140, -1));

        AddItemPanel.setBackground(java.awt.SystemColor.controlHighlight);
        AddItemPanel.setMaximumSize(new java.awt.Dimension(140, 120));
        AddItemPanel.setMinimumSize(new java.awt.Dimension(140, 120));
        AddItemPanel.setPreferredSize(new java.awt.Dimension(140, 120));
        AddItemPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddItemPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddItemPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddItemPanelMouseExited(evt);
            }
        });
        AddItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddItemIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddItemIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add Item.png"))); // NOI18N
        AddItemIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddItemIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddItemIconMouseEntered(evt);
            }
        });
        AddItemPanel.add(AddItemIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, 116, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 102, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Add Item");
        AddItemPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 140, -1));

        TransferItemPanel.setBackground(java.awt.SystemColor.controlHighlight);
        TransferItemPanel.setMaximumSize(new java.awt.Dimension(140, 120));
        TransferItemPanel.setMinimumSize(new java.awt.Dimension(140, 120));
        TransferItemPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransferItemPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TransferItemPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TransferItemPanelMouseExited(evt);
            }
        });
        TransferItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransferItemIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TransferItemIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Transfer Item.png"))); // NOI18N
        TransferItemIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransferItemIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TransferItemIconMouseEntered(evt);
            }
        });
        TransferItemPanel.add(TransferItemIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, 116, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 102, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Transfer Item");
        TransferItemPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 140, -1));

        BorrowItemPanel.setBackground(java.awt.SystemColor.controlHighlight);
        BorrowItemPanel.setMaximumSize(new java.awt.Dimension(140, 120));
        BorrowItemPanel.setMinimumSize(new java.awt.Dimension(140, 120));
        BorrowItemPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowItemPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BorrowItemPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BorrowItemPanelMouseExited(evt);
            }
        });
        BorrowItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BorrowItemIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrowItemIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Borrow Item.png"))); // NOI18N
        BorrowItemIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowItemIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BorrowItemIconMouseEntered(evt);
            }
        });
        BorrowItemPanel.add(BorrowItemIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, 116, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 102, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Borrow Item");
        BorrowItemPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 140, -1));

        ReturnItemPanel.setBackground(java.awt.SystemColor.controlHighlight);
        ReturnItemPanel.setMaximumSize(new java.awt.Dimension(140, 120));
        ReturnItemPanel.setMinimumSize(new java.awt.Dimension(140, 120));
        ReturnItemPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnItemPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReturnItemPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReturnItemPanelMouseExited(evt);
            }
        });
        ReturnItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReturnItemIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReturnItemIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Return Item.png"))); // NOI18N
        ReturnItemIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnItemIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReturnItemIconMouseEntered(evt);
            }
        });
        ReturnItemPanel.add(ReturnItemIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, 116, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 102, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Return Item");
        ReturnItemPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 140, -1));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(BorrowItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(ReturnItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LogoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(ItemsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(AddItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(TransferItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ItemsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TransferItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ReturnItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BorrowItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(918, 747));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddItemPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemPanelMouseExited
        resetColor(AddItemPanel);
    }//GEN-LAST:event_AddItemPanelMouseExited

    private void AddItemPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemPanelMouseEntered
        setColor(AddItemPanel);
    }//GEN-LAST:event_AddItemPanelMouseEntered

    private void AddItemIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemIconMouseEntered
        setColor(AddItemPanel);
    }//GEN-LAST:event_AddItemIconMouseEntered

    private void AddItemIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemIconMouseClicked
        new AddItem().show();
        dispose();
    }//GEN-LAST:event_AddItemIconMouseClicked

    private void LogoutPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutPanelMouseExited
        resetColor(LogoutPanel);
    }//GEN-LAST:event_LogoutPanelMouseExited

    private void LogoutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutPanelMouseEntered
        setColor(LogoutPanel);
    }//GEN-LAST:event_LogoutPanelMouseEntered

    private void LogoutIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutIconMouseEntered
        setColor(LogoutPanel);
    }//GEN-LAST:event_LogoutIconMouseEntered

    private void LogoutIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutIconMouseClicked
        new LoginForm().show();
        dispose();
    }//GEN-LAST:event_LogoutIconMouseClicked

    private void ItemsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsPanelMouseExited
        resetColor(ItemsPanel);
    }//GEN-LAST:event_ItemsPanelMouseExited

    private void ItemsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsPanelMouseEntered
        setColor(ItemsPanel);
    }//GEN-LAST:event_ItemsPanelMouseEntered

    private void ItemsIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsIconMouseEntered
        setColor(ItemsPanel);
    }//GEN-LAST:event_ItemsIconMouseEntered

    private void ItemsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsIconMouseClicked
        new Inventory().show();
        dispose();
    }//GEN-LAST:event_ItemsIconMouseClicked

    private void TransferItemIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransferItemIconMouseClicked
        new TransactionTransfer().show();
        dispose();
    }//GEN-LAST:event_TransferItemIconMouseClicked

    private void TransferItemIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransferItemIconMouseEntered
        setColor(TransferItemPanel);
    }//GEN-LAST:event_TransferItemIconMouseEntered

    private void TransferItemPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransferItemPanelMouseEntered
        setColor(TransferItemPanel);
    }//GEN-LAST:event_TransferItemPanelMouseEntered

    private void TransferItemPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransferItemPanelMouseExited
        resetColor(TransferItemPanel);
    }//GEN-LAST:event_TransferItemPanelMouseExited

    private void BorrowItemIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowItemIconMouseClicked
        new TransactionBorrow().show();
        dispose();
    }//GEN-LAST:event_BorrowItemIconMouseClicked

    private void BorrowItemIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowItemIconMouseEntered
        setColor(BorrowItemPanel);
    }//GEN-LAST:event_BorrowItemIconMouseEntered

    private void BorrowItemPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowItemPanelMouseEntered
        setColor(BorrowItemPanel);
    }//GEN-LAST:event_BorrowItemPanelMouseEntered

    private void BorrowItemPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowItemPanelMouseExited
        resetColor(BorrowItemPanel);
    }//GEN-LAST:event_BorrowItemPanelMouseExited

    private void ReturnItemIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnItemIconMouseClicked
        new TransactionReturn().show();
        dispose();
    }//GEN-LAST:event_ReturnItemIconMouseClicked

    private void ReturnItemIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnItemIconMouseEntered
        setColor(ReturnItemPanel);
    }//GEN-LAST:event_ReturnItemIconMouseEntered

    private void ReturnItemPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnItemPanelMouseEntered
        setColor(ReturnItemPanel);
    }//GEN-LAST:event_ReturnItemPanelMouseEntered

    private void ReturnItemPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnItemPanelMouseExited
        resetColor(ReturnItemPanel);
    }//GEN-LAST:event_ReturnItemPanelMouseExited

    private void HeaderPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMousePressed

    }//GEN-LAST:event_HeaderPanelMousePressed

    private void HeaderPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMouseDragged

    }//GEN-LAST:event_HeaderPanelMouseDragged

    private void MainPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseEntered
        resetColor(AddItemPanel);
        resetColor(LogoutPanel);
        resetColor(ItemsPanel);
        resetColor(TransferItemPanel);
        resetColor(BorrowItemPanel);
        resetColor(ReturnItemPanel);
    }//GEN-LAST:event_MainPanelMouseEntered

    private void ItemsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsPanelMouseClicked
        new Inventory().show();
        dispose();
    }//GEN-LAST:event_ItemsPanelMouseClicked

    private void AddItemPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemPanelMouseClicked
        new AddItem().show();
        dispose();
    }//GEN-LAST:event_AddItemPanelMouseClicked

    private void TransferItemPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransferItemPanelMouseClicked
        new TransactionTransfer().show();
        dispose();
    }//GEN-LAST:event_TransferItemPanelMouseClicked

    private void BorrowItemPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowItemPanelMouseClicked
        new TransactionBorrow().show();
        dispose();
    }//GEN-LAST:event_BorrowItemPanelMouseClicked

    private void ReturnItemPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnItemPanelMouseClicked
        new TransactionReturn().show();
        dispose();
    }//GEN-LAST:event_ReturnItemPanelMouseClicked

    private void LogoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutPanelMouseClicked
        new LoginForm().show();
        dispose();
    }//GEN-LAST:event_LogoutPanelMouseClicked

    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(197, 197, 197));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(240,240,240));
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home_Staff().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddItemIcon;
    private javax.swing.JPanel AddItemPanel;
    private javax.swing.JLabel BorrowItemIcon;
    private javax.swing.JPanel BorrowItemPanel;
    public javax.swing.JLabel DisplayUserLogin;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel ItemsIcon;
    private javax.swing.JPanel ItemsPanel;
    private javax.swing.JLabel LogoutIcon;
    private javax.swing.JPanel LogoutPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel ReturnItemIcon;
    private javax.swing.JPanel ReturnItemPanel;
    private javax.swing.JLabel TransferItemIcon;
    private javax.swing.JPanel TransferItemPanel;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel32;
    // End of variables declaration//GEN-END:variables

    
}
