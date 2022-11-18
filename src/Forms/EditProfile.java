package Forms;

import HelperClasses.Customer;
import HelperClasses.AllCustomers;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author isaaxh
 */
public class EditProfile extends javax.swing.JFrame {

    Customer loggedUser;
    String pass;
    String comfirmedPass;

    AllCustomers customers = new AllCustomers();

    public EditProfile() {
        initComponents();

//        addPlaceholder(nameTextInput);
//        addPlaceholder(emailTextInput);
//        addPlaceholder(passTextInput);
//        addPlaceholder(confirmPassTextInput);
    }

    public EditProfile(Customer aLoggedUser) {
        loggedUser = aLoggedUser;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelCurrentName = new javax.swing.JLabel();
        labelCurrentEmail = new javax.swing.JLabel();
        labelCurrentPass = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nameTextInput = new javax.swing.JTextField();
        emailTextInput = new javax.swing.JTextField();
        passTextInput = new javax.swing.JPasswordField();
        confirmPassTextInput = new javax.swing.JPasswordField();
        btnDashboard = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(217, 217, 217));

        jPanel1.setBackground(new java.awt.Color(7, 16, 110));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Edit Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(24, 24, 24));
        jLabel3.setText("Current user details");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(24, 24, 24));
        jLabel6.setText("Name: ");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(24, 24, 24));
        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(24, 24, 24));
        jLabel8.setText("Password:");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(24, 24, 24));
        jLabel9.setText("Confirm Pass:");

        labelCurrentName.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        labelCurrentName.setForeground(new java.awt.Color(24, 24, 24));
        labelCurrentName.setText("Name");

        labelCurrentEmail.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        labelCurrentEmail.setForeground(new java.awt.Color(24, 24, 24));
        labelCurrentEmail.setText("email@mail.com");

        labelCurrentPass.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        labelCurrentPass.setForeground(new java.awt.Color(24, 24, 24));
        labelCurrentPass.setText("112233");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCurrentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelCurrentEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(labelCurrentPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelCurrentName))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelCurrentEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelCurrentPass))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(217, 217, 217));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 24, 24));
        jLabel4.setText("Enter new details");

        nameTextInput.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        nameTextInput.setPreferredSize(new java.awt.Dimension(90, 30));
        nameTextInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTextInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextInputFocusLost(evt);
            }
        });

        emailTextInput.setPreferredSize(new java.awt.Dimension(90, 30));
        emailTextInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextInputFocusLost(evt);
            }
        });
        emailTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextInputActionPerformed(evt);
            }
        });

        passTextInput.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        passTextInput.setPreferredSize(new java.awt.Dimension(90, 30));
        passTextInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTextInputFocusGained(evt);
            }
        });

        confirmPassTextInput.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        confirmPassTextInput.setText("Password");
        confirmPassTextInput.setPreferredSize(new java.awt.Dimension(90, 30));
        confirmPassTextInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPassTextInputFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameTextInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailTextInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passTextInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confirmPassTextInput, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                        .addGap(74, 74, 74))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addComponent(nameTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmPassTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btnDashboard.setText("Dashboard");
        btnDashboard.setPreferredSize(new java.awt.Dimension(120, 30));

        btnLogout.setText("Logout");
        btnLogout.setPreferredSize(new java.awt.Dimension(120, 30));

        btnSaveChanges.setText("Save changes");
        btnSaveChanges.setPreferredSize(new java.awt.Dimension(120, 30));
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void emailTextInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextInputActionPerformed

    private void nameTextInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextInputFocusGained
        if (nameTextInput.getText().equals("Name")) {
            nameTextInput.setText(null);
            nameTextInput.requestFocus();
            removePlaceholder(nameTextInput);
        }
    }//GEN-LAST:event_nameTextInputFocusGained

    private void emailTextInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextInputFocusGained
        if (emailTextInput.getText().equals("email@mail.com")) {
            emailTextInput.setText(null);
            emailTextInput.requestFocus();
            removePlaceholder(emailTextInput);
        }
    }//GEN-LAST:event_emailTextInputFocusGained

    private void passTextInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTextInputFocusGained
        if (passTextInput.getText().equals("Password")) {
            passTextInput.setText("");
            removePlaceholder(passTextInput);
        }
    }//GEN-LAST:event_passTextInputFocusGained

    private void confirmPassTextInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPassTextInputFocusGained
        if (confirmPassTextInput.getText().equals("Password")) {
            confirmPassTextInput.setText("");
            removePlaceholder(confirmPassTextInput);
        }
    }//GEN-LAST:event_confirmPassTextInputFocusGained

    private void nameTextInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextInputFocusLost
//        if (nameTextInput.getText().length() == 0) {
//            addPlaceholder(nameTextInput);
//            nameTextInput.setText("Name");
//        }
    }//GEN-LAST:event_nameTextInputFocusLost

    private void emailTextInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextInputFocusLost
//        if (emailTextInput.getText().length() == 0) {
//            addPlaceholder(emailTextInput);
//            emailTextInput.setText("email@mail.com");
//        }
    }//GEN-LAST:event_emailTextInputFocusLost

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed

        try {
            if (!nameTextInput.getText().equals("")) {
                loggedUser.setName(nameTextInput.getText());
                Customer editedCustomer = new Customer(loggedUser.getId(), nameTextInput.getText(),
                        loggedUser.getEmail(), loggedUser.getPassword());
                customers.EditCustomer(loggedUser.getId(), editedCustomer);

            }
            if (!emailTextInput.getText().equals("")) {
                loggedUser.setEmail(emailTextInput.getText());
            }

            if (!passTextInput.getText().equals("") && !confirmPassTextInput.getText().equals("")) {
                if (!checkingPass(passTextInput.getText(), confirmPassTextInput.getText())) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match!");
                } else {
                    loggedUser.setPassword(passTextInput.getText());

                }
            }

        } catch (HeadlessException e) {
            System.out.println("Something went wrong!");
        }
        System.out.println(loggedUser.getName());
        System.out.println(loggedUser.getEmail());
        System.out.println(loggedUser.getPassword());

    }//GEN-LAST:event_btnSaveChangesActionPerformed

    public void displayCurrentDetails(Customer aLoggedUser) {
        loggedUser = aLoggedUser;

        labelCurrentName.setText(loggedUser.getName());
        labelCurrentEmail.setText(loggedUser.getEmail());
        labelCurrentPass.setText(loggedUser.getPassword());

    }

//    public void addPlaceholder(JTextField textField) {
//        Font font = textField.getFont();
//        font = font.deriveFont(Font.ITALIC);
//        textField.setFont(font);
//        textField.setForeground(Color.gray);
//
//    }
    public void removePlaceholder(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.black);

    }

    public Boolean checkingPass(String aPass, String aConfirmedPass) {
        if (aConfirmedPass.equals(aPass)) {
            return true;
        } else {
            return false;
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
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JPasswordField confirmPassTextInput;
    private javax.swing.JTextField emailTextInput;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelCurrentEmail;
    private javax.swing.JLabel labelCurrentName;
    private javax.swing.JLabel labelCurrentPass;
    private javax.swing.JTextField nameTextInput;
    private javax.swing.JPasswordField passTextInput;
    // End of variables declaration//GEN-END:variables
}
