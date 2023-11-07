package learning.patterns.basics.functional;

import java.util.function.Supplier;

public class SupplierInterfaceExample {
    public static void main(String[] args) {
        /**
         * Supplier have only one method. get() with no argument
         */
        Supplier<Double> getRandom = () -> Math.random();
        System.out.println(getRandom.get());
    }
}
