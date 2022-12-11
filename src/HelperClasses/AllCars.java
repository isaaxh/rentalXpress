package HelperClasses;

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
        getCars();
        System.out.println("customers");
    }

    private void storeCarData() {
        PrintWriter writer;
        try {
            writer = new PrintWriter("Cars.txt");
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        for (int i = 0; i < allCars.size(); i++) {

            Car currCar = allCars.get(i);
            String carData = currCar.getId() + "|" + currCar.getMake() + "|" + currCar.getModel() + "|"
                    + currCar.getYear() + "|" + currCar.isAvailable() + "|" + currCar.getPrice();
            try {
                saveToFile(carData);
            } catch (IOException e) {
                System.out.println("could store car data: " + currCar.getId());
                e.printStackTrace();
            }
        }
    }

    private void getCars() {
        File file = new File("Cars.txt");
        Scanner s;
        try {
            s = new Scanner(file);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] items = line.split("\\|");
                System.out.println("Available ====>>>> " + items[4].equals("true"));
                Car currCar = new Car(items[0], items[1], items[2], items[3], items[4].equals("true"),
                        Integer.parseInt(items[5]));
                allCars.add(currCar);
            }
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

    public ArrayList<Car> getAvailableCars() {
        ArrayList<Car> availableCars = new ArrayList<Car>();
        int arrSize = allCars.size();
        for (int i = 0; i < arrSize; i++) {
            Car currCar = allCars.get(i);
            if (currCar.isAvailable()) {
                availableCars.add(currCar);
            }
        }
        return availableCars;
    }

    public void addCar(Car newCar) {
        allCars.add(newCar);
        storeCarData();
    }

    public void removeCar(String carId) {
        int arrSize = allCars.size();
        System.out.println(arrSize);
        for (int i = 0; i < arrSize; i++) {
            System.out.println("I ran");
            Car currCar = allCars.get(i);

            if (currCar.getId().equals(carId)) {
                allCars.remove(i);
            }
            arrSize--;
        }
        storeCarData();
    }

    public void EditCar(String carId, Car EditedCar) {
        removeCar(carId);
        addCar(EditedCar);
    }

    public Car getCar(String carId) {
        int arrSize = allCars.size();
        for (int i = 0; i < arrSize; i++) {
            Car currCar = allCars.get(i);
            if (currCar.getId().equals(carId)) {
                return currCar;
            }
        }
        return null;
    }

}
