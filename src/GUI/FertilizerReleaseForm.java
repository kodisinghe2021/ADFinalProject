package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.DBConnection;

public class FertilizerReleaseForm extends javax.swing.JFrame {

    public FertilizerReleaseForm() {
        initComponents();
    }

    // save details
    public void saveD() {
        try {
            Connection c = DBConnection.getConnection();
            PreparedStatement save = c.prepareStatement("INSERT INTO `assignment-ad-db`.`fertilizerdistributes` (`famerID`, `distributeDate`, `quentity`) VALUES ('" + tfFarmerID.getText() + "', '" + tfDesDate.getText() + "', '" + tfQnt.getText() + "');");
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
        tfFarmerID = new javax.swing.JTextField();
        tfDesDate = new javax.swing.JTextField();
        tfQnt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        jLabel2.setBackground(new java.awt.Color(17, 48, 89));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Quentity");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, 30));

        jLabel3.setBackground(new java.awt.Color(17, 48, 89));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Destribution Date");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 30));

        tfFarmerID.setBackground(new java.awt.Color(10, 40, 80));
        tfFarmerID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfFarmerID.setForeground(new java.awt.Color(255, 255, 255));
        tfFarmerID.setBorder(null);
        tfFarmerID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfFarmerIDMouseClicked(evt);
            }
        });
        jPanel2.add(tfFarmerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 50, 230, 34));

        tfDesDate.setBackground(new java.awt.Color(10, 40, 80));
        tfDesDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDesDate.setForeground(new java.awt.Color(255, 255, 255));
        tfDesDate.setBorder(null);
        jPanel2.add(tfDesDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 90, 230, 34));

        tfQnt.setBackground(new java.awt.Color(10, 40, 80));
        tfQnt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfQnt.setForeground(new java.awt.Color(255, 255, 255));
        tfQnt.setBorder(null);
        jPanel2.add(tfQnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 130, 230, 34));

        jButton1.setBackground(new java.awt.Color(17, 48, 89));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.setBorder(null);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 130, 25));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Fertilizer Release ");
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
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 130, 25));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 430, 220));

        btnBack.setBackground(new java.awt.Color(17, 48, 89));
        btnBack.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfFarmerIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfFarmerIDMouseClicked

    }//GEN-LAST:event_tfFarmerIDMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveD();
        this.dispose();
        new FertilizerDistributionDEtails().setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new FertilizerDistributionDEtails().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(FertilizerReleaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FertilizerReleaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FertilizerReleaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FertilizerReleaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FertilizerReleaseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfDesDate;
    private javax.swing.JTextField tfFarmerID;
    private javax.swing.JTextField tfQnt;
    // End of variables declaration//GEN-END:variables
}
