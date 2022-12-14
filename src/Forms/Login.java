package Forms;

import HelperClasses.AllCustomers;
import HelperClasses.Customer;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    String email;
    String password;
    Customer loggedCustomer;

    AllCustomers customers = new AllCustomers();

    public Login() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        loginComponentsPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        passFieldPassword = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameLabel.setBackground(new java.awt.Color(255, 255, 255));

        headerPanel.setBackground(new java.awt.Color(0, 0, 204));

        headerLabel.setBackground(new java.awt.Color(254, 254, 254));
        headerLabel.setFont(new java.awt.Font("Ubuntu", 1, 28)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(254, 254, 254));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("RentalXpress Login");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        loginComponentsPanel.setBackground(new java.awt.Color(255, 255, 255));

        passwordLabel.setBackground(new java.awt.Color(247, 247, 254));
        passwordLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password:");

        textFieldEmail.setBackground(new java.awt.Color(253, 251, 251));
        textFieldEmail.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        textFieldEmail.setForeground(new java.awt.Color(17, 17, 1));
        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        labelEmail.setBackground(new java.awt.Color(247, 247, 254));
        labelEmail.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmail.setText("Email:");

        btnLogin.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        passFieldPassword.setBackground(new java.awt.Color(253, 251, 251));
        passFieldPassword.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N

        registerBtn.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginComponentsPanelLayout = new javax.swing.GroupLayout(loginComponentsPanel);
        loginComponentsPanel.setLayout(loginComponentsPanelLayout);
        loginComponentsPanelLayout.setHorizontalGroup(
            loginComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginComponentsPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(loginComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmail)
                    .addComponent(passwordLabel)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(loginComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(textFieldEmail)
                    .addComponent(registerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        loginComponentsPanelLayout.setVerticalGroup(
            loginComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginComponentsPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(loginComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addGap(18, 18, 18)
                .addGroup(loginComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(loginComponentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout usernameLabelLayout = new javax.swing.GroupLayout(usernameLabel);
        usernameLabel.setLayout(usernameLabelLayout);
        usernameLabelLayout.setHorizontalGroup(
            usernameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(usernameLabelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(loginComponentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        usernameLabelLayout.setVerticalGroup(
            usernameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernameLabelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginComponentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registerBtnActionPerformed
        dispose();
        Registration registerPage = new Registration();
        registerPage.setVisible(true);

    }// GEN-LAST:event_registerBtnActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLoginActionPerformed
        email = textFieldEmail.getText();
        password = passFieldPassword.getText();

        if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter username");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter password");
        }

        // Customer currentCustomer = new Customer(email, password);
        loggedCustomer = customers.customerLogin(email, password);

        if (loggedCustomer == null) {
            JOptionPane.showMessageDialog(null, "Incorrect credentials, please try again!");
        } else {

            dispose();
            if (email.equals("admin@a.com")) {
                AdminDashboard adminDB = new AdminDashboard(loggedCustomer);
                adminDB.loggedInCustomer = loggedCustomer;
                adminDB.setVisible(true);
            } else {
                CustomerDashboard customerDB = new CustomerDashboard(loggedCustomer);
                customerDB.setVisible(true);
            }

        }
    }// GEN-LAST:event_btnLoginActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_textFieldEmailActionPerformed
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JPanel loginComponentsPanel;
    private javax.swing.JPasswordField passFieldPassword;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JPanel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
