package main;

import creatures.Human;

public interface Sellable {
    public void sell(Human buyer, Human seller, Double price) throws Exception;
}
