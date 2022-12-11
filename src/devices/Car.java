package devices;

public class Car {
    String color;
    double mileage;
    boolean isRunning;
    final String producer;
    final String model;
    public Double price;

    public Car(String color, double mileage, String producer, String model){
        this.color = color;
        this.mileage = mileage;
        this.producer = producer;
        this.model = model;
    }

    public void turnOn(){
        this.isRunning = true;
        System.out.println("Odpalasz " + this.producer + " " + this.model);
    }

    public void turnOff(){
        this.isRunning = false;
        System.out.println("Gasisz " + this.producer + " " + this.model);
    }

    @Override
    public String toString() {
        return this.producer + " " + this.model + " " + this.color + " " + this.mileage + " " + this.price;
    }
}
