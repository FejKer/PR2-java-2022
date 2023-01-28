package devices;

public class Diesel extends Car {
    public Diesel(String color, double mileage, String producer, String model) {
        super(color, mileage, producer, model);
    }

    @Override
    void refuel() {
        System.out.println("You refuel tank with diesel fuel.");
    }
}
