package devices;

import creatures.Human;
import main.Sellable;

public class Phone extends Device implements Sellable {
    boolean isAndroid;
    int chargeLevel;

    public Phone(String producer, String model, int yearOfProduction, boolean isAndroid) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.isAndroid = isAndroid;
    }

    @Override
    public void turnOn() {
        System.out.println("Wciskasz przycisk");
        System.out.println("Czekasz");
        System.out.println("Telefon bangla");
    }

    public void chargePhone() {
        chargeLevel = 100;
        System.out.println("Naładowałeś telefon do pełna");
    }

    public void usePhone() {
        if (!isOn) {
            System.out.println("Telefon jest wyłączony");
        }
        if (isAndroid) {
            chargeLevel -= 20;
        } else {
            chargeLevel -= 50;
        }
        if (chargeLevel <= 0) {
            isOn = false;
        }
    }

    @Override
    public String toString() {
        return this.producer + " " + this.model + " " + this.yearOfProduction;
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (this.equals(seller.getPhone()) && buyer.getCash() >= price) {
            seller.setCash(seller.getCash() + price);
            buyer.setCash(buyer.getCash() - price);
            buyer.setPhone(this);
            seller.setPhone(null);
            System.out.println("Transakcja powiodła się");
        } else {
            System.out.println("Transakcja nie doszła do skutku");
        }
    }
}
