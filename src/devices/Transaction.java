package devices;

import creatures.Human;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    Human buyer;
    Human seller;
    Double price;
    LocalDateTime timeOfTransaction;

    public Transaction(Human buyer, Human seller, Double price) {
        this.buyer = buyer;
        this.seller = seller;
        this.price = price;
        timeOfTransaction = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return buyer.getFirstName() + " " + buyer.getLastName() + " kupił samochód od " + seller.getFirstName() + " " + seller.getLastName() + " za " + price + " o " + timeOfTransaction.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }
}
