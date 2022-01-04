package GUI;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import util.DBConnection;

public class Revenue extends javax.swing.JFrame {

    public Revenue() {
        initComponents();
        retrieve();
        tfDateStart.setVisible(false);
        tfDateEnd.setVisible(false);
        tfMin.setVisible(false);
        tfMax.setVisible(false);
    }
// get datails from dailyincome and set all details to the table
    public void retrieve() {
        DefaultTableModel tblModel = (DefaultTableModel) tblMain.getModel();
        tblModel.setRowCount(0);
        try {
            ResultSet r = DBConnection.query("SELECT *FROM dailyincome ");
            while (r.next()) {
                String id = r.getString("payID");
                String name = r.getString("date");
                String amt = r.getString("amount");
                String[] sArr = {id, name, amt};
                //define table and add values for table
                tblModel.addRow(sArr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //filter result using date
    public void filterByDate() {
        DefaultTableModel tblModelF = (DefaultTableModel) tblMain.getModel();
        tblModelF.setRowCount(0);
        try {
            ResultSet r = DBConnection.query("SELECT * FROM dailyincome WHERE date BETWEEN '" + tfDateStart.getText() + "' AND '" + tfDateEnd.getText() + "';");
            while (r.next()) {
                String id = r.getString("payID");
                String name = r.getString("date");
                String amt = r.getString("amount");
                String[] sArr = {id, name, amt};
                tblModelF.addRow(sArr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //filter result using amount
    public void filterByAmount() {
        DefaultTableModel tblModelF = (DefaultTableModel) tblMain.getModel();
        tblModelF.setRowCount(0);
        try {
            ResultSet r = DBConnection.query("SELECT * FROM dailyincome WHERE amount BETWEEN '" + tfMin.getText() + "' AND '" + tfMax.getText() + "';");
            while (r.next()) {
                String id = r.getString("payID");
                String name = r.getString("date");
                String amt = r.getString("amount");
                String[] sArr = {id, name, amt};
                tblModelF.addRow(sArr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
     //filter result using amount and date
    public void filterByAmount_And_Date() {
        DefaultTableModel tblModelF = (DefaultTableModel) tblMain.getModel();
        tblModelF.setRowCount(0);
        try {
            ResultSet r = DBConnection.query("SELECT * FROM dailyincome WHERE date BETWEEN '" + tfDateStart.getText() + "' AND '" + tfDateEnd.getText() + "' AND amount BETWEEN '" + tfMin.getText() + "' AND '" + tfMax.getText() + "';");
            while (r.next()) {
                String id = r.getString("payID");
                String name = r.getString("date");
                String amt = r.getString("amount");
                String[] sArr = {id, name, amt};
                tblModelF.addRow(sArr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }   
   //search result using date
      public void serchResult_Date() {
        DefaultTableModel tblModelF = (DefaultTableModel) tblMain.getModel();
        tblModelF.setRowCount(0);
        String date = tfDate.getText()+"%";
        try {
            ResultSet r = DBConnection.query("SELECT * FROM dailyincome WHERE date LIKE '"+date+"';");
            while (r.next()) {
                String id = r.getString("payID");
                String name = r.getString("date");
                String amt = r.getString("amount");
                String[] sArr = {id, name, amt};
                tblModelF.addRow(sArr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfDateEnd = new javax.swing.JTextField();
        tfDateStart = new javax.swing.JTextField();
        chbxDate = new javax.swing.JCheckBox();
        chbxAmount = new javax.swing.JCheckBox();
        tfMin = new javax.swing.JTextField();
        tfMax = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnFilter1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMain = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(212, 228, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(17, 48, 89));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setAlignmentX(1.0F);
        jPanel2.setAlignmentY(1.0F);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Filter Result By");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 360, 40));

        tfDateEnd.setBackground(new java.awt.Color(10, 40, 80));
        tfDateEnd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDateEnd.setForeground(new java.awt.Color(255, 255, 255));
        tfDateEnd.setBorder(null);
        tfDateEnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfDateEndMouseClicked(evt);
            }
        });
        jPanel2.add(tfDateEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, 34));

        tfDateStart.setBackground(new java.awt.Color(10, 40, 80));
        tfDateStart.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDateStart.setForeground(new java.awt.Color(255, 255, 255));
        tfDateStart.setBorder(null);
        tfDateStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfDateStartMouseClicked(evt);
            }
        });
        jPanel2.add(tfDateStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 90, 150, 34));

        chbxDate.setBackground(new java.awt.Color(17, 48, 89));
        chbxDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chbxDate.setForeground(new java.awt.Color(255, 255, 255));
        chbxDate.setText("Date");
        chbxDate.setBorder(null);
        chbxDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxDateMouseClicked(evt);
            }
        });
        chbxDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxDateActionPerformed(evt);
            }
        });
        jPanel2.add(chbxDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 30));

        chbxAmount.setBackground(new java.awt.Color(17, 48, 89));
        chbxAmount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chbxAmount.setForeground(new java.awt.Color(255, 255, 255));
        chbxAmount.setText("Amount");
        chbxAmount.setBorder(null);
        chbxAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxAmountMouseClicked(evt);
            }
        });
        jPanel2.add(chbxAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 30));

        tfMin.setBackground(new java.awt.Color(10, 40, 80));
        tfMin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfMin.setForeground(new java.awt.Color(255, 255, 255));
        tfMin.setBorder(null);
        jPanel2.add(tfMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, 34));

        tfMax.setBackground(new java.awt.Color(10, 40, 80));
        tfMax.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfMax.setForeground(new java.awt.Color(255, 255, 255));
        tfMax.setBorder(null);
        jPanel2.add(tfMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 150, 34));

        jLabel1.setBackground(new java.awt.Color(17, 48, 89));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Min");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 190, 50, 30));

        jLabel2.setBackground(new java.awt.Color(17, 48, 89));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Max");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 240, 50, 30));

        jLabel3.setBackground(new java.awt.Color(17, 48, 89));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Start");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 90, 50, 30));

        jLabel4.setBackground(new java.awt.Color(17, 48, 89));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("End");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 140, 50, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Search By");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 360, 40));

        tfDate.setBackground(new java.awt.Color(10, 40, 80));
        tfDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDate.setForeground(new java.awt.Color(255, 255, 255));
        tfDate.setBorder(null);
        tfDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDateKeyTyped(evt);
            }
        });
        jPanel2.add(tfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 150, 34));

        jLabel13.setBackground(new java.awt.Color(17, 48, 89));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 50, 30));

        btnRemove.setBackground(new java.awt.Color(17, 48, 89));
        btnRemove.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("remove Filter");
        btnRemove.setBorder(null);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 130, 25));

        btnFilter1.setBackground(new java.awt.Color(17, 48, 89));
        btnFilter1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFilter1.setForeground(new java.awt.Color(255, 255, 255));
        btnFilter1.setText("Filter");
        btnFilter1.setBorder(null);
        btnFilter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilter1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnFilter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 130, 25));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 360, 500));

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
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, 25));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("All Revenue");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 430, 40));

        jPanel3.setBackground(new java.awt.Color(17, 48, 89));
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));
        jPanel3.setAlignmentX(1.0F);
        jPanel3.setAlignmentY(1.0F);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMain.setBackground(new java.awt.Color(255, 255, 255));
        tblMain.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblMain.setForeground(new java.awt.Color(0, 0, 51));
        tblMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pay ID", "Date", "Amount"
            }
        ));
        jScrollPane2.setViewportView(tblMain);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 390, 420));

        btnPrint.setBackground(new java.awt.Color(17, 48, 89));
        btnPrint.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print");
        btnPrint.setBorder(null);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 130, 25));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 410, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
this.dispose();
new MainForm().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void chbxDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxDateActionPerformed

    }//GEN-LAST:event_chbxDateActionPerformed

    private void chbxDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxDateMouseClicked
        tfDateStart.setText("");
        tfDateEnd.setText("");
        if (chbxDate.isSelected()) {
            tfDateStart.setVisible(true);
            tfDateEnd.setVisible(true);
        } else if (!chbxDate.isSelected()) {
            tfDateStart.setVisible(false);
            tfDateEnd.setVisible(false);
        }
    }//GEN-LAST:event_chbxDateMouseClicked

    private void chbxAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxAmountMouseClicked
        tfMin.setText("");
        tfMax.setText("");
        if (chbxAmount.isSelected()) {
            tfMin.setVisible(true);
            tfMax.setVisible(true);
        } else if (!chbxDate.isSelected()) {
            tfMin.setVisible(false);
            tfMax.setVisible(false);
        }
    }//GEN-LAST:event_chbxAmountMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
     if(chbxDate.isSelected() && chbxAmount.isSelected()){
     filterByAmount_And_Date();
     }else if(chbxDate.isSelected()){
          filterByDate();
     }else if(chbxAmount.isSelected()){
         filterByAmount();
     }
       
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        retrieve();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tfDateStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDateStartMouseClicked
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = new java.util.Date();
        tfDateStart.setText(formatter.format(date));
    }//GEN-LAST:event_tfDateStartMouseClicked

    private void tfDateEndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDateEndMouseClicked
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = new java.util.Date();
        tfDateEnd.setText(formatter.format(date));
    }//GEN-LAST:event_tfDateEndMouseClicked

    private void tfDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDateKeyTyped
serchResult_Date();
    }//GEN-LAST:event_tfDateKeyTyped

    private void btnFilter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFilter1ActionPerformed

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
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Revenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFilter1;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRemove;
    private javax.swing.JCheckBox chbxAmount;
    private javax.swing.JCheckBox chbxDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMain;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfDateEnd;
    private javax.swing.JTextField tfDateStart;
    private javax.swing.JTextField tfMax;
    private javax.swing.JTextField tfMin;
    // End of variables declaration//GEN-END:variables
}
