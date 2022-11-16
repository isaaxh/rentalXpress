package HelperClasses;

import java.time.LocalDate;

public class Rental {
    private String rentalId;
    private String carId;
    private String userId;
    private String dateBooked;
    private String startDate;
    private String endDate;

    public String getDateBooked() {
        return dateBooked;
    }

    public String getCarId() {
        return carId;
    }

    public String getUserId() {
        return userId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getRentalId() {
        return rentalId;
    }

    public Rental(String rentalId, String aCarId, String aUserId, String aStartDate, String aEndDate,
            String aDateBooked) {
        rentalId = aEndDate;
        carId = aCarId;
        userId = aUserId;
        startDate = aStartDate;
        endDate = aEndDate;
        dateBooked = aDateBooked;
    }

}
