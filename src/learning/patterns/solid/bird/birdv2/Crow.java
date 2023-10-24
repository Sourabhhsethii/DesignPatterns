package learning.patterns.solid.bird.birdv2;

public class Crow extends BirdV2 implements Flyable{
    @Override
    public void fly() {
        System.out.println(" Crow can Fly");
    }
}
