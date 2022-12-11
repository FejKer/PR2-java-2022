public class Main {
    public static void main(String[] args) {
        /*Animal pet = new Animal("fenis");
        pet.feed();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.feed();*/

        Car porsche = new Car("red", 2050.0, "Porsche", "Cayenne");
        Human me = new Human(2002);
        me.car = porsche;
    }
}