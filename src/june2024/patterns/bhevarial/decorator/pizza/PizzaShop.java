package june2024.patterns.bhevarial.decorator.pizza;

public class PizzaShop {

    public static void main(String[] args) {

        var NewYorkCheesePizza = new DefaultVeggies(new SaltAndPepper(new Cheese(new NewYorkCrust())));
        System.out.println(NewYorkCheesePizza);
        System.out.println(NewYorkCheesePizza.getCost());
        System.out.println(NewYorkCheesePizza.getDesc());

        var ThinCrustCheesePizza = new DefaultVeggies(new SaltAndPepper(new Cheese(new ThinCrust())));
        System.out.println(ThinCrustCheesePizza);
        System.out.println(ThinCrustCheesePizza.getCost());
        System.out.println(ThinCrustCheesePizza.getDesc());
    }

}
