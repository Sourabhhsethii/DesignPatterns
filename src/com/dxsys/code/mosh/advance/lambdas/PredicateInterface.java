package com.dxsys.code.mosh.advance.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class PredicateInterface {
    public static void main(String[] args) {
        // "sky" - check if the string has more than five character
        Predicate<String> isLongerThan5 = str -> str.length() >5;
        var result = isLongerThan5.test("Hello Predicates");
        System.out.println(result);

        // Combining predicates
        Predicate<String> hasleftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        var hasleftRightBrace = hasleftBrace.and(hasRightBrace);
        var resultCheck = hasleftRightBrace.test("{ket:value{");
        System.out.println(resultCheck);

        var x  = 1 + 2;

        // Binary Operator Interface
        BinaryOperator<Integer> add = (a,b) -> a +b;

        Function<Integer,Integer> square = a -> a*a;
        var resultInteger = add.andThen(square).apply(1,2);
        System.out.println(resultInteger);

        // UnaryOperator Interface
        UnaryOperator<Integer> squre = n -> n * n;
        UnaryOperator<Integer> increment = n-> n +1;

        var resultUnary = increment.andThen(square).apply(1);
        System.out.println(resultUnary);

    }
}
