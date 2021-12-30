package com.dxsys.code.mosh.advance.lambdas;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {
        Function<String,Integer> map = str -> str.length();
        var lenght = map.apply("SKY");
        System.out.println(lenght);

        show();
    }

    // Composing Functions - Declarative  Programming
    public static void show() {
        // "key:value"
        // first: "key=value"
        // second: "{key=value}"

        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";
        var result = replaceColon
                .andThen(addBraces)
                .apply("key:value");

        // reverse order of composing functions using compose
        var reverseResult  = addBraces.compose(replaceColon).apply("key:value");


        System.out.println(result);
        System.out.println(reverseResult);
    }

}
