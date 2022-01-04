
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import util.DBConnection;

public class BillPayment extends javax.swing.JFrame {
    public BillPayment() {
        initComponents();
    }
//Bill payment save method
//INSERT INTO `assignment-ad-db`.`bill` (`recievingDate`, `month`, `billAmount`, `billCatogory`) VALUES ('2021-12-30', 'des', '1000', 'electricity');
public void saveBill() {
    
        try {
            Connection c = DBConnection.getConnection();
            PreparedStatement save = c.prepareStatement("INSERT INTO `assignment-ad-db`.`bill` (`recievingDate`, `month`, `billAmount`, `billCatogory`) "
                    + "VALUES ('"+tfRecDate.getText()+"', '"+cmbxMonth.getSelectedItem().toString()+"', '"+tfBillAmount.getText()+"', '"+cmbxBillCat.getSelectedItem().toString()+"')");
            save.execute();
            save.close();
            JOptionPane.showMessageDialog(this,"All details saved","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "error", JOptionPane.ERROR_MESSAGE);
        }
    }
//Document fee save method
public void saveDoc() {
    
        try {
            Connection c = DBConnection.getConnection();
            PreparedStatement save = c.prepareStatement("INSERT INTO `assignment-ad-db`.`documentfees` (`date`, `amount`) VALUES ('"+tfDateD.getText()+"', '"+tfBillAmountD.getText()+"')");
            save.execute();
            save.close();
            JOptionPane.showMessageDialog(this,"All details saved","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "error", JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Month = new javax.swing.JLabel();
        tfRecDate = new javax.swing.JTextField();
        tfBillAmount = new javax.swing.JTextField();
        cmbxBillCat = new javax.swing.JComboBox<>();
        cmbxMonth = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnSaveBill = new javax.swing.JButton();
        Month1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfDateD = new javax.swing.JTextField();
        tfBillAmountD = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnSaveD = new javax.swing.JButton();
        Month3 = new javax.swing.JLabel();

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
        jLabel1.setText("Recieving Date");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 30));

        jLabel4.setBackground(new java.awt.Color(17, 48, 89));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Bill Amount");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, 30));

        Month.setBackground(new java.awt.Color(17, 48, 89));
        Month.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Month.setForeground(new java.awt.Color(255, 255, 255));
        Month.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Month.setText("Bill Catogory");
        jPanel2.add(Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 30));

        tfRecDate.setBackground(new java.awt.Color(10, 40, 80));
        tfRecDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfRecDate.setForeground(new java.awt.Color(255, 255, 255));
        tfRecDate.setBorder(null);
        tfRecDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfRecDateMouseClicked(evt);
            }
        });
        jPanel2.add(tfRecDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 90, 259, 34));

        tfBillAmount.setBackground(new java.awt.Color(10, 40, 80));
        tfBillAmount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfBillAmount.setForeground(new java.awt.Color(255, 255, 255));
        tfBillAmount.setBorder(null);
        jPanel2.add(tfBillAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 259, 34));

        cmbxBillCat.setBackground(new java.awt.Color(17, 48, 89));
        cmbxBillCat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbxBillCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electricity Bill", "Water Bill" }));
        jPanel2.add(cmbxBillCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 259, 34));

        cmbxMonth.setBackground(new java.awt.Color(17, 48, 89));
        cmbxMonth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "Augest", "September", "Octobmer", "November", "Desember" }));
        jPanel2.add(cmbxMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 259, 34));

        jButton1.setBackground(new java.awt.Color(17, 48, 89));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.setBorder(null);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 130, 25));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bill Payment");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

        btnSaveBill.setBackground(new java.awt.Color(17, 48, 89));
        btnSaveBill.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSaveBill.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveBill.setText("Save");
        btnSaveBill.setBorder(null);
        btnSaveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveBillActionPerformed(evt);
            }
        });
        jPanel2.add(btnSaveBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 130, 25));

        Month1.setBackground(new java.awt.Color(17, 48, 89));
        Month1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Month1.setForeground(new java.awt.Color(255, 255, 255));
        Month1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Month1.setText("Month");
        jPanel2.add(Month1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 430, 310));

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

        jPanel3.setBackground(new java.awt.Color(17, 48, 89));
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));
        jPanel3.setAlignmentX(1.0F);
        jPanel3.setAlignmentY(1.0F);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(17, 48, 89));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Date");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 30));

        tfDateD.setBackground(new java.awt.Color(10, 40, 80));
        tfDateD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDateD.setForeground(new java.awt.Color(255, 255, 255));
        tfDateD.setBorder(null);
        tfDateD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfDateDMouseClicked(evt);
            }
        });
        jPanel3.add(tfDateD, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 90, 259, 34));

        tfBillAmountD.setBackground(new java.awt.Color(10, 40, 80));
        tfBillAmountD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfBillAmountD.setForeground(new java.awt.Color(255, 255, 255));
        tfBillAmountD.setBorder(null);
        jPanel3.add(tfBillAmountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 259, 34));

        jButton4.setBackground(new java.awt.Color(17, 48, 89));
        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.setBorder(null);
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 130, 25));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Document fee");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

        btnSaveD.setBackground(new java.awt.Color(17, 48, 89));
        btnSaveD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSaveD.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveD.setText("Save");
        btnSaveD.setBorder(null);
        btnSaveD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDActionPerformed(evt);
            }
        });
        jPanel3.add(btnSaveD, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 130, 25));

        Month3.setBackground(new java.awt.Color(17, 48, 89));
        Month3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Month3.setForeground(new java.awt.Color(255, 255, 255));
        Month3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Month3.setText("Bill Amount");
        jPanel3.add(Month3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
this.dispose();
new MainForm().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfRecDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfRecDateMouseClicked
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = new java.util.Date();
        tfRecDate.setText(formatter.format(date));
    }//GEN-LAST:event_tfRecDateMouseClicked

    private void tfDateDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDateDMouseClicked
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = new java.util.Date();
        tfDateD.setText(formatter.format(date));
    }//GEN-LAST:event_tfDateDMouseClicked

    private void btnSaveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveBillActionPerformed
saveBill();
this.dispose();
new BillPayment().setVisible(true);
    }//GEN-LAST:event_btnSaveBillActionPerformed

    private void btnSaveDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDActionPerformed
saveDoc();
this.dispose();
new BillPayment().setVisible(true);
    }//GEN-LAST:event_btnSaveDActionPerformed

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
            java.util.logging.Logger.getLogger(BillPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Month;
    private javax.swing.JLabel Month1;
    private javax.swing.JLabel Month3;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveBill;
    private javax.swing.JButton btnSaveD;
    private javax.swing.JComboBox<String> cmbxBillCat;
    private javax.swing.JComboBox<String> cmbxMonth;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tfBillAmount;
    private javax.swing.JTextField tfBillAmountD;
    private javax.swing.JTextField tfDateD;
    private javax.swing.JTextField tfRecDate;
    // End of variables declaration//GEN-END:variables
}
