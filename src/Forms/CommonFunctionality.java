package Forms;

import HelperClasses.Customer;

public class CommonFunctionality extends javax.swing.JFrame {
    protected Customer loggedInCustomer;

    protected void backToMainMenu() {
        dispose();
        CustomerDashboard custDash = new CustomerDashboard(loggedInCustomer);
        custDash.setVisible(true);
    }
}
