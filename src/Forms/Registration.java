package Forms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import HelperClasses.AllCustomers;
import HelperClasses.Customer;

public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        formTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        createUserButton = new javax.swing.JButton();
        passwordTextInput = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        nameTextInput = new javax.swing.JTextField();
        emailTextInput = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        pasword1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        confirmPasswordTextInput = new javax.swing.JTextField();
        confirmPasswordLabel = new javax.swing.JLabel();
        pasword3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(102, 102, 102));

        formTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        formTitle.setForeground(new java.awt.Color(255, 255, 255));
        formTitle.setText("Registration form ");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(formTitle)
                                .addContainerGap(384, Short.MAX_VALUE)));
        headerPanelLayout.setVerticalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE));

        getContentPane().add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setText("Name");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        createUserButton.setText("Create User");
        createUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    createUserButtonActionPerformed(evt);
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        getContentPane().add(createUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 260, 50));

        passwordTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextInputActionPerformed(evt);
            }
        });
        getContentPane().add(passwordTextInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 110, 30));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 20));

        nameTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextInputActionPerformed(evt);
            }
        });
        getContentPane().add(nameTextInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 110, 30));

        emailTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextInputActionPerformed(evt);
            }
        });
        getContentPane().add(emailTextInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 110, 30));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabel.setText("Email");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, 20));

        pasword1.setText("password");
        pasword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasword1ActionPerformed(evt);
            }
        });
        getContentPane().add(pasword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 110, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 20));

        confirmPasswordTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordTextInputActionPerformed(evt);
            }
        });
        getContentPane().add(confirmPasswordTextInput,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 110, 30));

        confirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmPasswordLabel.setText("Confirm Password");
        getContentPane().add(confirmPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, 20));

        pasword3.setText("password");
        pasword3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasword3ActionPerformed(evt);
            }
        });
        getContentPane().add(pasword3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_passwordTextInputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_passwordTextInputActionPerformed

    private void nameTextInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameTextInputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_nameTextInputActionPerformed

    private void emailTextInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_emailTextInputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_emailTextInputActionPerformed

    AllCustomers customers = new AllCustomers();

    private Boolean validateEmail(String emailAddress) {
        String regexPattern = "^(.+)@(\\S+)$";
        return Pattern.compile(regexPattern).matcher(emailAddress).matches();
    }

    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt)
            throws FileNotFoundException, IOException {// GEN-FIRST:event_createUserButtonActionPerformed
        String Password = passwordTextInput.getText().toString();
        String ConfirmPassword = confirmPasswordTextInput.getText().toString();
        String Name = nameTextInput.getText().toString();
        String Email = emailTextInput.getText().toString();

        if (Name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name is mandatory");
        } else if (Email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email is mandatory");
        } else if (Password.equals("")) {
            JOptionPane.showMessageDialog(null, "Password is mandatory");
        } else if (!Password.equals(ConfirmPassword)) {

            JOptionPane.showMessageDialog(null, "Passwords don't match ");
        } else if (!validateEmail(Email)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Email");
        } else if (customers.customerEmailExists(Email)) {
            JOptionPane.showMessageDialog(null, "This customer already exists");

        } else {
            String newUserId = UUID.randomUUID().toString();
            Customer newCustomer = new Customer(newUserId, Name, Email, Password);
            customers.addCustomer(newCustomer);
            JOptionPane.showMessageDialog(null, "new user created");
        }
    }// GEN-LAST:event_createUserButtonActionPerformed

    private void pasword1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pasword1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_pasword1ActionPerformed

    private void confirmPasswordTextInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_confirmPasswordTextInputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_confirmPasswordTextInputActionPerformed

    private void pasword3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pasword3ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_pasword3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JTextField confirmPasswordTextInput;
    private javax.swing.JButton createUserButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextInput;
    private javax.swing.JLabel formTitle;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextInput;
    private javax.swing.JTextField pasword1;
    private javax.swing.JTextField pasword3;
    // End of variables declaration//GEN-END:variables
}
