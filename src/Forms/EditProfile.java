package Forms;

import HelperClasses.Customer;
import HelperClasses.AllCustomers;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditProfile extends CommonFunctionality {

    AllCustomers customers = new AllCustomers();


    public EditProfile(Customer aLoggedUser) {
        loggedInCustomer = aLoggedUser;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mainMenuBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nameTextInput = new javax.swing.JTextField();
        emailTextInput = new javax.swing.JTextField();
        passTextInput = new javax.swing.JPasswordField();
        confirmPassTextInput = new javax.swing.JPasswordField();
        oldPasswordTextInput = new javax.swing.JPasswordField();
        btnSaveChanges = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(217, 217, 217));

        jPanel1.setBackground(new java.awt.Color(7, 16, 110));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Edit Profile");

        mainMenuBtn.setText("Main Menu");
        mainMenuBtn.setPreferredSize(new java.awt.Dimension(120, 30));
        mainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mainMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mainMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(24, 24, 24));
        jLabel3.setText("User Details");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(24, 24, 24));
        jLabel6.setText("Name: ");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(24, 24, 24));
        jLabel7.setText("Email (not changeable):");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(24, 24, 24));
        jLabel8.setText("Password:");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(24, 24, 24));
        jLabel9.setText("Confirm Pass:");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(24, 24, 24));
        jLabel10.setText("Old Password:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                                .addGap(18, 18, 18))
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

        nameTextInput.setText(loggedInCustomer.getName());

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
        emailTextInput.setText(loggedInCustomer.getEmail());

        passTextInput.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        passTextInput.setPreferredSize(new java.awt.Dimension(90, 30));
        passTextInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTextInputFocusGained(evt);
            }
        });

        confirmPassTextInput.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(confirmPassTextInput,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 185,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel3Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(nameTextInput,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 185,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(emailTextInput,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(passTextInput,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addComponent(oldPasswordTextInput,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 185,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(oldPasswordTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(passTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmPassTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

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
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 453,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21,
                                        Short.MAX_VALUE)
                                .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
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


    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            boolean passwordEdited = false;
            if (!passTextInput.getText().equals("")) {
                passwordEdited = true;
            }
            if (nameTextInput.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Name is mandatory");
            } else if (passwordEdited && !loggedInCustomer.checkPassword(oldPasswordTextInput.getText())) {
                JOptionPane.showMessageDialog(null, "Old password incorrect");
            } else if (passwordEdited && !passTextInput.getText().equals(confirmPassTextInput.getText())) {
                JOptionPane.showMessageDialog(null, "Passwords don't match ");
            } else {
                Customer editedCustomer = new Customer(loggedInCustomer.getId(), nameTextInput.getText(),
                        emailTextInput.getText(),
                        passwordEdited ? passTextInput.getText() : loggedInCustomer.getPassword());
                customers.EditCustomer(loggedInCustomer.getId(), editedCustomer);
                loggedInCustomer = editedCustomer;
                JOptionPane.showMessageDialog(null, "Changes saved!");
            }

        } catch (HeadlessException e) {
            System.out.println("Something went wrong!");
        }
        System.out.println("======");
        System.out.println(loggedInCustomer.getName());
        System.out.println(loggedInCustomer.getEmail());
        System.out.println(loggedInCustomer.getPassword());

        }// GEN-LAST:event_btnSaveChangesActionPerformed

    private void mainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mainMenuBtnActionPerformed
        // TODO add your handling code here:
        backToMainMenu();
    }// GEN-LAST:event_mainMenuBtnActionPerformed

    private void confirmPassTextInputFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_confirmPassTextInputFocusGained

    }// GEN-LAST:event_confirmPassTextInputFocusGained

    private void passTextInputFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_passTextInputFocusGained

    }// GEN-LAST:event_passTextInputFocusGained

    private void emailTextInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_emailTextInputActionPerformed

    }// GEN-LAST:event_emailTextInputActionPerformed

    private void emailTextInputFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_emailTextInputFocusLost

    }// GEN-LAST:event_emailTextInputFocusLost

    private void emailTextInputFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_emailTextInputFocusGained

    }// GEN-LAST:event_emailTextInputFocusGained

    private void nameTextInputFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_nameTextInputFocusLost

    }// GEN-LAST:event_nameTextInputFocusLost

    private void nameTextInputFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_nameTextInputFocusGained

    }// GEN-LAST:event_nameTextInputFocusGained

    public Boolean checkingPass(String aPass, String aConfirmedPass) {
        if (aConfirmedPass.equals(aPass)) {
            return true;
        } else {
            return false;
        }
    }

    // public static void main(String args[]) {
    // /* Set the Nimbus look and feel */
    // //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    // /* If Nimbus (introduced in Java SE 6) is not available, stay with the
    // default look and feel.
    // * For details see
    // http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
    // */
    // try {
    // for (javax.swing.UIManager.LookAndFeelInfo info :
    // javax.swing.UIManager.getInstalledLookAndFeels()) {
    // if ("Nimbus".equals(info.getName())) {
    // javax.swing.UIManager.setLookAndFeel(info.getClassName());
    // break;
    // }
    // }
    // } catch (ClassNotFoundException ex) {
    // java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (InstantiationException ex) {
    // java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (IllegalAccessException ex) {
    // java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    // java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // }
    // //</editor-fold>

    // /* Create and display the form */
    // // java.awt.EventQueue.invokeLater(new Runnable() {
    // // public void run() {
    // // new EditProfile().setVisible(true);
    // // }
    // // });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JPasswordField confirmPassTextInput;
    private javax.swing.JTextField emailTextInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JButton mainMenuBtn;
    private javax.swing.JTextField nameTextInput;
    private javax.swing.JPasswordField oldPasswordTextInput;
    private javax.swing.JPasswordField passTextInput;
    // End of variables declaration//GEN-END:variables
}