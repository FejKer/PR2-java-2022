package devices;

public class Phone {
    final int yearOfProduction;
    final String brand;
    final String model;
    boolean isOn;

    public Phone(String brand, String model, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.model + " " + this.yearOfProduction;
    }
}
