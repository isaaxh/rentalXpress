import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AllCars {
    private ArrayList<Car> allCars = new ArrayList<Car>();

    public AllCars() {
        getUserData();
        System.out.println("customers");
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

        for (int i = 0; i < allCars.size(); i++) {

            Car currCar = allCars.get(i);
            String carData = currCar.getMake() + "|" + currCar.getModel() + "|" + currCar.getYear();
            try {
                saveToFile(carData);
            } catch (IOException e) {
                System.out.println("could not add customer: " + currCar.getId());
                e.printStackTrace();
            }
        }
    }

    private void getUserData() {
        File file = new File("Cars.txt");
        Scanner s;
        try {
            s = new Scanner(file);
            // while (s.hasNextLine()) {
            // String line = s.nextLine();
            // String[] items = line.split("\\|");
            // Customer currCus = new Customer(items[0], items[1], items[2], items[3]);
            // customers.add(currCus);
            // }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void saveToFile(String text) throws IOException {
        BufferedWriter outStream = new BufferedWriter(new FileWriter("Cars.txt", true));
        outStream.write(text);
        outStream.newLine();
        outStream.close();
    }

    public ArrayList<Car> getAllCars() {
        return allCars;
    }

    public void addCar(Customer newCustomer) {
        allCars.add(newCustomer);
        storeUserData();
    }

    public void removeCustomer(String customerId) {
        int arrSize = allCars.size();
        for (int i = 0; i < arrSize; i++) {
            Customer currentCus = allCars.get(i);
            if (currentCus.getId().equals(customerId)) {
                allCars.remove(i);
            }
        }
        storeUserData();
    }

    public Customer getCustomer(String customerId) {
        int arrSize = allCars.size();
        for (int i = 0; i < arrSize; i++) {
            Customer currentCus = allCars.get(i);
            if (currentCus.getId().equals(customerId)) {
                return currentCus;
            }
        }
        return null;
    }

    public Customer customerLogin(String email, String password) {
        int arrSize = allCars.size();
        for (int i = 0; i < arrSize; i++) {
            Customer currentCus = allCars.get(i);
            if (currentCus.getEmail().equals(email) && currentCus.checkPassword(password)) {
                return currentCus;
            }
        }
        return null;
    }

}
