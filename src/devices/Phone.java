package devices;

public class Phone extends Device {
    boolean isAndroid;
    int chargeLevel;

    public Phone(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
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
}
