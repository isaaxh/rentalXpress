package HelperClasses;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Rental {
    private String rentalId;
    private String carId;
    private String userId;
    private Date dateBooked;
    private Date startDate;
    private Date endDate;
    private long totalCost;

    public Date getDateBooked() {
        return dateBooked;
    }

    public String getCarId() {
        return carId;
    }

    public String getUserId() {
        return userId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public long setCarId(String aCarId) {
        carId = aCarId;
        getTotalCost();
        return totalCost;
    }

    public long setStartDate(Date aStartDate) {
        startDate = aStartDate;
        getTotalCost();
        return totalCost;
    }

    public long setEndDate(Date anEndDate) {
        endDate = anEndDate;
        getTotalCost();
        return totalCost;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getRentalId() {
        return rentalId;
    }

    AllCars cars = new AllCars();

    public Long getTotalCost() {
        long RentalStartDate = startDate.getTime();
        long RentalEndDate = endDate.getTime();
        long diff = RentalEndDate - RentalStartDate;
        long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        Car car = cars.getCar(carId);
        totalCost = car.getPrice() * days;
        return totalCost;
    }

    public Rental(String aRentalId, String aCarId, String aUserId, Date aStartDate, Date aEndDate,
            Date aDateBooked) {
        rentalId = aRentalId;
        carId = aCarId;
        userId = aUserId;
        startDate = aStartDate;
        endDate = aEndDate;
        dateBooked = aDateBooked;
    }

}
