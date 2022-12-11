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

        Car porsche = new Car("red", 2050.0, "Porsche", "Cayenne");
        porsche.price = 120000.0;
        Human me = new Human(2002);
        me.firstName = "Oskar";
        me.lastName = "MigoFigoFago";
        me.pet = pet;
        me.setCar(porsche);
        System.out.println(me.getSalary());
        me.setSalary(10001.0);
        System.out.println(me.getSalary());
        me.setCar(porsche);
    }
}