package Forms;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author isaaxh
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        welcomeMessage = new javax.swing.JPanel();
        labelWelcomeMessage = new javax.swing.JLabel();
        btnCarManagement = new javax.swing.JButton();
        btnCarRental = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnEditProfile = new javax.swing.JButton();
        btnCustomerRegistration = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(219, 219, 221));

        welcomeMessage.setBackground(new java.awt.Color(50, 50, 52));
        welcomeMessage.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N

        labelWelcomeMessage.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        labelWelcomeMessage.setForeground(new java.awt.Color(254, 254, 254));
        labelWelcomeMessage.setText("Welcome Admin!");

        javax.swing.GroupLayout welcomeMessageLayout = new javax.swing.GroupLayout(welcomeMessage);
        welcomeMessage.setLayout(welcomeMessageLayout);
        welcomeMessageLayout.setHorizontalGroup(
            welcomeMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomeMessageLayout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(labelWelcomeMessage)
                .addGap(236, 236, 236))
        );
        welcomeMessageLayout.setVerticalGroup(
            welcomeMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomeMessageLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(labelWelcomeMessage)
                .addGap(65, 65, 65))
        );

        btnCarManagement.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnCarManagement.setText("Car Management");
        btnCarManagement.setPreferredSize(new java.awt.Dimension(250, 30));
        btnCarManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarManagementActionPerformed(evt);
            }
        });

        btnCarRental.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnCarRental.setText("Car Rental Management");
        btnCarRental.setPreferredSize(new java.awt.Dimension(250, 30));
        btnCarRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarRentalActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnLogOut.setText("Log out");
        btnLogOut.setPreferredSize(new java.awt.Dimension(250, 30));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnEditProfile.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnEditProfile.setText("Edit Profile");
        btnEditProfile.setPreferredSize(new java.awt.Dimension(250, 30));

        btnCustomerRegistration.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnCustomerRegistration.setText("Customer Management");
        btnCustomerRegistration.setPreferredSize(new java.awt.Dimension(250, 30));
        btnCustomerRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerRegistrationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomeMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarRental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(255, 255, 255))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(welcomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnCarManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarRental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCustomerRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        changeWindow("logout");
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnCarManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarManagementActionPerformed
        changeWindow("carManagement");
    }//GEN-LAST:event_btnCarManagementActionPerformed

    private void btnCarRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarRentalActionPerformed
        changeWindow("carRental");
    }//GEN-LAST:event_btnCarRentalActionPerformed

    private void btnCustomerRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerRegistrationActionPerformed
        changeWindow("customerRegistration");
    }//GEN-LAST:event_btnCustomerRegistrationActionPerformed

    /**
     * @param args the command line arguments
     */
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    public void changeWindow(String windowName) {
        dispose();
        switch (windowName) {
            case "carManagement":
                CarManagement carM = new CarManagement();
                carM.setVisible(true);
                break;
//            case "carRegistration":
//                CarRegistration carRegPage = new CarRegistration();
//                System.out.println(carRegPage instanceof CarRegistration);
//                carRegPage.setVisible(true);
//                break;
            case "carRental":
                AdminRentalPage carRental = new AdminRentalPage();
                carRental.setVisible(true);
                break;
            case "customerRegistration":
                Registration cusRegistration = new Registration();
                cusRegistration.setVisible(true);
                break;
//            case "editProfile":
//                // code block
//                EditProfile profilePage = new EditProfile();
//                profilePage.setVisible(true);
//                break;
            case "logout":
                Login loginPage = new Login();
                loginPage.setVisible(true);
                break;
            default:
            // code block

        }
    }

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnCarManagement;
    private javax.swing.JButton btnCarRental;
    private javax.swing.JButton btnCustomerRegistration;
    private javax.swing.JButton btnEditProfile;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel labelWelcomeMessage;
    private javax.swing.JPanel welcomeMessage;
    // End of variables declaration//GEN-END:variables
}