package Constructors;

public class Batch {
    String name;
    int strength;

    public Batch(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public Batch(Batch other) {
        this.name = other.name;
        this.strength = other.strength;;
    }


}
