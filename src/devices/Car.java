package devices;

import creatures.Human;
import main.Sellable;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements Sellable, Comparable<Car> {
    private String color;
    private double mileage;
    private boolean isRunning;
    private final String producer;
    private final String model;
    String vin;
    List<Transaction> transactions;
    Human owner;

    public Car(String color, double mileage, String producer, String model){
        this.color = color;
        this.mileage = mileage;
        this.producer = producer;
        this.model = model;
        transactions = new ArrayList<>();
    }

    public int getTransactions() {
        return transactions.size();
    }

    public Human getOwner() {
        return owner;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double price) {
        this.value = price;
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

    public boolean sellerBuyerCheck(Human seller, Human buyer) {
        for (Transaction t:
             transactions) {
            return t.seller.equals(seller) && t.buyer.equals(buyer);
        }
        return false;
    }

    public boolean wasAnOwner(Human human) {
        for (Transaction t:
             transactions) {
            return t.buyer.equals(human) || t.seller.equals(human);
        }
        return false;
    }

    abstract void refuel();

    @Override
    public String toString() {
        return this.producer + " " + this.model + " " + this.color + " " + this.mileage + " " + this.value;
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (!buyer.hasACar(this)) throw new Exception("nie ma fury");
        if (!seller.hasSpace()) throw new Exception("nie ma miejsca");
        if (seller.getCash() < price) throw new Exception("nie ma kasy");
        if (!getOwner().equals(seller)) throw new Exception("sprzedawca oszukuje~!!!!!");


        transactions.add(new Transaction(buyer, seller, price));
        //this.owners.add(buyer);
        buyer.addCar(this);
        seller.removeCar(this);
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        System.out.println("git");
    }

    @Override
    public int compareTo(Car o) {
        return this.vin.compareTo(o.vin);
    }
}
