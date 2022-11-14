
public class Car {
    private String make;
    private String model;
    private String year;
    private String carId;

    public Car(String aCarId, String aMake, String aModel, String aYear) {
        make = aMake;
        model = aModel;
        year = aYear;
        carId = aCarId;

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
