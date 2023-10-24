package learning.patterns.solid.bird.birdv2;

public class Pengiun extends BirdV2 implements NonFlyable{
    @Override
    public void cantfly() {
        System.out.println("Pengiun cant fly");
    }
}
