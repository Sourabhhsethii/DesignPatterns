package assignment.design.bird.fly;

/**
 * This class is the concrete class of Flying Behaviour !!
 */
public class ParrotSparrowFlyingStyle implements Flying {
    @Override
    public void makeFly(BirdType birdType) {
        System.out.println("I am flying like " + birdType);
    }
}
