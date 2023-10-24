package learning.patterns.solid.bird.birdv4;

/**
 * DIP - Dependency Inversion Principle!!
 * Code towards interface instead od implementation.
 * Crow & Pengiun fly in a exact same way
 * Parrot & Sparrow fly a exact sane way
 * Which leads to code duplication. Voilates DRY -> Dont Repeat yourself.
 * Sol 1 -> Create another Class with CrowPengium fly Behaviour & ParrotSparrow -> It will remove the code duplication but creates another problem of creating of object of the class in the another class.
 * Whenever we have an object of a class in a class, if in the future want to change that it can be difficult!!
 * DIP -> No 2 classes should directly depend upon each other. They should depend on each other VIA an interface!!!
 */
public abstract class BirdV4 {

    private int weight;
    private int age;
    private String colour;

    public void walk(){
        System.out.println("Bird is walking");
    }
    public abstract void fly();
}
