package creatures;

import devices.Car;
import devices.Phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human {
    private String firstName;
    private String lastName;
    final Integer yearOfBirth;
    private Car[] garage;
    private Phone phone;
    private Animal pet;
    private Double salary = 0.0;
    private LocalDateTime getSalaryDate = null;
    private Double previousSalary = 0.0;
    private Double cash = 0.0;

    private static final int DEFAULT_GARAGE_SIZE = 5;

    public Human(Integer yearOfBirth){
        this.yearOfBirth = yearOfBirth;
        garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer yearOfBirth, Integer garageSize){
        this.yearOfBirth = yearOfBirth;
        garage = new Car[garageSize];
    }

    public Double getSalary() {
        System.out.print("Ostatnie pobieranie danych o wypłacie: ");
        System.out.println(getSalaryDate == null ? "null" : getSalaryDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        System.out.println("Poprzednia wypłata: " + previousSalary);
        getSalaryDate = LocalDateTime.now();
        previousSalary = salary;
        return salary;
    }
    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Ujemna pensja");
            return;
        }
        System.out.println("Wysłane do księgowości");
        System.out.println("Pani Hania ma przerwe na kawe to troche potrwa");
        System.out.println("Smutni panowie ze skarbówki już jadą");
        this.salary = salary;
        System.out.println("Ustawiono nową wartość pensji: " + salary);
    }

    public Car getCar(int parkingSpot) throws Exception {
        if (parkingSpot < 0 || parkingSpot >= garage.length) {
            throw new Exception("Nieprawidłowy indeks");
        }
        return garage[parkingSpot];
    }
    public void setCar(Car car, int parkingSpot) throws Exception {
        if (parkingSpot < 0 || parkingSpot >= garage.length || garage[parkingSpot] != null) {
            throw new Exception("Nieprawidłowy indeks");
        }
        garage[parkingSpot] = car;
/*
        if (this.salary > car.getValue()) {
            garage[parkingSpot] = car;
            System.out.println("Kupiono furkę za gotówe");
        } else if (this.salary > car.getValue() / 12) {
            garage[parkingSpot] = car;
            System.out.println("Kupiono samochód na kredyt");
        } else {
            System.out.println("Znajdź lepszą robotę albo się doucz gościu");
        }
        */


    }
    public void setCar(Car car, boolean isForSale, int parkingSpot) {            //metoda do ustawiania samochodu do testowania funkcji sell()
        garage[parkingSpot] = car;
    }

    public Double getCarsWorth() {
        double sum = 0;
        for (Car c:
             garage) {
            sum += c.getValue();
        }
        return sum;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public void sell(Human buyer, Human seller, Double price) {
        System.out.println("Nie można handlować ludźmi");
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.yearOfBirth + " " + this.salary;
    }

    public boolean hasACar(Car car) {
        for (Car c:
             garage) {
            if (c.equals(car)) return true;
        }
        return false;
    }

    public boolean hasSpace() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) return true;
        }
        return false;
    }

    public void addCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                garage[i] = car;
                return;
            }
        }
    }

    public void removeCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == car) {
                garage[i] = null;
                return;
            }
        }
    }
}
