package learning.patterns.basics.functional;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinayOperatorsExample {
    public static void main(String[] args) {
        /**
         * Takes Two Inputs & Returns One Output
         */
        BinaryOperator<Integer> add =(a, b) -> a + b;
        Function<Integer, Integer>  squ = a-> a*a;
        System.out.println(add.andThen(squ).apply(1,2));
    }
}
