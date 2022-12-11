public class Animal {
    private static final double DEFAULT_DOG_WEIGHT = 10.5;
    private static final double DEFAULT_CAT_WEIGHT = 4;
    private static final double DEFAULT_ELEPHANT_WEIGHT = 700;
    private static final double DEFAULT_ANIMAL_WEIGHT = 1;

    final String species;
    String name;
    Boolean isAlive;
    Double weight;

    public Animal(String species){
        isAlive = true;
        this.species = species;
        switch(species){
            case "cenis" : this.weight = DEFAULT_DOG_WEIGHT; break;
            case "fenis" : this.weight = DEFAULT_CAT_WEIGHT; break;
            case "elephant" : this.weight = DEFAULT_ELEPHANT_WEIGHT; break;
            default : this.weight = DEFAULT_ANIMAL_WEIGHT;

        }
    }

}
