package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import util.DBConnection;

public class AddAuction extends javax.swing.JFrame {

    public AddAuction() {
        initComponents();
        getitemList();
    }
    //constructor for getting values

    public AddAuction(String id, String name, String bq, String sq, String aq, String tableM) {
        getitemList();
        initComponents();
        this.id = id;
        this.name = name;
        buyingQnt = bq;
        sellingQnt = sq;
        availableQnt = aq;
        selected_material = tableM;
        lblAvailQnt.setText(availableQnt);
        lblSelectedItem.setText(name);
    }

    //globle variables
    String id;
    String name;
    String buyingQnt;
    String sellingQnt;
    String availableQnt;
    String selected_material;

    // load item list to combo box
    public void getitemList() {
        try {
            Connection c = DBConnection.getConnection();
            PreparedStatement retriev = c.prepareStatement("SELECT * FROM materialtlist");
            ResultSet r = retriev.executeQuery();

            while (r.next()) {
                cmbxItem.addItem(r.getString("materialName"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
// save method

    public void saveD() {
        try {
            Connection c = DBConnection.getConnection();
            PreparedStatement save = c.prepareStatement("INSERT INTO `assignment-ad-db`.`auctiondt` (`sellingDate`, `qnt`, `material`, `item`, `currentPrice`, `sellingPrice`) "
                    + "VALUES ('" + tfDate.getText() + "', '" + tfQuntity.getText() + "', '" + selected_material + "', '" + name + "', '" + tfCurrentRate.getText() + "', '" + tfSellingRate.getText() + "');");
            save.execute();
            save.close();
            JOptionPane.showMessageDialog(this, "All details saved", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }
    }
    //method for update Material table, the material table will selected by user. 
    //selected material will send MaterialList.java form and there user will select the item
    // with selected item and, id,available Qnt, selling Qnt, will send this form
    // in this method calculate the new avalable quntity

    public void itemSave() {
        try {
            // calculate new avalable Quntity
            double ttlQnt = Double.parseDouble(availableQnt) - Double.parseDouble(tfQuntity.getText());
            Connection c = DBConnection.getConnection();
            //create upadate
            PreparedStatement updateT = c.prepareStatement("UPDATE " + selected_material + " SET `bq` = '" + buyingQnt + "', `sq` = '" + tfQuntity.getText() + "', `aq` = '" + String.valueOf(ttlQnt) + "' WHERE (`id` = '" + id + "')");
            updateT.execute();
            updateT.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfQuntity = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        tfCurrentRate = new javax.swing.JTextField();
        tfSellingRate = new javax.swing.JTextField();
        cmbxItem = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnGetList = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblSelectedItem = new javax.swing.JLabel();
        lblAvailQnt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(212, 228, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(17, 48, 89));
        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 25));

        jPanel2.setBackground(new java.awt.Color(17, 48, 89));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setAlignmentX(1.0F);
        jPanel2.setAlignmentY(1.0F);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(17, 48, 89));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Selling Date");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 100, 30));

        jLabel2.setBackground(new java.awt.Color(17, 48, 89));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Selling Rate");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, 30));

        jLabel3.setBackground(new java.awt.Color(17, 48, 89));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Current Rate");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, 30));

        jLabel5.setBackground(new java.awt.Color(17, 48, 89));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Quntity");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 30));

        jLabel6.setBackground(new java.awt.Color(17, 48, 89));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Item");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 30));

        tfQuntity.setBackground(new java.awt.Color(10, 40, 80));
        tfQuntity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfQuntity.setForeground(new java.awt.Color(255, 255, 255));
        tfQuntity.setBorder(null);
        tfQuntity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfQuntityKeyTyped(evt);
            }
        });
        jPanel2.add(tfQuntity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 259, 34));

        tfDate.setBackground(new java.awt.Color(10, 40, 80));
        tfDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDate.setForeground(new java.awt.Color(255, 255, 255));
        tfDate.setBorder(null);
        tfDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfDateMouseClicked(evt);
            }
        });
        tfDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDateActionPerformed(evt);
            }
        });
        jPanel2.add(tfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 259, 34));

        tfCurrentRate.setBackground(new java.awt.Color(10, 40, 80));
        tfCurrentRate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfCurrentRate.setForeground(new java.awt.Color(255, 255, 255));
        tfCurrentRate.setBorder(null);
        jPanel2.add(tfCurrentRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 259, 34));

        tfSellingRate.setBackground(new java.awt.Color(10, 40, 80));
        tfSellingRate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfSellingRate.setForeground(new java.awt.Color(255, 255, 255));
        tfSellingRate.setBorder(null);
        jPanel2.add(tfSellingRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 259, 34));

        cmbxItem.setBackground(new java.awt.Color(17, 48, 89));
        cmbxItem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(cmbxItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 259, 34));

        jButton1.setBackground(new java.awt.Color(17, 48, 89));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.setBorder(null);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 130, 25));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add New Auction");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 40));

        btnGetList.setBackground(new java.awt.Color(17, 48, 89));
        btnGetList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnGetList.setForeground(new java.awt.Color(255, 255, 255));
        btnGetList.setText("Get List");
        btnGetList.setBorder(null);
        btnGetList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetListActionPerformed(evt);
            }
        });
        jPanel2.add(btnGetList, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 130, 25));

        btnsave.setBackground(new java.awt.Color(17, 48, 89));
        btnsave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.setBorder(null);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 130, 25));

        jLabel10.setBackground(new java.awt.Color(17, 48, 89));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Selected item");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 30));

        lblSelectedItem.setBackground(new java.awt.Color(17, 48, 89));
        lblSelectedItem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSelectedItem.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectedItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSelectedItem.setText(" ");
        lblSelectedItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        lblSelectedItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSelectedItemMouseClicked(evt);
            }
        });
        jPanel2.add(lblSelectedItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, 30));

        lblAvailQnt.setBackground(new java.awt.Color(17, 48, 89));
        lblAvailQnt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAvailQnt.setForeground(new java.awt.Color(255, 255, 255));
        lblAvailQnt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAvailQnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        jPanel2.add(lblAvailQnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 120, 30));

        jLabel11.setBackground(new java.awt.Color(17, 48, 89));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Available Quntity");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 480, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new AuctionForm().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfQuntityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuntityKeyTyped

    }//GEN-LAST:event_tfQuntityKeyTyped

    private void tfDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDateMouseClicked

    }//GEN-LAST:event_tfDateMouseClicked

    private void tfDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDateActionPerformed

    private void btnGetListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetListActionPerformed
        this.dispose();
        selected_material = cmbxItem.getSelectedItem().toString();
        new MaterialList(selected_material, 2).setVisible(true);
    }//GEN-LAST:event_btnGetListActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        double a = Double.parseDouble(tfQuntity.getText());
        double b = Double.parseDouble(availableQnt);
        System.out.println(a + " " + b);
        if (a <= b) {
            itemSave();
            saveD();
            JOptionPane.showMessageDialog(this, "All details saved", "Success", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new AuctionForm().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "please enter Quentity below available", "Out of limit", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void lblSelectedItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectedItemMouseClicked

    }//GEN-LAST:event_lblSelectedItemMouseClicked

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
            java.util.logging.Logger.getLogger(AddAuction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAuction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAuction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAuction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAuction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetList;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> cmbxItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblAvailQnt;
    public javax.swing.JLabel lblSelectedItem;
    private javax.swing.JTextField tfCurrentRate;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfQuntity;
    private javax.swing.JTextField tfSellingRate;
    // End of variables declaration//GEN-END:variables
}
