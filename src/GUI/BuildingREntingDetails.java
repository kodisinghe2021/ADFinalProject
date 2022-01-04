package GUI;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import util.DBConnection;

public class BuildingREntingDetails extends javax.swing.JFrame {

    public BuildingREntingDetails() {
        initComponents();
        retrieve();
        tfDateStart.setVisible(false);
        tfDateEnd.setVisible(false);
        tfMin.setVisible(false);
        tfMax.setVisible(false);
    }

    // get data from DB to Table
    public void retrieve() {
        DefaultTableModel tblModel = (DefaultTableModel) tblMain.getModel();
        tblModel.setRowCount(0);
        try {
            ResultSet r = DBConnection.query("SELECT *FROM buildingrenting ");
            while (r.next()) {
                String date = r.getString("date");
                String time = r.getString("bookingTime");
                String bIndex = r.getString("buildingIndex");
                String amount = r.getString("totalAmount");
                String cContact = r.getString("clientContact");
                String[] sArr = {date, time, bIndex, amount, cContact};
                //define table and add values for table
                tblModel.addRow(sArr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
//filter result by date

    public void filterByDate() {
        DefaultTableModel tblModelF = (DefaultTableModel) tblMain.getModel();
        tblModelF.setRowCount(0);
        try {
            ResultSet r = DBConnection.query("SELECT * FROM buildingrenting WHERE date BETWEEN '" + tfDateStart.getText() + "' AND '" + tfDateEnd.getText() + "';");
            while (r.next()) {
                String date = r.getString("date");
                String time = r.getString("bookingTime");
                String bIndex = r.getString("buildingIndex");
                String amount = r.getString("totalAmount");
                String cContact = r.getString("clientContact");
                String[] sArr = {date, time, bIndex, amount, cContact};
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
            ResultSet r = DBConnection.query("SELECT * FROM buildingrenting WHERE totalAmount BETWEEN '" + tfMin.getText() + "' AND '" + tfMax.getText() + "';");
            while (r.next()) {
                String date = r.getString("date");
                String time = r.getString("bookingTime");
                String bIndex = r.getString("buildingIndex");
                String amount = r.getString("totalAmount");
                String cContact = r.getString("clientContact");
                String[] sArr = {date, time, bIndex, amount, cContact};
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
            ResultSet r = DBConnection.query("SELECT * FROM buildingrenting WHERE date BETWEEN '" + tfDateStart.getText() + "' AND '" + tfDateEnd.getText() + "' AND totalAmount BETWEEN '" + tfMin.getText() + "' AND '" + tfMax.getText() + "';");
            while (r.next()) {
                String date = r.getString("date");
                String time = r.getString("bookingTime");
                String bIndex = r.getString("buildingIndex");
                String amount = r.getString("totalAmount");
                String cContact = r.getString("clientContact");
                String[] sArr = {date, time, bIndex, amount, cContact};
                tblModelF.addRow(sArr);
            }

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
            ResultSet r = DBConnection.query("SELECT * FROM buildingrenting WHERE date LIKE '" + date + "';");
            while (r.next()) {
                String sdate = r.getString("date");
                String time = r.getString("bookingTime");
                String bIndex = r.getString("buildingIndex");
                String amount = r.getString("totalAmount");
                String cContact = r.getString("clientContact");
                String[] sArr = {sdate, time, bIndex, amount, cContact};
                tblModelF.addRow(sArr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //search result using Building ID ~~ when typing

    public void serchResult_BuildingID() {
        DefaultTableModel tblModelF = (DefaultTableModel) tblMain.getModel();
        tblModelF.setRowCount(0);
        String fName = tfBuildingID.getText() + "%";
        try {
            ResultSet r = DBConnection.query("SELECT * FROM buildingrenting WHERE buildingIndex LIKE '" + fName + "';");
            while (r.next()) {
                String date = r.getString("date");
                String time = r.getString("bookingTime");
                String bIndex = r.getString("buildingIndex");
                String amount = r.getString("totalAmount");
                String cContact = r.getString("clientContact");
                String[] sArr = {date, time, bIndex, amount, cContact};
                tblModelF.addRow(sArr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //  //Find total amount given time period
    public void findTtlAmount() {
        double ttl = 0.0;
        String from = tfTtlFrom.getText();
        String to = tfTtlTo.getText();
        try {
            ResultSet r = DBConnection.query("SELECT * FROM buildingrenting WHERE totalAmount BETWEEN '" + from + "' AND '" + to + "' ");

            while (r.next()) {
                String am = r.getString("totalAmount");
                ttl = ttl + Double.parseDouble(am);
            }
            lblTT.setText(String.valueOf(ttl));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnRemoveFileter = new javax.swing.JButton();
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
        btnFilter = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tfBuildingID = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMain = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblTT = new javax.swing.JLabel();
        tfTtlTo = new javax.swing.JTextField();
        tfTtlFrom = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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

        btnRemoveFileter.setBackground(new java.awt.Color(17, 48, 89));
        btnRemoveFileter.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRemoveFileter.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveFileter.setText("Remove Filter");
        btnRemoveFileter.setBorder(null);
        btnRemoveFileter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFileterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemoveFileter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 130, 25));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Filter Result By");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 360, 40));

        tfDateEnd.setBackground(new java.awt.Color(10, 40, 80));
        tfDateEnd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDateEnd.setForeground(new java.awt.Color(255, 255, 255));
        tfDateEnd.setBorder(null);
        jPanel2.add(tfDateEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, 34));

        tfDateStart.setBackground(new java.awt.Color(10, 40, 80));
        tfDateStart.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDateStart.setForeground(new java.awt.Color(255, 255, 255));
        tfDateStart.setBorder(null);
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
        jPanel2.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 130, 25));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 360, 330));

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
        jLabel8.setText("Building renting details view");
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
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 360, 40));

        tfBuildingID.setBackground(new java.awt.Color(10, 40, 80));
        tfBuildingID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfBuildingID.setForeground(new java.awt.Color(255, 255, 255));
        tfBuildingID.setBorder(null);
        tfBuildingID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuildingIDMouseClicked(evt);
            }
        });
        tfBuildingID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBuildingIDKeyTyped(evt);
            }
        });
        jPanel3.add(tfBuildingID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, 34));

        tfDate.setBackground(new java.awt.Color(10, 40, 80));
        tfDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDate.setForeground(new java.awt.Color(255, 255, 255));
        tfDate.setBorder(null);
        tfDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDateKeyTyped(evt);
            }
        });
        jPanel3.add(tfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, 34));

        jLabel11.setBackground(new java.awt.Color(17, 48, 89));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Buliding ID");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 30));

        jLabel12.setBackground(new java.awt.Color(17, 48, 89));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Date");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 50, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 410, 330));

        tblMain.setBackground(new java.awt.Color(255, 255, 255));
        tblMain.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblMain.setForeground(new java.awt.Color(0, 0, 0));
        tblMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "recieving Date", "recieving Time", "Building Index", "Amount", "client Contact"
            }
        ));
        jScrollPane1.setViewportView(tblMain);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 780, 140));

        jPanel4.setBackground(new java.awt.Color(17, 48, 89));
        jPanel4.setForeground(new java.awt.Color(204, 204, 255));
        jPanel4.setAlignmentX(1.0F);
        jPanel4.setAlignmentY(1.0F);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTT.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTT.setForeground(new java.awt.Color(255, 255, 255));
        lblTT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTT.setText("78,000 LKR");
        lblTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTTMouseClicked(evt);
            }
        });
        jPanel4.add(lblTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 160, 40));

        tfTtlTo.setBackground(new java.awt.Color(10, 40, 80));
        tfTtlTo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfTtlTo.setForeground(new java.awt.Color(255, 255, 255));
        tfTtlTo.setBorder(null);
        jPanel4.add(tfTtlTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 150, 34));

        tfTtlFrom.setBackground(new java.awt.Color(10, 40, 80));
        tfTtlFrom.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfTtlFrom.setForeground(new java.awt.Color(255, 255, 255));
        tfTtlFrom.setBorder(null);
        jPanel4.add(tfTtlFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, 34));

        jLabel13.setBackground(new java.awt.Color(17, 48, 89));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("To");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 80, 30));

        jLabel14.setBackground(new java.awt.Color(17, 48, 89));
        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("From");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 50, 30));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Total Erning");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 670, 120));

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
        jPanel1.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
new MainForm().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void chbxDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxDateMouseClicked
        if (chbxDate.isSelected()) {
            tfDateStart.setVisible(true);
            tfDateEnd.setVisible(true);
        } else if (!chbxDate.isSelected()) {
            tfDateStart.setVisible(false);
            tfDateEnd.setVisible(false);
            tfMin.setVisible(false);
            tfMax.setVisible(false);
        }
    }//GEN-LAST:event_chbxDateMouseClicked

    private void chbxAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxAmountMouseClicked
        if (chbxAmount.isSelected()) {
            tfMin.setVisible(true);
            tfMax.setVisible(true);
        } else if (!chbxAmount.isSelected()) {
            tfMin.setVisible(false);
            tfMax.setVisible(false);
        }
    }//GEN-LAST:event_chbxAmountMouseClicked

    private void btnRemoveFileterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFileterActionPerformed
        retrieve();
    }//GEN-LAST:event_btnRemoveFileterActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if (chbxDate.isSelected() && chbxAmount.isSelected()) {
            filterByAmount_And_Date();
        } else if (chbxDate.isSelected()) {
            filterByDate();
        } else if (chbxAmount.isSelected()) {
            filterByAmount();
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void tfDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDateKeyTyped
        serchResult_Date();
    }//GEN-LAST:event_tfDateKeyTyped

    private void tfBuildingIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuildingIDKeyTyped
        serchResult_BuildingID();
    }//GEN-LAST:event_tfBuildingIDKeyTyped

    private void lblTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTTMouseClicked
        findTtlAmount();
    }//GEN-LAST:event_lblTTMouseClicked

    private void tfBuildingIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuildingIDMouseClicked
serchResult_BuildingID();
    }//GEN-LAST:event_tfBuildingIDMouseClicked

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(BuildingREntingDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuildingREntingDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuildingREntingDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuildingREntingDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuildingREntingDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRemoveFileter;
    private javax.swing.JCheckBox chbxAmount;
    private javax.swing.JCheckBox chbxDate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTT;
    private javax.swing.JTable tblMain;
    private javax.swing.JTextField tfBuildingID;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfDateEnd;
    private javax.swing.JTextField tfDateStart;
    private javax.swing.JTextField tfMax;
    private javax.swing.JTextField tfMin;
    private javax.swing.JTextField tfTtlFrom;
    private javax.swing.JTextField tfTtlTo;
    // End of variables declaration//GEN-END:variables
}
