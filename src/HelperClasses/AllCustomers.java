package HelperClasses;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AllCustomers {

    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public AllCustomers() {
        getUserData();
    }

    private void storeUserData() {
        PrintWriter writer;
        try {
            writer = new PrintWriter("Customers.txt");
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        for (int i = 0; i < customers.size(); i++) {

            Customer currCus = customers.get(i);
            String userData = currCus.getId() + "|" + currCus.getName() + "|" + currCus.getEmail() + "|"
                    + currCus.getPassword();
            try {
                saveToFile(userData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void getUserData() {
        File file = new File("Customers.txt");
        Scanner s;
        try {
            s = new Scanner(file);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] items = line.split("\\|");
                Customer currCus = new Customer(items[0], items[1], items[2], items[3]);
                customers.add(currCus);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void saveToFile(String text) throws IOException {
        BufferedWriter outStream = new BufferedWriter(new FileWriter("Customers.txt", true));
        outStream.write(text);
        outStream.newLine();
        outStream.close();
    }

    public ArrayList<Customer> getAllCustomers() {
        return customers;
    }

    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
        storeUserData();
    }

    public void removeCustomer(String customerId) {
        int arrSize = customers.size();
        for (int i = 0; i < arrSize; i++) {
            Customer currentCus = customers.get(i);
            if (currentCus.getId().equals(customerId)) {
                customers.remove(i);
                arrSize--;
            }
        }
        storeUserData();
    }

    public Customer getCustomer(String customerId) {
        int arrSize = customers.size();
        for (int i = 0; i < arrSize; i++) {
            Customer currentCus = customers.get(i);
            if (currentCus.getId().equals(customerId)) {
                return currentCus;
            }
        }
        return null;
    }

    public Boolean customerEmailExists(String email) {
        int arrSize = customers.size();
        for (int i = 0; i < arrSize; i++) {
            Customer currCus = customers.get(i);
            if (currCus.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public Customer customerLogin(String email, String password) {
        int arrSize = customers.size();
        for (int i = 0; i < arrSize; i++) {
            Customer currentCus = customers.get(i);
            if (currentCus.getEmail().equals(email) && currentCus.checkPassword(password)) {
                return currentCus;
            }
        }
        return null;
    }

    public void EditCustomer(String customerId, Customer editedCustomer) {
        for (int i = 0; i < customers.size(); i++) {
            Customer currCus = customers.get(i);
            if (currCus.getId().equals(customerId)) {
                customers.remove(i);
                customers.add(i, editedCustomer);
            }
            storeUserData();
        }
    }

}
