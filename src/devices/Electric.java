package devices;

public class Electric extends Car {
    public Electric(String color, double mileage, String producer, String model) {
        super(color, mileage, producer, model);
    }

    @Override
    void refuel() {
        System.out.println("You recharge battery.");
    }
}
