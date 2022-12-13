package Forms;

import HelperClasses.AllCustomers;
import HelperClasses.Customer;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerManagement extends CommonFunctionality {

    public CustomerManagement(Customer aLoggedInCustomer) {
        initComponents();
        loggedInCustomer = aLoggedInCustomer;
        addDataToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        lebelCustomerManagement = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        nameTextInput = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        emailTextInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordTextInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        confirmPasswordTextInput = new javax.swing.JTextField();
        mainMenuBtn = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        customerIdLabel = new javax.swing.JLabel();
        customerIdTextInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(217, 217, 217));

        sidePanel.setBackground(new java.awt.Color(7, 16, 110));
        sidePanel.setForeground(new java.awt.Color(24, 16, 182));

        lebelCustomerManagement.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lebelCustomerManagement.setForeground(new java.awt.Color(254, 254, 254));
        lebelCustomerManagement.setText("Customer Management");

        jPanel1.setBackground(new java.awt.Color(7, 16, 110));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(7, 16, 110));

        labelName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        labelName.setForeground(new java.awt.Color(254, 254, 254));
        labelName.setText("Name:");

        labelEmail.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(254, 254, 254));
        labelEmail.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Confirm Password:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelEmail)
                    .addComponent(labelName)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTextInput)
                    .addComponent(emailTextInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordTextInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmPasswordTextInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(nameTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmail)
                    .addComponent(emailTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(passwordTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(confirmPasswordTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        mainMenuBtn.setText("Main Menu");
        mainMenuBtn.setPreferredSize(new java.awt.Dimension(90, 25));
        mainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuBtnActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.setPreferredSize(new java.awt.Dimension(90, 30));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.setPreferredSize(new java.awt.Dimension(90, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        customerIdLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        customerIdLabel.setForeground(new java.awt.Color(254, 254, 254));
        customerIdLabel.setText("CustomerId: ");

        customerIdTextInput.setEnabled(false);

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(sidePanelLayout.createSequentialGroup()
                                .addComponent(mainMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lebelCustomerManagement)
                                .addGap(18, 18, 18))))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(customerIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerIdTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lebelCustomerManagement))
                .addGap(30, 30, 30)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerIdLabel)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(customerIdTextInput, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "Name", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);
        customerTable.getAccessibleContext().setAccessibleName("tableCustomerList");

        jLabel1.setBackground(new java.awt.Color(29, 30, 36));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 36));
        jLabel1.setText("Registered Customers");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String customerId= customerIdTextInput.getText();
        if (customerId.equals("")) {
            JOptionPane.showMessageDialog(null, "Please select a customer to delete");
            return;
        }
        int SelectedRow = customerTable.getSelectedRow();
        customers.removeCustomer(customerId);
        ((DefaultTableModel) customerTable.getModel()).removeRow(SelectedRow);
        // addDataToTable();
        JOptionPane.showMessageDialog(null, "Customer deleted successfully");

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEditActionPerformed
        boolean passwordEdited = false;
        String customerId = customerIdTextInput.getText();
        if (customerId.equals("")) {
            JOptionPane.showMessageDialog(null, "Please select a customer to edit");
            return;
        }
        if (!passwordTextInput.getText().equals("")) {
            passwordEdited = true;
        }
        if (nameTextInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Name is mandatory");
        } else if (passwordEdited && !passwordTextInput.getText().equals(confirmPasswordTextInput.getText())) {
            JOptionPane.showMessageDialog(null, "Passwords don't match ");
        } else {
            Customer editedCustomer = new Customer(customerIdTextInput.getText(), nameTextInput.getText(),
                    emailTextInput.getText(),
                    passwordEdited ? passwordTextInput.getText() : loggedInCustomer.getPassword());
            customers.EditCustomer(customerIdTextInput.getText(), editedCustomer);
            JOptionPane.showMessageDialog(null, "Changes saved!");
            addDataToTable();
        }
    }// GEN-LAST:event_btnEditActionPerformed

    private void mainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mainMenuBtnActionPerformed
        backToMainMenu();
    }// GEN-LAST:event_mainMenuBtnActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        // throws FileNotFoundException, IOException {// GEN-FIRST:event_createUserButtonActionPerformed
        String Password = passwordTextInput.getText();
        String ConfirmPassword = confirmPasswordTextInput.getText();
        String Name = nameTextInput.getText();
        String Email = emailTextInput.getText();

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
            addDataToTable();
            JOptionPane.showMessageDialog(null, "new user created");
        }
    }// GEN-LAST:event_btnAddActionPerformed
    AllCustomers customers = new AllCustomers();

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_customerTableMouseClicked
        int SelectedRow = customerTable.getSelectedRow();
        String customerId = customerTable.getValueAt(SelectedRow, 0).toString();
        Customer selectedCustomer = customers.getCustomer(customerId);
        customerIdTextInput.setText(selectedCustomer.getId());
        nameTextInput.setText(selectedCustomer.getName());
        emailTextInput.setText(selectedCustomer.getEmail());

    }// GEN-LAST:event_customerTableMouseClicked

    private void addDataToTable() {
        DefaultTableModel customerDefaultTableModel = (DefaultTableModel) customerTable.getModel();

        ArrayList<Customer> allCustomers = customers.getAllCustomers();
        int customersArrSize = allCustomers.size();

        customerDefaultTableModel.getDataVector().removeAllElements();
        if (customersArrSize > 0) {

            for (int i = 0; i < customersArrSize; i++) {
                Customer currCustomer = allCustomers.get(i);
                if (!currCustomer.getEmail().equals("admin@a.com")) {
                    String tableData[] = { currCustomer.getId(),
                            currCustomer.getName(),
                            currCustomer.getEmail()
                    };
                    customerDefaultTableModel.addRow(tableData);
                }
            }
        }

    }

    private Boolean validateEmail(String emailAddress) {
        String regexPattern = "^(.+)@(\\S+)$";
        return Pattern.compile(regexPattern).matcher(emailAddress).matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JTextField confirmPasswordTextInput;
    private javax.swing.JLabel customerIdLabel;
    private javax.swing.JTextField customerIdTextInput;
    private javax.swing.JTable customerTable;
    private javax.swing.JTextField emailTextInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel lebelCustomerManagement;
    private javax.swing.JButton mainMenuBtn;
    private javax.swing.JTextField nameTextInput;
    private javax.swing.JTextField passwordTextInput;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
