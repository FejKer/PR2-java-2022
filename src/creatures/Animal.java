package creatures;

import main.Sellable;

public class Animal implements Sellable {
    private static final double DEFAULT_DOG_WEIGHT = 10.5;
    private static final double DEFAULT_CAT_WEIGHT = 4;
    private static final double DEFAULT_ELEPHANT_WEIGHT = 700;
    private static final double DEFAULT_ANIMAL_WEIGHT = 1;

    final String species;
    String name;
    Boolean isAlive;
    private Double weight;

    public Animal(String species){
        isAlive = true;
        this.species = species;
        switch(species){
            case "cenis" : this.weight = DEFAULT_DOG_WEIGHT; break;
            case "fenis" : this.weight = DEFAULT_CAT_WEIGHT; break;
            case "elephant" : this.weight = DEFAULT_ELEPHANT_WEIGHT; break;
            default : this.weight = DEFAULT_ANIMAL_WEIGHT;

        }
    }

    public void feed() {
        if (!isAlive) {
            System.out.println("Zwierze nie żyje, daj mu spokój");
        } else {
            weight += 1.0;
            System.out.println("Nakarmiłeś zwierzaka");
        }
    }

    public void takeForAWalk() {
        if (!isAlive) {
            System.out.println("Zwierze nie żyje, daj mu spokój");
        } else {
            weight -= 1.0;
            System.out.println("Wyprowadzasz zwierzaka na spacer");
            if (weight <= 0.0) {
                isAlive = false;
                System.out.println("Zabiłeś je, ty potworze");
            }
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.species + " " + this.weight;
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (this.equals(seller.getPet()) && buyer.getCash() >= price) {
            seller.setCash(seller.getCash() + price);
            buyer.setCash(buyer.getCash() - price);
            buyer.setPet(this);
            seller.setPet(null);
            System.out.println("Transakcja powiodła się");
        } else {
            System.out.println("Transakcja nie doszła do skutku");
        }
    }
}
