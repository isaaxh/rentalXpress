/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import HelperClasses.Customer;

/**
 *
 * @author isaaxh
 */
public class CustomerDashboard extends CommonFunctionality {

    /**
     * Creates new form customerDashboard
     */
    private Customer loggedInUser;

    public CustomerDashboard(Customer aLoggedInUser) {
        loggedInCustomer = aLoggedInUser;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bookACarBtn = new javax.swing.JButton();
        bookingHistoryBtn = new javax.swing.JButton();
        editProfileBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        title.setText("Hello " + loggedInCustomer.getName() + ",");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

        bookACarBtn.setText("Book a car");
        bookACarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookACarBtnActionPerformed(evt);
            }
        });

        bookingHistoryBtn.setText("Booking history");
        bookingHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingHistoryBtnActionPerformed(evt);
            }
        });

        editProfileBtn.setText("Edit profile");
        editProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileBtnBtnActionPerformed(evt);
            }
        });
        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(title)
                                .addGap(285, 285, 285)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(44, Short.MAX_VALUE)
                                .addComponent(title)
                                .addGap(40, 40, 40)));

        logoutBtn.setBackground(new java.awt.Color(255, 51, 51));
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Log out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logoutBtn))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(bookACarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(bookingHistoryBtn)
                                .addGap(46, 46, 46)
                                .addComponent(editProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(155, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookingHistoryBtn)
                                        .addComponent(editProfileBtn)
                                        .addComponent(bookACarBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114,
                                        Short.MAX_VALUE)
                                .addComponent(logoutBtn)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookingHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bookingHistoryBtnActionPerformed
        // TODO add your handling code here:
        CustomerBookingHistory bookingHistory = new CustomerBookingHistory(loggedInCustomer);
        dispose();
        bookingHistory.setVisible(true);
    }// GEN-LAST:event_bookingHistoryBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_logoutBtnActionPerformed

    private void bookACarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bookACarBtnActionPerformed
        // TODO add your handling code here:
        UserRentalPage userRentalPage = new UserRentalPage(loggedInCustomer);
        dispose();
        userRentalPage.setVisible(true);

    }// GEN-LAST:event_bookACarBtnActionPerformed

    private void editProfileBtnBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bookACarBtnActionPerformed
        // TODO add your handling code here:
        EditProfile EditProfile = new EditProfile(loggedInCustomer);
        dispose();
        EditProfile.setVisible(true);

    }// GEN-LAST:event_bookACarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(Customer aLoggedInUser) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDashboard(aLoggedInUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookACarBtn;
    private javax.swing.JButton bookingHistoryBtn;
    private javax.swing.JButton editProfileBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}