
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.DBConnection;

public class FaremerRegistration extends javax.swing.JFrame {

    public FaremerRegistration() {
        initComponents();
    }
 public void saveD() {
        try {
            Connection c = DBConnection.getConnection();
            PreparedStatement save = c.prepareStatement("INSERT INTO `assignment-ad-db`.`farmerdetails` (`farmerID`, `farmerName`, `contact`, `fertQnt`) "
                    + "VALUES ('"+tfFarmerId.getText()+"', '"+tfName.getText()+"', '"+tfContact.getText()+"', '"+tfFertQnt.getText()+"');");
            save.execute();
            save.close();
            JOptionPane.showMessageDialog(this, "All details saved", "Success", JOptionPane.INFORMATION_MESSAGE);
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
        tfFarmerId = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfContact = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        tfFertQnt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        jLabel1.setText("Farmer ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 30));

        jLabel2.setBackground(new java.awt.Color(17, 48, 89));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contact");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 30));

        jLabel3.setBackground(new java.awt.Color(17, 48, 89));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Farmer Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 30));

        tfFarmerId.setBackground(new java.awt.Color(10, 40, 80));
        tfFarmerId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfFarmerId.setForeground(new java.awt.Color(255, 255, 255));
        tfFarmerId.setBorder(null);
        jPanel2.add(tfFarmerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 259, 34));

        tfName.setBackground(new java.awt.Color(10, 40, 80));
        tfName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfName.setForeground(new java.awt.Color(255, 255, 255));
        tfName.setBorder(null);
        jPanel2.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 259, 34));

        tfContact.setBackground(new java.awt.Color(10, 40, 80));
        tfContact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfContact.setForeground(new java.awt.Color(255, 255, 255));
        tfContact.setBorder(null);
        jPanel2.add(tfContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 259, 34));

        jButton1.setBackground(new java.awt.Color(17, 48, 89));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.setBorder(null);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 130, 25));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Register Farmer");
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
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 130, 25));

        tfFertQnt.setBackground(new java.awt.Color(10, 40, 80));
        tfFertQnt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfFertQnt.setForeground(new java.awt.Color(255, 255, 255));
        tfFertQnt.setBorder(null);
        jPanel2.add(tfFertQnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 259, 34));

        jLabel10.setBackground(new java.awt.Color(17, 48, 89));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("fertiliser Qnt");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 430, 260));

        jButton2.setBackground(new java.awt.Color(17, 48, 89));
        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back ");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
new FertilizerDistributionDEtails().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
saveD();
this.dispose();
new FertilizerDistributionDEtails().setVisible(true);
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
            java.util.logging.Logger.getLogger(FaremerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaremerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaremerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaremerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FaremerRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfContact;
    private javax.swing.JTextField tfFarmerId;
    private javax.swing.JTextField tfFertQnt;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
