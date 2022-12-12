package Forms;

import HelperClasses.Customer;

public class CommonFunctionality extends javax.swing.JFrame {
    protected Customer loggedInCustomer;

    protected void backToMainMenu() {
        dispose();
        if (loggedInCustomer.getEmail().equals("admin@a.com")) {
            new AdminDashboard(loggedInCustomer).setVisible(true);
        } else {
            new CustomerDashboard(loggedInCustomer).setVisible(true);
        }
    }

    protected void changeWindow(String windowName) {
        dispose();
        switch (windowName) {
            case "carManagement":
                new CarManagement(loggedInCustomer).setVisible(true);
                break;
            case "adminCarRental":
                new AdminRentalPage().setVisible(true);
                break;
            case "customerManagement":
                new CustomerManagement().setVisible(true);
                break;
            case "editProfile":
                new EditProfile(loggedInCustomer).setVisible(true);
                break;
            case "logout":
                new Login().setVisible(true);
                break;
            default:
                // code block

        }
    }
}
