package main;

import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import devices.*;

public class Main {
    public static void main(String[] args) throws Exception {
     /*   Animal pet = new Pet("fenis");
        pet.feed();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.feed();

        Car porsche1 = new Electric("red", 2050.0, "Porsche", "Cayenne");
        Car porsche2 = new LPG("red", 2050.0, "Porsche", "Cayenne");
        porsche1.setValue(120000.0);
        porsche2.setValue(120000.0);
        Human me = new Human(2002);
        me.setFirstName("Oskar");
        me.setLastName("MigoFigoFago");
        me.setPet(pet);
        me.setCar(porsche1, 1);
        System.out.println(me.getSalary());
        me.setSalary(10001.0);
        System.out.println(me.getSalary());
        me.setCar(porsche1,2);

        System.out.println();


        Phone phone = new Phone("samsung", "galaxy s4", 2005, true);
        phone.turnOn();

        System.out.println();

        Car forSale = new Diesel("red", 1000.0, "Ford", "Fiesta");
        forSale.setValue(5000.0);
        Human seller = new Human(2000);
        Human buyer = new Human(2000);
        seller.setCar(forSale, 2);               //true w celu wywołania przeciążonej metody setCar, która domyślnie sprawdza naszą pensję
        buyer.setCash(5000.0);
        forSale.sell(buyer, seller, 4000.0);
        System.out.println(seller.getCash() + " " + buyer.getCash());

        System.out.println();

        seller.setPhone(phone);
        phone.sell(buyer, seller, 500.0);
        System.out.println(seller.getCash() + " " + buyer.getCash());
        System.out.println(seller.getPhone() + " " + buyer.getPhone());
*/
        System.out.println("=================================");

        Phone phoneTest = new Phone("Samsung", "Galaxy", 2017, true);
        Human humanTest = new Human(2010);
        humanTest.setCash(1000.0);
        Application free = new Application("FreeApp", "v1.0", 0.0);
        Application paid = new Application("PaidApp", "v1.0", 10.0);
        Application expensive = new Application("ExpensiveApp", "v1.0", 100.0);

        phoneTest.installAnApp(free, humanTest);
        phoneTest.installAnApp(paid, humanTest);
        phoneTest.installAnApp(expensive, humanTest);

        phoneTest.printAppsByName();
        phoneTest.printAppsByPrice();
        System.out.println(phoneTest.checkIfAppIsInstalled("FreeApp"));
        System.out.println(phoneTest.checkIfAppIsInstalled(free));
    }
}