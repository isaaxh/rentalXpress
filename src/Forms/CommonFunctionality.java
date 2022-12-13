package Forms;

import HelperClasses.Customer;


abstract public class CommonFunctionality extends javax.swing.JFrame {
    protected Customer loggedInCustomer;

    protected void backToMainMenu() {
        dispose();
        if (loggedInCustomer.getEmail().equals("admin@a.com")) {
            new AdminDashboard(loggedInCustomer).setVisible(true);
        } else {
            new CustomerDashboard(loggedInCustomer).setVisible(true);
        }
    }

    // Using method overloading
    protected void changeWindow(String windowName) {
        dispose();
        switch (windowName) {
            case "userRentalPage":
                new UserRentalPage(loggedInCustomer).setVisible(true);
                break;
            case "customerBookingHistory":
                new CustomerBookingHistory(loggedInCustomer).setVisible(true);
                break;
            case "editProfile":
                new EditProfile(loggedInCustomer).setVisible(true);
                break;
            case "login":
                new Login().setVisible(true);
                break;
            default:
                System.out.println("window name is not valid: " + windowName);
        }
    }

    protected void changeWindow(String windowName, boolean isAdmin) {
        dispose();
        switch (windowName) {
            case "carManagement":
                new CarManagement(loggedInCustomer).setVisible(true);
                break;
            case "adminCarRental":
                new AdminRentalPage(loggedInCustomer).setVisible(true);
                break;
            case "salesReport":
                new SalesReport(loggedInCustomer).setVisible(true);
                break;
            case "customerManagement":
                new CustomerManagement(loggedInCustomer).setVisible(true);
                break;
            case "editProfile":
                new EditProfile(loggedInCustomer).setVisible(true);
                break;
            case "logout":
                new Login().setVisible(true);
                break;
            default:
                System.out.println("window name is not valid: " + windowName);
        }
    }

}
