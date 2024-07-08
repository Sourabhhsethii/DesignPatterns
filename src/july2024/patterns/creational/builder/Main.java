package july2024.patterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        var builderPattern = BuilderPattern.getBuilder().setName("name").setNumber(1).build();
        System.out.println(builderPattern);
    }
}
