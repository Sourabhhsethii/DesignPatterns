package dec2023.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(SingleTon.getInstance().getValue());
        SingleTon.getInstance().setValue(20);
        System.out.println(SingleTon.getInstance().getValue());
    }
}
