package com.dxsys.code.mosh.advance.lambdas;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);

        // Imperative Programming (for, if/else, switch/case)
        for (var item: list)
            System.out.println(item);

        // Declarative Programming
            list.forEach(item-> System.out.println(item));

            List<String> listString = List.of("a","b","c");
        Consumer<String> print = item -> System.out.print(item);
        Consumer<String> printUpperCase = item -> System.out.print(item.toUpperCase());

        listString.forEach(print.andThen(printUpperCase).andThen(print));
    }
}
