package GUI;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import util.DBConnection;
import java.util.Date;

public class ItemBuyingForm extends javax.swing.JFrame {

    public ItemBuyingForm() {
        initComponents();
        getitemList();
    }
    //globle variables
    String id;
    String name;
    String buyingQnt;
    String sellingQnt;
    String availableQnt;
    String selected_material;

//constructor for getting selected item and available Qnt
    public ItemBuyingForm(String id, String name, String bq, String sq, String aq, String tableM) {
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

    // get item list from DB
    //and here all list will be add to the combo box
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

//method for update Material table, the material table will selected by user. 
    //selected material will send MaterialList.java form and there user will select the item
    // with selected item and, id,available Qnt, selling Qnt, will send this form
    // in this method calculate the new avalable quntity
    public void itemSave() {
        try {
            // calculate new avalable Quntity
            double ttlQnt = Double.parseDouble(tfQuntity.getText()) + Double.parseDouble(availableQnt);

            Connection c = DBConnection.getConnection();
            //create upadate
            PreparedStatement updateT = c.prepareStatement("UPDATE " + selected_material + " SET `bq` = '" + tfQuntity.getText() + "', `sq` = '" + sellingQnt + "', `aq` = '" + String.valueOf(ttlQnt) + "' WHERE (`id` = '" + id + "')");
            updateT.execute();
            updateT.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //method for send data to dailyexpences table
    //column of this table ~ payID, date, amount, description

    public void dailyexpences() {
        try {
            Connection c = DBConnection.getConnection();
            PreparedStatement save = c.prepareStatement("INSERT INTO `assignment-ad-db`.`dailyexpences` (`date`, `amount`, `description`) VALUES ('" + tfDate.getText() + "', '" + tfTotalPrice.getText() + "', '" + tfDescription.getText() + "')");
            save.execute();
            save.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateComponentFactory1 = new org.jdatepicker.JDateComponentFactory();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfTotalPrice = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        tfDescription = new javax.swing.JTextField();
        tfInvoice = new javax.swing.JTextField();
        tfQuntity = new javax.swing.JTextField();
        cmbxItem = new javax.swing.JComboBox<>();
        btnGoToTbl = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblSelectedItem = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblAvailQnt = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblMaterial = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(212, 228, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(17, 48, 89));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setAlignmentX(1.0F);
        jPanel2.setAlignmentY(1.0F);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(17, 48, 89));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Date");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 100, 30));

        jLabel2.setBackground(new java.awt.Color(17, 48, 89));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Invoice");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, 30));

        jLabel3.setBackground(new java.awt.Color(17, 48, 89));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Description");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, 30));

        jLabel4.setBackground(new java.awt.Color(17, 48, 89));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Quntity");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 30));

        jLabel5.setBackground(new java.awt.Color(17, 48, 89));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Total Price");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, 30));

        jLabel6.setBackground(new java.awt.Color(17, 48, 89));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Item");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 30));

        tfTotalPrice.setBackground(new java.awt.Color(10, 40, 80));
        tfTotalPrice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfTotalPrice.setForeground(new java.awt.Color(255, 255, 255));
        tfTotalPrice.setBorder(null);
        jPanel2.add(tfTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 259, 34));

        tfDate.setBackground(new java.awt.Color(10, 40, 80));
        tfDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDate.setForeground(new java.awt.Color(255, 255, 255));
        tfDate.setBorder(null);
        tfDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfDateMouseClicked(evt);
            }
        });
        jPanel2.add(tfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 259, 34));

        tfDescription.setBackground(new java.awt.Color(10, 40, 80));
        tfDescription.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDescription.setForeground(new java.awt.Color(255, 255, 255));
        tfDescription.setBorder(null);
        jPanel2.add(tfDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 259, 34));

        tfInvoice.setBackground(new java.awt.Color(10, 40, 80));
        tfInvoice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfInvoice.setForeground(new java.awt.Color(255, 255, 255));
        tfInvoice.setBorder(null);
        jPanel2.add(tfInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 259, 34));

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

        cmbxItem.setBackground(new java.awt.Color(17, 48, 89));
        cmbxItem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(cmbxItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 259, 34));

        btnGoToTbl.setBackground(new java.awt.Color(17, 48, 89));
        btnGoToTbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnGoToTbl.setForeground(new java.awt.Color(255, 255, 255));
        btnGoToTbl.setText("Get List");
        btnGoToTbl.setBorder(null);
        btnGoToTbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToTblActionPerformed(evt);
            }
        });
        jPanel2.add(btnGoToTbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 130, 25));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Item Buying");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

        btnSave.setBackground(new java.awt.Color(17, 48, 89));
        btnSave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 130, 25));

        btnClear.setBackground(new java.awt.Color(17, 48, 89));
        btnClear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.setBorder(null);
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 130, 25));

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
        jPanel2.add(lblSelectedItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 90, 30));

        jLabel9.setBackground(new java.awt.Color(17, 48, 89));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Selected item");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 30));

        lblAvailQnt.setBackground(new java.awt.Color(17, 48, 89));
        lblAvailQnt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAvailQnt.setForeground(new java.awt.Color(255, 255, 255));
        lblAvailQnt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAvailQnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        jPanel2.add(lblAvailQnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 120, 30));

        jLabel10.setBackground(new java.awt.Color(17, 48, 89));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Available Quntity");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 30));

        lblMaterial.setBackground(new java.awt.Color(17, 48, 89));
        lblMaterial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMaterial.setForeground(new java.awt.Color(255, 255, 255));
        lblMaterial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMaterial.setText(" ");
        lblMaterial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        lblMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaterialMouseClicked(evt);
            }
        });
        jPanel2.add(lblMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 90, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 430, 480));

        btnBack.setBackground(new java.awt.Color(17, 48, 89));
        btnBack.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back To DashBoard");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// back button
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new MainForm().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed
// save button
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        itemSave();
        dailyexpences();
        JOptionPane.showMessageDialog(this, "All details saved", "Success", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        new ItemBuyingForm().setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed
//after selecting material this method will pass that value to MaterialList(material) form
    private void btnGoToTblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToTblActionPerformed
        this.dispose();
        selected_material = cmbxItem.getSelectedItem().toString();
        new MaterialList(selected_material,0).setVisible(true);
    }//GEN-LAST:event_btnGoToTblActionPerformed

    private void lblSelectedItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectedItemMouseClicked

    }//GEN-LAST:event_lblSelectedItemMouseClicked
// when cliking text field current system date will display
    private void tfDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDateMouseClicked
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        tfDate.setText(formatter.format(date));
    }//GEN-LAST:event_tfDateMouseClicked

    private void lblMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaterialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMaterialMouseClicked

    private void tfQuntityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuntityKeyTyped

    }//GEN-LAST:event_tfQuntityKeyTyped

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
            java.util.logging.Logger.getLogger(ItemBuyingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemBuyingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemBuyingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemBuyingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemBuyingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGoToTbl;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbxItem;
    private org.jdatepicker.JDateComponentFactory jDateComponentFactory1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblAvailQnt;
    public javax.swing.JLabel lblMaterial;
    public javax.swing.JLabel lblSelectedItem;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfInvoice;
    private javax.swing.JTextField tfQuntity;
    private javax.swing.JTextField tfTotalPrice;
    // End of variables declaration//GEN-END:variables
}
