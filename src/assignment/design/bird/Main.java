package assignment.design.bird;

import assignment.design.bird.entities.Bird;
import assignment.design.bird.entities.Crow;
import assignment.design.bird.entities.Parrot;
import assignment.design.bird.entities.Penguin;
import assignment.design.bird.fly.CrowOwlyFlyingStyle;
import assignment.design.bird.fly.ParrotSparrowFlyingStyle;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Penguin("White",1,2);
        System.out.println(bird.getHeight());

        var bird1 = new Crow("Black", 1,2, new CrowOwlyFlyingStyle());
        System.out.println(bird1.getColour());
        bird1.letsFly();

        var bird2 = new Parrot("Green", 1,2, new ParrotSparrowFlyingStyle());
        System.out.println(bird2.getColour());
        bird2.letsFly();
    }
}
