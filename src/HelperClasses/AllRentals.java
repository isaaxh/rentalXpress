package HelperClasses;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AllRentals {
    ArrayList<Rental> allRentals = new ArrayList<Rental>();

    public AllRentals() {
        getRentals();
    }

    public ArrayList<Rental> getAllRental() {
        return allRentals;
    }

    private void storeRentalData() {
        PrintWriter writer;
        try {
            writer = new PrintWriter("Rentals.txt");
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        for (int i = 0; i < allRentals.size(); i++) {

            Rental currRental = allRentals.get(i);
            String rentalData = currRental.getRentalId() + "|" + currRental.getCarId() + "|" + currRental.getUserId()
                    + "|"
                    + currRental.getStartDate() + "|" + currRental.getEndDate() + "|" + currRental.getDateBooked();
            try {
                saveToFile(rentalData);
            } catch (IOException e) {
                System.out.println("could not add customer: " + currRental.getRentalId());
                e.printStackTrace();
            }
        }
    }

    private void getRentals() {
        File file = new File("Rentals.txt");
        Scanner s;
        try {
            s = new Scanner(file);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] items = line.split("\\|");
                Rental currRental = new Rental(items[0], items[1], items[2], items[3], items[4], items[5]);
                allRentals.add(currRental);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void saveToFile(String text) throws IOException {
        BufferedWriter outStream = new BufferedWriter(new FileWriter("Rentals.txt", true));
        outStream.write(text);
        outStream.newLine();
        outStream.close();
    }

    public void addRental(Rental newRental) {
        allRentals.add(newRental);
        storeRentalData();
    }

    public void removeRental(String RentalId) {
        int arrSize = allRentals.size();
        for (int i = 0; i < arrSize; i++) {
            Rental currRental = allRentals.get(i);
            if (currRental.getRentalId().equals(RentalId)) {
                allRentals.remove(i);
            }
        }
        storeRentalData();
    }

}
