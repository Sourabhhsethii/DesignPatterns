package learning.patterns.solid.bird.birdv1;

// Only Common Behaviour in the class.
// Into to Inheritance.
// Bird1 will be Genral class which will be implemented by Specific class.
// Bird1 is genric class hence, it not required to create object, we can make it abstract class.
public abstract class Bird1 {

    private int weight;
    private int age;
    private String colour;

    public void eat(){
        System.out.println("Bird is eating");
    }

    public void walk(){
        System.out.println("Bird is walking");
    }

    abstract public void fly();

}
