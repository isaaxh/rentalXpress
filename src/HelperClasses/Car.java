package HelperClasses;

public class Car {
    private String make;
    private String model;
    private String year;
    private String carId;
    private long price;

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    private Boolean isAvailable;

    public Boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Car(String aCarId, String aMake, String aModel, String aYear, Boolean carAvailable, long Price) {
        make = aMake;
        model = aModel;
        year = aYear;
        carId = aCarId;
        isAvailable = carAvailable;
        price = Price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getId() {
        return carId;
    }
}
