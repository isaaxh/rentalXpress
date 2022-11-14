import java.util.UUID;

public class Car {
    private String make;
    private String model;
    private Number year;
    private String carId;

    public Car(String aMake, String aModel, Number aYear) {
        make = aMake;
        model = aModel;
        year = aYear;
        carId = UUID.randomUUID().toString();

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

    public Number getYear() {
        return year;
    }


    public void setYear(Number year) {
        this.year = year;
    }

    public String getId() {
        return carId;
    }
}
