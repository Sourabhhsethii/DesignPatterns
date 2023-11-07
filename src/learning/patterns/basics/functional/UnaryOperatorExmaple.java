package learning.patterns.basics.functional;

import java.util.function.UnaryOperator;

public class UnaryOperatorExmaple {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> inc = n -> n+1;
        System.out.println(inc.andThen(square).apply(1));
    }
}
