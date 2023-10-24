package learning.patterns.solid.bird.birdv4;

public class Sparrow extends BirdV4 implements Eatable {
    Flying fb = new ParrotSparrowFlyingBehaviour();
    public void fly() {
        fb.makeFly();
    }

    @Override
    public void eat() {
        System.out.println(" Sparrow can eat ");
    }
}
