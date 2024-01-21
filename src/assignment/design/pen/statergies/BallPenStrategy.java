package assignment.design.pen.statergies;

public class BallPenStrategy implements WritingStrategy {
    @Override
    public void write() {
        System.out.println("I am writing using Ball pen!! using Ball pen Strategy");
    }
}
