package learning.patterns.solid.bird.birdv4;

public class Pengiun extends BirdV4 implements Eatable {
    Flying fb = new CrowPengiunlFlyingBehaviour();

    public void fly() {
        fb.makeFly();
    }

    @Override
    public void eat() {
        System.out.println("Pengiun cant eat");
    }
}
