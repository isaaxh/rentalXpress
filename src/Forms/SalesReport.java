package Forms;

import HelperClasses.AllRentals;
import HelperClasses.Rental;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.IDN;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SalesReport extends javax.swing.JFrame {

    AllRentals rentals = new AllRentals();
    ArrayList<Rental> dateRangeRentals = new ArrayList<Rental>();
    String[] columns = { "Rental ID", "Date rented", "Sale" };
    DefaultTableModel model = new DefaultTableModel();
    int row;

    public SalesReport() {
        model.setColumnIdentifiers(columns);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        showReportBtn = new javax.swing.JButton();
        generateAnalysisBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        salesTabPanel = new javax.swing.JTabbedPane();
        reportTablePanel = new javax.swing.JPanel();
        reportTabPanel = new javax.swing.JScrollPane();
        salesReportTable = new javax.swing.JTable();
        analysisTabPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalSalesDate = new javax.swing.JLabel();
        totalSalesLabel = new javax.swing.JLabel();
        averageSalesDate = new javax.swing.JLabel();
        averageSalesLabel = new javax.swing.JLabel();
        lowestSaleDate = new javax.swing.JLabel();
        lowestSaleLabel = new javax.swing.JLabel();
        highestSaleDate = new javax.swing.JLabel();
        highestSaleLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 250, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(0, 14, 148));
        sidePanel.setForeground(new java.awt.Color(254, 254, 254));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Sales Reports");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Start date:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("End date:");

        showReportBtn.setText("Show report");
        showReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showReportBtnActionPerformed(evt);
            }
        });

        generateAnalysisBtn.setText("Generate analysis");
        generateAnalysisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateAnalysisBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
                sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sidePanelLayout.createSequentialGroup()
                                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(sidePanelLayout.createSequentialGroup()
                                                .addGap(73, 73, 73)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(sidePanelLayout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(sidePanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(generateAnalysisBtn,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(sidePanelLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                        sidePanelLayout.createSequentialGroup()
                                                                                .addComponent(jLabel2,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        83,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(2, 2, 2)
                                                                                .addComponent(startDateChooser,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        155,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                        sidePanelLayout.createSequentialGroup()
                                                                                .addComponent(jLabel3,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        83,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(2, 2, 2)
                                                                                .addComponent(endDateChooser,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        155,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(showReportBtn,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(backBtn,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(72, Short.MAX_VALUE)));
        sidePanelLayout.setVerticalGroup(
                sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sidePanelLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(sidePanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(sidePanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(showReportBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(generateAnalysisBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backBtn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel1.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        jPanel3.setBackground(new java.awt.Color(250, 250, 254));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 480, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 70, Short.MAX_VALUE));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 480, 70));

        salesReportTable.setModel(model);
        salesReportTable.getTableHeader().setReorderingAllowed(false);
        reportTabPanel.setViewportView(salesReportTable);

        javax.swing.GroupLayout reportTablePanelLayout = new javax.swing.GroupLayout(reportTablePanel);
        reportTablePanel.setLayout(reportTablePanelLayout);
        reportTablePanelLayout.setHorizontalGroup(
                reportTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(reportTabPanel, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE));
        reportTablePanelLayout.setVerticalGroup(
                reportTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(reportTablePanelLayout.createSequentialGroup()
                                .addComponent(reportTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 341,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        salesTabPanel.addTab("tab1", reportTablePanel);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel4.setText("Total sales:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel5.setText("Average sales:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel6.setText("Lowest sale:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel7.setText("Highest sale:");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel8.setText("Date");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel9.setText("Sales");

        totalSalesDate.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        totalSalesDate.setText("dd/mm/yy");

        totalSalesLabel.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        totalSalesLabel.setText("jLabel11");

        averageSalesDate.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        averageSalesDate.setText("jLabel12");

        averageSalesLabel.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        averageSalesLabel.setText("jLabel13");

        lowestSaleDate.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lowestSaleDate.setText("jLabel14");

        lowestSaleLabel.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lowestSaleLabel.setText("jLabel15");

        highestSaleDate.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        highestSaleDate.setText("jLabel16");

        highestSaleLabel.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        highestSaleLabel.setText("jLabel17");

        javax.swing.GroupLayout analysisTabPanelLayout = new javax.swing.GroupLayout(analysisTabPanel);
        analysisTabPanel.setLayout(analysisTabPanelLayout);
        analysisTabPanelLayout.setHorizontalGroup(
                analysisTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                analysisTabPanelLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(analysisTabPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4))
                                        .addGap(35, 35, 35)
                                        .addGroup(analysisTabPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(totalSalesDate)
                                                .addComponent(averageSalesDate)
                                                .addComponent(lowestSaleDate)
                                                .addComponent(highestSaleDate))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68,
                                                Short.MAX_VALUE)
                                        .addGroup(analysisTabPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(highestSaleLabel)
                                                .addComponent(lowestSaleLabel)
                                                .addComponent(averageSalesLabel)
                                                .addComponent(jLabel9)
                                                .addComponent(totalSalesLabel))
                                        .addGap(48, 48, 48)));
        analysisTabPanelLayout.setVerticalGroup(
                analysisTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(analysisTabPanelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(analysisTabPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(analysisTabPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(totalSalesDate)
                                        .addComponent(totalSalesLabel))
                                .addGap(18, 18, 18)
                                .addGroup(analysisTabPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(averageSalesDate)
                                        .addComponent(averageSalesLabel))
                                .addGap(18, 18, 18)
                                .addGroup(analysisTabPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(highestSaleDate)
                                        .addComponent(highestSaleLabel))
                                .addGap(18, 18, 18)
                                .addGroup(analysisTabPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(lowestSaleDate)
                                        .addComponent(lowestSaleLabel))
                                .addContainerGap(133, Short.MAX_VALUE)));

        salesTabPanel.addTab("tab1", analysisTabPanel);

        jPanel1.add(salesTabPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 410, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRows(Rental aRental) {
        String id = aRental.getRentalId();
        String totalCost = aRental.getTotalCost().toString();
        Date date = aRental.getDateBooked();
        SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-yy");
        String dateRented = dateForm.format(date);

        String[] values = { id, dateRented, totalCost };
        model.addRow(values);
    }

    private void showReportBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_showReportBtnActionPerformed

        salesTabPanel.setSelectedIndex(0);
        Date startDate = startDateChooser.getDate();
        Date endDate = endDateChooser.getDate();
        long diff = endDate.getTime() - startDate.getTime();
        if (diff < 0) {
            JOptionPane.showMessageDialog(null, "Report end date cannot be before start date");
        } else {

            dateRangeRentals = rentals.getSpecificDateRentals(startDate, endDate);

            for (int i = 0; i < dateRangeRentals.size(); i++) {
                Rental currRental = dateRangeRentals.get(i);
                addRows(currRental);
                System.out.println(currRental.getTotalCost());
            }

        }
        // if any of date fields are empty throw error
        // if end date is greater than start date throw error
    }// GEN-LAST:event_showReportBtnActionPerformed

    private void generateAnalysisBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_generateAnalysisBtnActionPerformed
        // hide table & show new table
        salesTabPanel.setSelectedIndex(1);
        long totalSales = 0;
        long averageSales;

        Date startDate = startDateChooser.getDate();
        Date endDate = endDateChooser.getDate();
        long diff = endDate.getTime() - startDate.getTime();
        if (diff < 0) {
            JOptionPane.showMessageDialog(null, "Report end date cannot be before start date");
        } else {
            dateRangeRentals = rentals.getSpecificDateRentals(startDate, endDate);

            // calculate total sales
            for (int i = 0; i < dateRangeRentals.size(); i++) {
                Rental currRental = dateRangeRentals.get(i);
                totalSales = totalSales + currRental.getTotalCost();
            }
            totalSalesLabel.setText("RM " + Long.toString(totalSales));
            // calculate average
            averageSales = totalSales / dateRangeRentals.size();
            averageSalesLabel.setText("RM " + Long.toString(averageSales));

            // highest sale
            long max = 0;
            ArrayList<Long> rentCosts = new ArrayList<Long>();

            for (int i = 0; i < dateRangeRentals.size(); i++) {
                Rental currRental = dateRangeRentals.get(i);
                // Rental nextRental = dateRangeRentals.get(i + 1);
                // if (currRental.getTotalCost() > nextRental.getTotalCost() &&
                // currRental.getTotalCost() > highestRental) {
                // highestRental = nextRental.getTotalCost();
                // }
                rentCosts.add(currRental.getTotalCost());
            }

            max = Collections.max(rentCosts);

            System.out.println(max);

        }
    }// GEN-LAST:event_generateAnalysisBtnActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel analysisTabPanel;
    private javax.swing.JLabel averageSalesDate;
    private javax.swing.JLabel averageSalesLabel;
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private javax.swing.JButton generateAnalysisBtn;
    private javax.swing.JLabel highestSaleDate;
    private javax.swing.JLabel highestSaleLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lowestSaleDate;
    private javax.swing.JLabel lowestSaleLabel;
    private javax.swing.JScrollPane reportTabPanel;
    private javax.swing.JPanel reportTablePanel;
    private javax.swing.JTable salesReportTable;
    private javax.swing.JTabbedPane salesTabPanel;
    private javax.swing.JButton showReportBtn;
    private javax.swing.JPanel sidePanel;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JLabel totalSalesDate;
    private javax.swing.JLabel totalSalesLabel;
    // End of variables declaration//GEN-END:variables
}
