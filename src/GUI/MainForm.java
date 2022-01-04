package GUI;

import com.sun.media.sound.AuFileReader;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnitemSelling = new javax.swing.JButton();
        btnRenting = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnTaxCollecting = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnItemBuying = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        btnDocfee = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnAllExpenditure = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRentingDetails = new javax.swing.JButton();
        btnTaxView = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnAuctionDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnSubsidizedDetails = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(212, 228, 244));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(17, 48, 89));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnitemSelling.setBackground(new java.awt.Color(15, 40, 70));
        btnitemSelling.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnitemSelling.setForeground(new java.awt.Color(204, 204, 255));
        btnitemSelling.setText("Item Selling");
        btnitemSelling.setBorder(null);
        btnitemSelling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnitemSellingActionPerformed(evt);
            }
        });
        jPanel4.add(btnitemSelling, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 86, 173, 35));

        btnRenting.setBackground(new java.awt.Color(15, 40, 70));
        btnRenting.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnRenting.setForeground(new java.awt.Color(204, 204, 255));
        btnRenting.setText("Renting");
        btnRenting.setToolTipText("");
        btnRenting.setBorder(null);
        btnRenting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentingActionPerformed(evt);
            }
        });
        jPanel4.add(btnRenting, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 154, 173, 35));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Revenue");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 12, -1, -1));

        btnTaxCollecting.setBackground(new java.awt.Color(15, 40, 70));
        btnTaxCollecting.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnTaxCollecting.setForeground(new java.awt.Color(204, 204, 255));
        btnTaxCollecting.setText("Tax Collecting");
        btnTaxCollecting.setBorder(null);
        btnTaxCollecting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxCollectingActionPerformed(evt);
            }
        });
        jPanel4.add(btnTaxCollecting, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 86, 173, 35));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 416, 230));

        jPanel5.setBackground(new java.awt.Color(17, 48, 89));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnItemBuying.setBackground(new java.awt.Color(15, 40, 70));
        btnItemBuying.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnItemBuying.setForeground(new java.awt.Color(204, 204, 255));
        btnItemBuying.setText("Item Buying");
        btnItemBuying.setBorder(null);
        btnItemBuying.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemBuyingActionPerformed(evt);
            }
        });
        jPanel5.add(btnItemBuying, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 78, 173, 35));

        btnBill.setBackground(new java.awt.Color(15, 40, 70));
        btnBill.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnBill.setForeground(new java.awt.Color(204, 204, 255));
        btnBill.setText("Electricity/water Bill");
        btnBill.setBorder(null);
        btnBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillActionPerformed(evt);
            }
        });
        jPanel5.add(btnBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 78, 173, 35));

        btnDocfee.setBackground(new java.awt.Color(15, 40, 70));
        btnDocfee.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnDocfee.setForeground(new java.awt.Color(204, 204, 255));
        btnDocfee.setText("Document Fee");
        btnDocfee.setToolTipText("");
        btnDocfee.setBorder(null);
        btnDocfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocfeeActionPerformed(evt);
            }
        });
        jPanel5.add(btnDocfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 146, 173, 35));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Expenditure");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 12, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 437, 230));

        jPanel6.setBackground(new java.awt.Color(17, 48, 89));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAllExpenditure.setBackground(new java.awt.Color(15, 40, 70));
        btnAllExpenditure.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAllExpenditure.setForeground(new java.awt.Color(204, 204, 255));
        btnAllExpenditure.setText("All Expenditures");
        btnAllExpenditure.setBorder(null);
        btnAllExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllExpenditureActionPerformed(evt);
            }
        });
        jPanel6.add(btnAllExpenditure, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 84, 173, 35));

        jButton14.setBackground(new java.awt.Color(15, 40, 70));
        jButton14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(204, 204, 255));
        jButton14.setText("All revenue");
        jButton14.setBorder(null);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 84, 173, 35));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Income and Expenditure Report");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        btnRentingDetails.setBackground(new java.awt.Color(15, 40, 70));
        btnRentingDetails.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnRentingDetails.setForeground(new java.awt.Color(204, 204, 255));
        btnRentingDetails.setText("Renting");
        btnRentingDetails.setToolTipText("");
        btnRentingDetails.setBorder(null);
        btnRentingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentingDetailsActionPerformed(evt);
            }
        });
        jPanel6.add(btnRentingDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 137, 173, 35));

        btnTaxView.setBackground(new java.awt.Color(15, 40, 70));
        btnTaxView.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnTaxView.setForeground(new java.awt.Color(204, 204, 255));
        btnTaxView.setText("Tax Collection View");
        btnTaxView.setToolTipText("");
        btnTaxView.setBorder(null);
        btnTaxView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxViewActionPerformed(evt);
            }
        });
        jPanel6.add(btnTaxView, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 137, 173, 35));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 416, 230));

        jPanel7.setBackground(new java.awt.Color(17, 48, 89));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Auction");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        btnAuctionDetails.setBackground(new java.awt.Color(15, 40, 70));
        btnAuctionDetails.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAuctionDetails.setForeground(new java.awt.Color(204, 204, 255));
        btnAuctionDetails.setText("Auction Details");
        btnAuctionDetails.setBorder(null);
        btnAuctionDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuctionDetailsActionPerformed(evt);
            }
        });
        jPanel7.add(btnAuctionDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 173, 35));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 475, 437, 110));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("DashBoard");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jButton12.setBackground(new java.awt.Color(15, 40, 70));
        jButton12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(204, 204, 255));
        jButton12.setText("LOGOUT");
        jButton12.setBorder(null);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 173, 35));

        jPanel8.setBackground(new java.awt.Color(17, 48, 89));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Subsidized Details");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 12, -1, -1));

        btnSubsidizedDetails.setBackground(new java.awt.Color(15, 40, 70));
        btnSubsidizedDetails.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSubsidizedDetails.setForeground(new java.awt.Color(204, 204, 255));
        btnSubsidizedDetails.setText("Subsideized Details");
        btnSubsidizedDetails.setBorder(null);
        btnSubsidizedDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubsidizedDetailsActionPerformed(evt);
            }
        });
        jPanel8.add(btnSubsidizedDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 173, 35));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 437, 110));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnAllExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllExpenditureActionPerformed
        this.dispose();
        new Expenditures().setVisible(true);
    }//GEN-LAST:event_btnAllExpenditureActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        this.dispose();
        new Revenue().setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void btnAuctionDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuctionDetailsActionPerformed
this.dispose();
new AuctionForm().setVisible(true);
    }//GEN-LAST:event_btnAuctionDetailsActionPerformed

    private void btnTaxCollectingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxCollectingActionPerformed
        this.dispose();
        new TaxCollectings().setVisible(true);
    }//GEN-LAST:event_btnTaxCollectingActionPerformed

    private void btnitemSellingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnitemSellingActionPerformed
        this.dispose();
        new ItemSelling().setVisible(true);
    }//GEN-LAST:event_btnitemSellingActionPerformed

    private void btnItemBuyingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemBuyingActionPerformed
        new ItemBuyingForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnItemBuyingActionPerformed

    private void btnRentingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentingActionPerformed
        this.dispose();
        new BuildingRent().setVisible(true);
    }//GEN-LAST:event_btnRentingActionPerformed

    private void btnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillActionPerformed
        this.dispose();
        new BillPayment().setVisible(true);
    }//GEN-LAST:event_btnBillActionPerformed

    private void btnDocfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocfeeActionPerformed
        this.dispose();
        new BillPayment().setVisible(true);
    }//GEN-LAST:event_btnDocfeeActionPerformed

    private void btnTaxViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxViewActionPerformed
        this.dispose();
        new TaxCollectingsDetailsView().setVisible(true);
    }//GEN-LAST:event_btnTaxViewActionPerformed

    private void btnRentingDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentingDetailsActionPerformed
        this.dispose();
        new BuildingREntingDetails().setVisible(true);
    }//GEN-LAST:event_btnRentingDetailsActionPerformed

    private void btnSubsidizedDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubsidizedDetailsActionPerformed
this.dispose();
new FertilizerDistributionDEtails().setVisible(true);
    }//GEN-LAST:event_btnSubsidizedDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllExpenditure;
    private javax.swing.JButton btnAuctionDetails;
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnDocfee;
    private javax.swing.JButton btnItemBuying;
    private javax.swing.JButton btnRenting;
    private javax.swing.JButton btnRentingDetails;
    private javax.swing.JButton btnSubsidizedDetails;
    private javax.swing.JButton btnTaxCollecting;
    private javax.swing.JButton btnTaxView;
    private javax.swing.JButton btnitemSelling;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
