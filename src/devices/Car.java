package devices;

public class Car {
    String color;
    double mileage;
    boolean isRunning;
    final String make;
    final String model;
    public Double price;

    public Car(String color, double mileage, String make, String model){
        this.color = color;
        this.mileage = mileage;
        this.make = make;
        this.model = model;
    }

    public void turnOn(){
        this.isRunning = true;
        System.out.println("You start " + this.make + " " + this.model);
    }

    public void turnOff(){
        this.isRunning = false;
        System.out.println("You stop " + this.make + " " + this.model);
    }

    @Override
    public String toString() {
        return this.make + " " + this.model + " " + this.color + " " + this.mileage + " " + this.price;
    }
}
