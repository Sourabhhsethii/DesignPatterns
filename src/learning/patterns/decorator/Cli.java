package learning.patterns.decorator;

public class Cli {
    public static void main(String[] args) {
        IceCream ic = new VanillaScope(new ChocolateSyrup(new OrangeCone()));
        System.out.println("Ice Cream's Cost " + ic.getCost());
        System.out.println("Ice Cream's Desc " + ic.getDesc());
    }
}
