package learning.patterns.solid.bird.birdv3;

public class Crow extends BirdV3 implements Flyable, Eatable {
    @Override
    public void fly() {
        System.out.println(" Crow can Fly");
    }

    @Override
    public void eat() {
        System.out.println(" Crow can Eat");
    }
}
