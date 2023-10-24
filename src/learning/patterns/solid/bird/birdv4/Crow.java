package learning.patterns.solid.bird.birdv4;

public class Crow extends BirdV4 implements  Eatable {
    Flying fb = new CrowPengiunlFlyingBehaviour();

    public void fly() {
        fb.makeFly();
    }

    @Override
    public void eat() {
        System.out.println(" Crow can Eat");
    }
}
