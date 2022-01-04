package GUI;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import util.DBConnection;

public class AuctionForm extends javax.swing.JFrame {
    
    public AuctionForm() {
        initComponents();
        retrieve();
    }

    // get data from DB to Table
    public void retrieve() {
        DefaultTableModel tblModel = (DefaultTableModel) tblMain.getModel();
        tblModel.setRowCount(0);
        try {
            ResultSet r = DBConnection.query("SELECT *FROM auctiondt ");
            while (r.next()) {
                String selDate = r.getString("sellingDate");
                String qnt = r.getString("qnt");
                String mat = r.getString("material");
                String curPri = r.getString("currentPrice");
                String SelPri = r.getString("sellingPrice");
                String[] sArr = {selDate, qnt, mat, curPri, SelPri};
                //define table and add values for table
                tblModel.addRow(sArr);
            }
//aucID, sellingDate, qnt, material, item, currentPrice, sellingPrice
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //search result using date ~~ when typing

    public void serchResult_Date() {
        DefaultTableModel tblModelF = (DefaultTableModel) tblMain.getModel();
        tblModelF.setRowCount(0);
        String date = tfDate.getText() + "%";
        try {
            ResultSet r = DBConnection.query("SELECT * FROM auctiondt WHERE sellingDate LIKE '"+date+"';");
            while (r.next()) {
                String selDate = r.getString("sellingDate");
                String qnt = r.getString("qnt");
                String mat = r.getString("material");
                String curPri = r.getString("currentPrice");
                String SelPri = r.getString("sellingPrice");
                String[] sArr = {selDate, qnt, mat, curPri, SelPri};
                //define table and add values for table
                tblModelF.addRow(sArr);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //search result using date ~~ when typing

    public void serchResult_Mat() {
        DefaultTableModel tblModelF = (DefaultTableModel) tblMain.getModel();
        tblModelF.setRowCount(0);
        String matt = tfMat.getText() + "%";
        try {
            ResultSet r = DBConnection.query("SELECT * FROM auctiondt WHERE material LIKE '"+matt+"';");
            while (r.next()) {
                String selDate = r.getString("sellingDate");
                String qnt = r.getString("qnt");
                String mat = r.getString("material");
                String curPri = r.getString("currentPrice");
                String SelPri = r.getString("sellingPrice");
                String[] sArr = {selDate, qnt, mat, curPri, SelPri};
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tfMat = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMain = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        btnPrint1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(212, 228, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, 25));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Auction details view");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 430, 40));

        jPanel3.setBackground(new java.awt.Color(17, 48, 89));
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));
        jPanel3.setAlignmentX(1.0F);
        jPanel3.setAlignmentY(1.0F);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Search By");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 40));

        tfMat.setBackground(new java.awt.Color(10, 40, 80));
        tfMat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfMat.setForeground(new java.awt.Color(255, 255, 255));
        tfMat.setBorder(null);
        tfMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfMatMouseClicked(evt);
            }
        });
        tfMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMatKeyTyped(evt);
            }
        });
        jPanel3.add(tfMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 150, 34));

        tfDate.setBackground(new java.awt.Color(10, 40, 80));
        tfDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDate.setForeground(new java.awt.Color(255, 255, 255));
        tfDate.setBorder(null);
        tfDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDateKeyTyped(evt);
            }
        });
        jPanel3.add(tfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 150, 34));

        jLabel11.setBackground(new java.awt.Color(17, 48, 89));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Material");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 80, 30));

        jLabel12.setBackground(new java.awt.Color(17, 48, 89));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Date");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 500, 100));

        tblMain.setBackground(new java.awt.Color(255, 255, 255));
        tblMain.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblMain.setForeground(new java.awt.Color(0, 0, 0));
        tblMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selling Date", "Quentity", "Material", "Current Price", "Selling Price"
            }
        ));
        jScrollPane1.setViewportView(tblMain);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 780, 190));

        btnPrint.setBackground(new java.awt.Color(17, 48, 89));
        btnPrint.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Add new");
        btnPrint.setBorder(null);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 120, 30));

        btnPrint1.setBackground(new java.awt.Color(17, 48, 89));
        btnPrint1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPrint1.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint1.setText("Print");
        btnPrint1.setBorder(null);
        btnPrint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new MainForm().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfMatMouseClicked

    }//GEN-LAST:event_tfMatMouseClicked

    private void tfMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMatKeyTyped
        serchResult_Mat();
    }//GEN-LAST:event_tfMatKeyTyped

    private void tfDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDateKeyTyped
        serchResult_Date();
    }//GEN-LAST:event_tfDateKeyTyped

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        new AddAuction().setVisible(true);
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint1ActionPerformed

    }//GEN-LAST:event_btnPrint1ActionPerformed

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
            java.util.logging.Logger.getLogger(AuctionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuctionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuctionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuctionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuctionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnPrint1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMain;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfMat;
    // End of variables declaration//GEN-END:variables
}
