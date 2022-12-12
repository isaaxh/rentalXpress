package HelperClasses;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
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
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            String startDateStr = formatter.format(currRental.getStartDate());
            String endDateStr = formatter.format(currRental.getEndDate());
            String bookedDate = formatter.format(currRental.getDateBooked());
            String rentalData = currRental.getRentalId() + "|" + currRental.getCarId() + "|" + currRental.getUserId()
                    + "|"
                    + startDateStr + "|" + endDateStr + "|" + bookedDate + "|" + currRental.getTotalCost();
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
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
                try {
                    Date startDate = formatter.parse(items[3]);
                    Date endDate = formatter.parse(items[4]);
                    Date bookingDate = formatter.parse(items[5]);
                    Rental currRental = new Rental(items[0], items[1], items[2], startDate, endDate, bookingDate);
                    allRentals.add(currRental);
                } catch (ParseException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
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

    public ArrayList<Rental> getSpecificDateRentals(Date aStartDate, Date aEndDate) {
        ArrayList<Rental> finalRentals = new ArrayList<Rental>();

        for (int i = 0; i < allRentals.size(); i++) {
            Rental currRental = allRentals.get(i);
            if (currRental.getDateBooked().after(aStartDate) && currRental.getDateBooked().before(aEndDate)) {
                finalRentals.add(currRental);
            }
        }
        return finalRentals;
    }

}
