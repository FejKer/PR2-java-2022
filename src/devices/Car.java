package devices;

import creatures.Human;
import main.Sellable;

public class Car extends Device implements Sellable {
    private String color;
    private double mileage;
    private boolean isRunning;
    private final String producer;
    private final String model;
    private Double price = 0.0;

    public Car(String color, double mileage, String producer, String model){
        this.color = color;
        this.mileage = mileage;
        this.producer = producer;
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void turnOn(){
        this.isRunning = true;
        System.out.println("Odpalasz " + this.producer + " " + this.model);
    }

    public void turnOff(){
        this.isRunning = false;
        System.out.println("Gasisz " + this.producer + " " + this.model);
    }

    public void drive() {
        System.out.println("Śmigasz furką");
        mileage += 100.0;
    }

    @Override
    public String toString() {
        return this.producer + " " + this.model + " " + this.color + " " + this.mileage + " " + this.price;
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (this.equals(seller.getCar()) && buyer.getCash() >= price) {
            seller.setCash(seller.getCash() + price);
            buyer.setCash(buyer.getCash() - price);
            buyer.setCar(this, true);
            seller.setCar(null, true);
            System.out.println("Transakcja powiodła się");
        } else {
            System.out.println("Transakcja nie doszła do skutku");
        }
    }
}
