package creatures;

import devices.Car;
import devices.Phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human {
    private String firstName;
    private String lastName;
    final Integer yearOfBirth;
    private Car car;
    private Phone phone;
    private Animal pet;
    private Double salary = 0.0;
    private LocalDateTime getSalaryDate = null;
    private Double previousSalary = 0.0;
    private Double cash = 0.0;

    public Human(Integer yearOfBirth){
        this.yearOfBirth = yearOfBirth;
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

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        if (this.salary > car.getPrice()) {
            this.car = car;
            System.out.println("Kupiono furkę za gotówe");
        } else if (this.salary > car.getPrice() / 12) {
            this.car = car;
            System.out.println("Kupiono samochód na kredyt");
        } else {
            System.out.println("Znajdź lepszą robotę albo się doucz gościu");
        }
    }
    public void setCar(Car car, boolean isForSale) {            //metoda do ustawiania samochodu do testowania funkcji sell()
        this.car = car;
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
}
