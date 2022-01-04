package GUI;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import util.DBConnection;

public class FertilizerDistributionDEtails extends javax.swing.JFrame {

    public FertilizerDistributionDEtails() {
        initComponents();
        retrieveFarmer();
        retrieveFert();
    }
    // get data from farmer details table to UITable

    public void retrieveFarmer() {
        DefaultTableModel tblModel = (DefaultTableModel) tblFarmerDetails.getModel();
        tblModel.setRowCount(0);
        try {
            ResultSet r = DBConnection.query("SELECT *FROM farmerdetails ");
            while (r.next()) {
                String farmerID = r.getString("farmerID");
                String farmerName = r.getString("farmerName");
                String[] sArr = {farmerID, farmerName};
                //define table and add values for table
                tblModel.addRow(sArr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // get data from fertilizer detaila table to UITable   
    public void retrieveFert() {
        DefaultTableModel tblModel = (DefaultTableModel) tblFertDetails.getModel();
        tblModel.setRowCount(0);
        try {
            ResultSet r = DBConnection.query("SELECT *FROM fertilizerdistributes ");
            while (r.next()) {
                String farmerID = r.getString("famerID");
                String distributionDate = r.getString("distributeDate");
                String quString = r.getString("quentity");
                String[] sArr = {farmerID, distributionDate, quString};
                //define table and add values for table
                tblModel.addRow(sArr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //filter result using farmer ID
    //filter result by date
    public void filterByDate() {
        DefaultTableModel tblModelF = (DefaultTableModel) tblFertDetails.getModel();
        tblModelF.setRowCount(0);
        try {
            ResultSet r = DBConnection.query("SELECT * FROM fertilizerdistributes WHERE distributeDate BETWEEN '" + tfDateStart.getText() + "' AND '" + tfDateEnd.getText() + "';");
            while (r.next()) {
                String farmerID = r.getString("famerID");
                String distributionDate = r.getString("distributeDate");
                String quString = r.getString("quentity");
                String[] sArr = {farmerID, distributionDate, quString};
                //define table and add values for table
                tblModelF.addRow(sArr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //search result using farner ID ~~ when typing

    public void serchResult_FarmerID() {
        DefaultTableModel tblModelF = (DefaultTableModel) tblFertDetails.getModel();
        tblModelF.setRowCount(0);
        String farmerID = tfFarmerID.getText() + "%";
        try {
            ResultSet r = DBConnection.query("SELECT * FROM fertilizerdistributes WHERE famerID LIKE '" + farmerID + "';");
            while (r.next()) {
                String sfarmerID = r.getString("famerID");
                String distributionDate = r.getString("distributeDate");
                String quString = r.getString("quentity");
                String[] sArr = {sfarmerID, distributionDate, quString};
                //define table and add values for table
                tblModelF.addRow(sArr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnFilter = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfDateStart = new javax.swing.JTextField();
        tfFarmerID = new javax.swing.JTextField();
        tfDateEnd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnAddFamer = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFarmerDetails = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFertDetails = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(212, 228, 244));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(17, 48, 89));
        jPanel6.setForeground(new java.awt.Color(204, 204, 255));
        jPanel6.setAlignmentX(1.0F);
        jPanel6.setAlignmentY(1.0F);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFilter.setBackground(new java.awt.Color(17, 48, 89));
        btnFilter.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFilter.setForeground(new java.awt.Color(255, 255, 255));
        btnFilter.setText("Filter");
        btnFilter.setBorder(null);
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        jPanel6.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 110, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Search Result By");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

        tfDateStart.setBackground(new java.awt.Color(10, 40, 80));
        tfDateStart.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDateStart.setForeground(new java.awt.Color(255, 255, 255));
        tfDateStart.setBorder(null);
        jPanel6.add(tfDateStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, 34));

        tfFarmerID.setBackground(new java.awt.Color(10, 40, 80));
        tfFarmerID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfFarmerID.setForeground(new java.awt.Color(255, 255, 255));
        tfFarmerID.setBorder(null);
        tfFarmerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfFarmerIDKeyTyped(evt);
            }
        });
        jPanel6.add(tfFarmerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, 34));

        tfDateEnd.setBackground(new java.awt.Color(10, 40, 80));
        tfDateEnd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDateEnd.setForeground(new java.awt.Color(255, 255, 255));
        tfDateEnd.setBorder(null);
        jPanel6.add(tfDateEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, 34));

        jLabel12.setBackground(new java.awt.Color(17, 48, 89));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("To");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 50, 30));

        jLabel15.setBackground(new java.awt.Color(17, 48, 89));
        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("From");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 50, 30));

        jLabel19.setBackground(new java.awt.Color(17, 48, 89));
        jLabel19.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Filter Result By Date");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        jLabel25.setBackground(new java.awt.Color(17, 48, 89));
        jLabel25.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Farmer ID");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Filter Result By");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 430, 40));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 430, 320));

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
        jPanel5.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, 25));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Fertilizer subcidized details");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 430, 40));

        jPanel7.setBackground(new java.awt.Color(17, 48, 89));
        jPanel7.setForeground(new java.awt.Color(204, 204, 255));
        jPanel7.setAlignmentX(1.0F);
        jPanel7.setAlignmentY(1.0F);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Farmer Details");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 350, 40));

        btnAddFamer.setBackground(new java.awt.Color(17, 48, 89));
        btnAddFamer.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAddFamer.setText("Add Farmer");
        btnAddFamer.setBorder(null);
        btnAddFamer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFamerActionPerformed(evt);
            }
        });
        jPanel7.add(btnAddFamer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 100, 30));

        tblFarmerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Farmer ID", "Farmer Name"
            }
        ));
        jScrollPane3.setViewportView(tblFarmerDetails);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 340, 210));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 400, 320));

        jPanel9.setBackground(new java.awt.Color(17, 48, 89));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblFertDetails.setBackground(new java.awt.Color(255, 255, 255));
        tblFertDetails.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblFertDetails.setForeground(new java.awt.Color(0, 0, 0));
        tblFertDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Farmer ID", "Released Qnt"
            }
        ));
        jScrollPane2.setViewportView(tblFertDetails);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 170));

        btnNew.setBackground(new java.awt.Color(17, 48, 89));
        btnNew.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNew.setText("Add New");
        btnNew.setBorder(null);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel9.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 100, 30));

        btnPrint.setBackground(new java.awt.Color(17, 48, 89));
        btnPrint.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.setBorder(null);
        jPanel9.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 100, 30));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 670, 230));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddFamerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFamerActionPerformed
        new FaremerRegistration().setVisible(true);
    }//GEN-LAST:event_btnAddFamerActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        new FertilizerReleaseForm().setVisible(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void tfFarmerIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFarmerIDKeyTyped
serchResult_FarmerID();
    }//GEN-LAST:event_tfFarmerIDKeyTyped

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
filterByDate();
    }//GEN-LAST:event_btnFilterActionPerformed

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
            java.util.logging.Logger.getLogger(FertilizerDistributionDEtails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FertilizerDistributionDEtails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FertilizerDistributionDEtails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FertilizerDistributionDEtails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FertilizerDistributionDEtails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFamer;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblFarmerDetails;
    private javax.swing.JTable tblFertDetails;
    private javax.swing.JTextField tfDateEnd;
    private javax.swing.JTextField tfDateStart;
    private javax.swing.JTextField tfFarmerID;
    // End of variables declaration//GEN-END:variables
}
