package devices;

import creatures.Human;
import main.Sellable;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Phone extends Device implements Sellable {
    boolean isAndroid;
    int chargeLevel;
    private static final String DEFAULT_HOST = "www.apps.com";
    private static final String DEFAULT_PROTOCOL = "https";
    private static final String DEFAULT_VERSION = "v1.0";
    List<Application> applicationList;

    public Phone(String producer, String model, int yearOfProduction, boolean isAndroid) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.isAndroid = isAndroid;
        applicationList = new ArrayList<>();
    }

    @Override
    public void turnOn() {
        System.out.println("Wciskasz przycisk");
        System.out.println("Czekasz");
        System.out.println("Telefon bangla");
    }

    public void installAnApp(Application application, Human phoneOwner) throws Exception {
        if (phoneOwner.getCash() < application.price) throw new Exception("nie masz kaski");
        applicationList.add(application);
        phoneOwner.setCash(phoneOwner.getCash() - application.price);
    }

    public boolean checkIfAppIsInstalled(Application application) {
        return applicationList.contains(application);
    }

    public boolean checkIfAppIsInstalled(String application) {
        for (Application app:
             applicationList) {
            if (app.name.equals(application)) return true;
        }
        return false;
    }

    public void printFreeApps() {
        for (Application app:
             applicationList) {
            if (app.price == 0) {
                System.out.println("Darmowa aplikacja: " + app.name);
            }
        }
    }

    public Double getAppsWorth() {
        Double sum = 0.0;
        for (Application app:
             applicationList) {
            sum += app.price;
        }
        return sum;
    }

    public void printAppsByName() {
        List<Application> apps = applicationList;
        apps.sort(new Comparator<Application>() {
            @Override
            public int compare(Application o1, Application o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for (Application app:
             apps) {
            System.out.println("Aplikacja: " + app.name);
        }
    }

    public void printAppsByPrice() {
        List<Application> apps = applicationList;
        apps.sort(new Comparator<Application>() {
            @Override
            public int compare(Application o1, Application o2) {
                return o1.price.compareTo(o2.price);
            }
        });
        for (Application app:
                apps) {
            System.out.println("Aplikacja: " + app.name + " cena: " + app.price);
        }
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

    public void installAnnApp(String name) {
        System.out.println("Instaluję aplikację: " + name);
        System.out.println("Zakończono.");
    }

    public void installAnnApp(String name, String version) {
        System.out.println("Instaluję aplikację: " + name + " ver. " + version);
        System.out.println("Zakończono.");
    }

    public void installAnnApp(String name, String version, String serverUrl) {
        System.out.println("Instaluję aplikację: " + name + " ver. " + version + " z serwera " + serverUrl);
        System.out.println("Zakończono.");
    }

    public void installAnnApp(List<String> names) {
        System.out.println("Instaluję aplikacje:");
        names.forEach(System.out::println);
        System.out.println("Zakończono.");
    }

    public void installAnnApp(URL serverUrl) {
        System.out.println("Instaluję aplikajcję: " + serverUrl.getPath() + " ver. " + serverUrl.getQuery() + " z serwera " + serverUrl.getHost());
        System.out.println("Zakończono");
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
