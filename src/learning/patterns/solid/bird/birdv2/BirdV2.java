package learning.patterns.solid.bird.birdv2;

// Now we have some birds which cannot fly!!! How will you Handle them?
// It Voilates LSP -> subtype of the class should be replaceable with the base class.
// Object of the subclass should be substitutable with the type of the base class with out doing any changes in base or child class.
// This can be solved with having the interface.
// 2 Problem which leads to voilation of LSP -> child class don't know what to do with the abstract class abstract method & client calling with type abstract bird type will get exception

public abstract class BirdV2 {

    private int weight;
    private int age;
    private String colour;

    public void eat(){
        System.out.println("Bird is eating");
    }
    public void walk(){
        System.out.println("Bird is walking");
    }
}
