package jan2024.patterns.facade;

public class Pay {

    boolean pay(Integer amount){
        System.out.println("Paid " + amount);
        return true;
    }
}
