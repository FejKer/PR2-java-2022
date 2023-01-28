package devices;

public class LPG extends Car {
    public LPG(String color, double mileage, String producer, String model) {
        super(color, mileage, producer, model);
    }

    @Override
    void refuel() {
        System.out.println("You refuel tank with LPG");
    }
}
