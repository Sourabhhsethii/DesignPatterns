package assignment.design.pen.statergies;

public class GelPenStrategy implements WritingStrategy{
    @Override
    public void write() {
        System.out.println("I am writing using Gel pen!! using Gel pen Strategy");
    }
}
