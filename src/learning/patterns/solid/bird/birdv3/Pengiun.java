package learning.patterns.solid.bird.birdv3;

public class Pengiun extends BirdV3 implements NonFlyable, Eatable {
    @Override
    public void cantfly() {
        System.out.println("Pengiun cant fly");
    }

    @Override
    public void eat() {
        System.out.println("Pengiun cant eat");
    }
}
