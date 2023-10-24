package learning.patterns.solid.bird.birdv2;

public class Sparrow extends BirdV2 implements Flyable {
    @Override
    public void fly() {
        System.out.println(" Sparrow can fly ");
    }
}
