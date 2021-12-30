package com.dxsys.code.mosh.advance.lambdas;

import java.util.function.Predicate;

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

    }
}
