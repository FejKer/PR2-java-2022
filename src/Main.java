import devices.Car;

public class Main {
    public static void main(String[] args) {
        Animal pet = new Animal("fenis");
        pet.feed();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.feed();

        Car porsche1 = new Car("red", 2050.0, "Porsche", "Cayenne");
        Car porsche2 = new Car("red", 2050.0, "Porsche", "Cayenne");
        porsche1.price = 120000.0;
        porsche2.price = 120000.0;
        Human me = new Human(2002);
        me.firstName = "Oskar";
        me.lastName = "MigoFigoFago";
        me.pet = pet;
        me.setCar(porsche1);
        System.out.println(me.getSalary());
        me.setSalary(10001.0);
        System.out.println(me.getSalary());
        me.setCar(porsche1);

        System.out.println();

        System.out.println(porsche1.equals(porsche2));
        System.out.println(porsche1);
        System.out.println(porsche2);
    }
}