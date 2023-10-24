package learning.patterns.solid.bird.birdv4;

public class Parrot extends BirdV4 {
    Flying fb = new ParrotSparrowFlyingBehaviour();
    public void fly(){
        fb.makeFly();
    }
}
