package learning.patterns.solid.bird.birdv3;

public class Sparrow extends BirdV3 implements Flyable, Eatable {
    @Override
    public void fly() {
        System.out.println(" Sparrow can fly ");
    }

    @Override
    public void eat() {
        System.out.println(" Sparrow can eat ");
    }
}
