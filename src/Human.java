import devices.Car;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human {
    String firstName;
    String lastName;
    final Integer yearOfBirth;
    private Car car;
    Animal pet;
    private Double salary = 0.0;
    private LocalDateTime getSalaryDate = null;
    private Double previousSalary = 0.0;

    Human(Integer yearOfBirth){
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
        if (this.salary > car.price) {
            this.car = car;
            System.out.println("Kupiono furkę za gotówe");
        } else if (this.salary > car.price / 12) {
            this.car = car;
            System.out.println("Kupiono samochód na kredyt");
        } else {
            System.out.println("Znajdź lepszą robotę albo się doucz gościu");
        }
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.yearOfBirth + " " + this.salary;
    }
}
