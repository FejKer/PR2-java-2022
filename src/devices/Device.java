package devices;

import creatures.Human;

public abstract class Device {
    String producer;
    String model;
    int yearOfProduction;
    boolean isOn;
    double value;

    public abstract void turnOn();

    @Override
    public String toString() {
        return this.producer + " " + this.model + " " + this.yearOfProduction;
    }

}
