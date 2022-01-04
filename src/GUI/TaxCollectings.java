
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import util.DBConnection;

public class TaxCollectings extends javax.swing.JFrame {

    public TaxCollectings() {
        initComponents();
    }
//INSERT INTO `assignment-ad-db`.`taxcollectings` (`date`, `farmerName`, `farmerNIC`, `taxNumber`, `landArea`, `amount`) VALUES ('2021-12-19', 'salmal', '884937238v', 'ds2233', '400', '90000');

    //method for save data
     public void saveD() {
        try {
            Connection c = DBConnection.getConnection();//taxID, date, farmerName, farmerNIC, taxNumber, landArea, amount
            PreparedStatement save = c.prepareStatement("INSERT INTO taxcollectings (`date`, `farmerName`, `farmerNIC`, `taxNumber`, `landArea`, `amount`) "
                    + "VALUES ('"+tfDate.getText()+"','"+tfFermerName.getText()+"', '"+tfNIC.getText()+"', '"+tfTNumber.getText()+"', '"+tfLandArea.getText()+"', '"+tfTtlAmount.getText()+"')");
            save.execute();
            save.close();
            JOptionPane.showMessageDialog(this,"All data Saved","Success", JOptionPane.INFORMATION_MESSAGE);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        tfFermerName = new javax.swing.JTextField();
        tfNIC = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        tfTNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfLandArea = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfTtlAmount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 30));

        jLabel2.setBackground(new java.awt.Color(17, 48, 89));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NIC");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 30));

        jLabel3.setBackground(new java.awt.Color(17, 48, 89));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Farmer Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 30));

        tfDate.setBackground(new java.awt.Color(10, 40, 80));
        tfDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDate.setForeground(new java.awt.Color(255, 255, 255));
        tfDate.setBorder(null);
        tfDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfDateMouseClicked(evt);
            }
        });
        jPanel2.add(tfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 259, 34));

        tfFermerName.setBackground(new java.awt.Color(10, 40, 80));
        tfFermerName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfFermerName.setForeground(new java.awt.Color(255, 255, 255));
        tfFermerName.setBorder(null);
        jPanel2.add(tfFermerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 259, 34));

        tfNIC.setBackground(new java.awt.Color(10, 40, 80));
        tfNIC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfNIC.setForeground(new java.awt.Color(255, 255, 255));
        tfNIC.setBorder(null);
        jPanel2.add(tfNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 259, 34));

        jButton1.setBackground(new java.awt.Color(17, 48, 89));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.setBorder(null);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 130, 25));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tax Collectings");
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
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 130, 25));

        tfTNumber.setBackground(new java.awt.Color(10, 40, 80));
        tfTNumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfTNumber.setForeground(new java.awt.Color(255, 255, 255));
        tfTNumber.setBorder(null);
        jPanel2.add(tfTNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 259, 34));

        jLabel10.setBackground(new java.awt.Color(17, 48, 89));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Tax Number");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 30));

        tfLandArea.setBackground(new java.awt.Color(10, 40, 80));
        tfLandArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfLandArea.setForeground(new java.awt.Color(255, 255, 255));
        tfLandArea.setBorder(null);
        jPanel2.add(tfLandArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 259, 34));

        jLabel11.setBackground(new java.awt.Color(17, 48, 89));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Land Area");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, 30));

        tfTtlAmount.setBackground(new java.awt.Color(10, 40, 80));
        tfTtlAmount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfTtlAmount.setForeground(new java.awt.Color(255, 255, 255));
        tfTtlAmount.setBorder(null);
        jPanel2.add(tfTtlAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 259, 34));

        jLabel12.setBackground(new java.awt.Color(17, 48, 89));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Total Amount");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 430, 340));

        jButton2.setBackground(new java.awt.Color(17, 48, 89));
        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back To DashBoard");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
new MainForm().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDateMouseClicked
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        tfDate.setText(formatter.format(date));
    }//GEN-LAST:event_tfDateMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
saveD();
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(TaxCollectings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaxCollectings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaxCollectings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaxCollectings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaxCollectings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfFermerName;
    private javax.swing.JTextField tfLandArea;
    private javax.swing.JTextField tfNIC;
    private javax.swing.JTextField tfTNumber;
    private javax.swing.JTextField tfTtlAmount;
    // End of variables declaration//GEN-END:variables
}
