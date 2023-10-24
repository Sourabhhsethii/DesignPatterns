package learning.patterns.solid.bird.birdv3;

/**
 * Two many Abstract classes or One Interface having many behaviour can lead to Class expilication or Monster Interfaces.
 * Lets say there are 10 behaviour, A class need to impletemnt all the  behaviour even its not required for that class.
 * Lead to Voilatation of ISP - Interface Segeration Principle
 * Create the separate  Interface e.f Flyable for FLY and Eatable for EAT.
 */
public abstract class BirdV3 {

    private int weight;
    private int age;
    private String colour;

    public void walk(){
        System.out.println("Bird is walking");
    }
}
